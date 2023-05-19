package com.sklepinternetowy.internetshop.controller;

import com.sklepinternetowy.internetshop.ItemOperation;
import com.sklepinternetowy.internetshop.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HomeController {

    private final CartService cartService;

    @Autowired
    public HomeController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("items", cartService.getAllItems());
        return "home";
    }
    @GetMapping("/playstation")
    public String playstation(Model model) {
        model.addAttribute("items", cartService.getAllPlaystation());
        return "playstation";
    }
    @GetMapping("/x-box")
    public String xbox(Model model) {
        model.addAttribute("items", cartService.getAllXbox());
        return "x-box";
    }
    @GetMapping("/pc")
    public String pc(Model model) {
        model.addAttribute("items", cartService.getAllPC());
        return "pc";
    }
    @GetMapping("/nintendo")
    public String nintendo(Model model) {
        model.addAttribute("items", cartService.getAllNintendo());
        return "nintendo";
    }

    @GetMapping("/add/{itemId}")
    public String addItemToCart(@PathVariable("itemId") Long itemId, Model model) {
        cartService.itemOperation(itemId, ItemOperation.INCREASE);
        model.addAttribute("items", cartService.getAllItems());
        return "home";
    }
}
