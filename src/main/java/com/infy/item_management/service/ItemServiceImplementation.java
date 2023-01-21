package com.infy.item_management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.infy.item_management.dao.ItemRepository;
import com.infy.item_management.entity.Item;

@Service
public class ItemServiceImplementation implements ItemService{
	
	@Autowired
	private ItemRepository itemRepo;
	
	@Override
	public Item addItem(Item i) {
		itemRepo.save(i);
		return i;
	}

	@Override
	public Item getItem(int id) {
		return itemRepo.findById(id).orElse(null);
	}

	@Override
	public List<Item> getAllItem() {
		return itemRepo.findAll();
	}

	@Override
	public Item updateItem(int id, Item newItem) {
		Item oldItem = itemRepo.findById(id).orElse(null);
		if(oldItem != null) {
			oldItem.setName(newItem.getName());
			oldItem.setType(newItem.getType());
			oldItem.setCost(newItem.getCost());
			itemRepo.save(oldItem);
			return oldItem;
		}
		return null;
	}

	@Override
	public String deleteItem(int id) {
		Item item = itemRepo.findById(id).orElse(null);
		if(item != null)
		{
			itemRepo.delete(item);
			return "Item Deleted";
		}
		return "Item Unavailable";
	}

}
