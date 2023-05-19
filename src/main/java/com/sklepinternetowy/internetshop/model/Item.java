package com.sklepinternetowy.internetshop.model;

import com.sklepinternetowy.internetshop.Category;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Item {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private BigDecimal min_price;
    private Boolean used;
    private int available;
    private float discount;
    private Category category;
    private String imgUrl;

    public Item(String name, BigDecimal price, Category category, String imgUrl) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.imgUrl = imgUrl;
    }

    @Override
    public String toString() {
        String itemString = String.format("name: %1$s, price: %2$s, category: %3$s", id, name, price, category);
        return itemString;
    }
}
