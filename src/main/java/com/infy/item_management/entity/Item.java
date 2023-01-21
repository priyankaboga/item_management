package com.infy.item_management.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Items")
public class Item {
	@Id
	@Column(name = "item_id")
	private int id;
	@Column(name = "item_name")
	private String name;
	@Column(name = "item_type")
	private String type;
	
	private double cost;
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Item(int id, String name, String type, double cost) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.cost = cost;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", type=" + type + ", cost=" + cost + "]";
	}
}
