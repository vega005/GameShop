package com.sklepinternetowy.internetshop.model;

import com.sklepinternetowy.internetshop.Category;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
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

    public Item(String name, BigDecimal price, String imgUrl) {
        this.name = name;
        this.price = price;
        this.imgUrl = imgUrl;
    }


//    public Item(Long id, String name, String description, BigDecimal price, BigDecimal min_price, Boolean used, int available, float discount, Category category, String imgUrl) {
//        this.id = id;
//        this.name = name;
//        this.description = description;
//        this.price = price;
//        this.min_price = min_price;
//        this.used = used;
//        this.available = available;
//        this.discount = discount;
//        this.category = category;
//        this.imgUrl = imgUrl;
//    }
}
