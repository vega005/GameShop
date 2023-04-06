package com.sklepinternetowy.internetshop.service;

import com.sklepinternetowy.internetshop.Cart;
import com.sklepinternetowy.internetshop.dto.OrderDto;
import com.sklepinternetowy.internetshop.mapper.OrderMapper;
import com.sklepinternetowy.internetshop.model.order.Order;
import com.sklepinternetowy.internetshop.model.order.OrderItem;
import com.sklepinternetowy.internetshop.repository.order.OrderItemRepository;
import com.sklepinternetowy.internetshop.repository.order.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private final Cart cart;
    private final OrderRepository orderRepository;
    private final OrderItemRepository orderItemRepository;

    @Autowired
    public OrderService(Cart cart, OrderRepository orderRepository, OrderItemRepository orderItemRepository) {
        this.cart = cart;
        this.orderRepository = orderRepository;
        this.orderItemRepository = orderItemRepository;
    }

    public void saveOrder(OrderDto orderDto) {
        Order order = OrderMapper.mapToOrder(orderDto);
        orderRepository.save(order);
        orderItemRepository.saveAll(OrderMapper.mapToOrderItemList(cart, order));
        cart.cleanCart();
    }
}
