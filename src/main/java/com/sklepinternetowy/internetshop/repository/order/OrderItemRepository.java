package com.sklepinternetowy.internetshop.repository.order;

import com.sklepinternetowy.internetshop.model.order.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
