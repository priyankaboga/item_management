package com.infy.item_management.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infy.item_management.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Integer> {

}
