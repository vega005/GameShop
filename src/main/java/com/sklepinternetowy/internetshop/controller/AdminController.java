package com.sklepinternetowy.internetshop.controller;

import com.sklepinternetowy.internetshop.Category;
import com.sklepinternetowy.internetshop.model.Item;
import com.sklepinternetowy.internetshop.model.order.Order;
import com.sklepinternetowy.internetshop.repository.ItemRepository;
import com.sklepinternetowy.internetshop.repository.order.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.reflect.Array;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {

    private final ItemRepository itemRepository;
    private final OrderRepository orderRepository;
    private Item item;
    private String example;
    @Autowired
    public AdminController(ItemRepository itemRepository, OrderRepository orderRepository) {
        this.itemRepository = itemRepository;
        this.orderRepository = orderRepository;
    }
    @GetMapping
    private String adminPage(Model model) {
        Category categories[] = Category.values();
        model.addAttribute("categories", categories);
        return "adminview/addItem";
    }

    @PostMapping()
    private String addItem(Item item) {
        itemRepository.save(item);
        return "redirect:/";
    }
    @GetMapping("/showorders")
    @ResponseBody
    public List<Order> showOrders() {
        return orderRepository.findAll();
    }
}
