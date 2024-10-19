package com.springcore.lifecycle;

public class Item {
	private double price;

	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		System.out.println("Setting price");
		this.price = price;
	}

	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Item [price=" + price + "]";
	}
	
	public void init() { //We can chnage there names to anything
		System.out.println("Inside init method");
	}
	
	public void destroy() { //We can chnage there names to anything
		System.out.println("Inside destroy method");
	}
}