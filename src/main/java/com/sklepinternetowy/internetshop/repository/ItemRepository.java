package com.sklepinternetowy.internetshop.repository;

import com.sklepinternetowy.internetshop.Category;
import com.sklepinternetowy.internetshop.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

    List<Item> findByCategory(Category category);
}
