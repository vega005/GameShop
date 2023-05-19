package com.sklepinternetowy.internetshop.service;

import com.sklepinternetowy.internetshop.Cart;
import com.sklepinternetowy.internetshop.Category;
import com.sklepinternetowy.internetshop.ItemOperation;
import com.sklepinternetowy.internetshop.model.Item;
import com.sklepinternetowy.internetshop.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CartService {

    private final ItemRepository itemRepository;
    private final Cart cart;

    @Autowired
    public CartService(ItemRepository itemRepository, Cart cart) {
        this.itemRepository = itemRepository;
        this.cart = cart;
    }

    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }
    public List<Item> getAllPlaystation() {
        return itemRepository.findByCategory(Category.PLAYSTATION);
    }
    public List<Item> getAllXbox() {
        return itemRepository.findByCategory(Category.XBOX);
    }
    public List<Item> getAllPC() {
        return itemRepository.findByCategory(Category.PC);
    }

    public List<Item> getAllNintendo() {
        return itemRepository.findByCategory(Category.NINTENDO);
    }

    public void itemOperation(Long itemId, ItemOperation itemOperation) {
        Optional<Item> oItem = itemRepository.findById(itemId);
        if (oItem.isPresent()) {
            Item item = oItem.get();
            switch (itemOperation) {
                case INCREASE -> cart.addItem(item);
                case DECREASE -> cart.decreaseItem(item);
                case REMOVE -> cart.removeAllItems(item);
                default -> throw new IllegalArgumentException();
            }
        }
    }
}
