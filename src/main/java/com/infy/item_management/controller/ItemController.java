package com.infy.item_management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infy.item_management.entity.Item;
import com.infy.item_management.service.ItemService;

@RestController
public class ItemController {
	@Autowired
	private ItemService itemSvc;
	
	@PostMapping("items")
	public Item addItem(@RequestBody Item i) {
		return itemSvc.addItem(i);
	}
	
	
	@GetMapping("items")
	public List<Item> getAllItems(){
		return itemSvc.getAllItem();
	}
	
	@GetMapping("items/{id}")
	public Item  getItems(@PathVariable int id){
		return itemSvc.getItem(id);
	}
	
	@PutMapping("items/{id}")
	public Item updateItem(@PathVariable int id,@RequestBody Item i ) {
		return itemSvc.updateItem(id, i);
	}
	
	@DeleteMapping("items/{id}")
	public String deleteItem(@PathVariable int id) {
		return itemSvc.deleteItem(id);
	}
}
