package com.infy.item_management.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.infy.item_management.entity.Item;

@Service
public interface ItemService {
	Item addItem(Item i);
	Item getItem(int id);
	List<Item> getAllItem();
	Item updateItem(int id, Item i);
	String deleteItem(int id);
}
