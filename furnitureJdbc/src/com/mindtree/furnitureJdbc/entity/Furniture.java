package com.mindtree.furnitureJdbc.entity;

public class Furniture {
	private int id;
	private String name;
	private double cost;
	private int quantity;
	public Furniture() {
		super();
	}
	public Furniture(int id, String name, double cost, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.quantity = quantity;
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
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Furniture [id=" + id + ", name=" + name + ", cost=" + cost + ", quantity=" + quantity + "]";
	}
}
