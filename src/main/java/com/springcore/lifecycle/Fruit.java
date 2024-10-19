package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Fruit implements InitializingBean,DisposableBean {
	private double price;

	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	public Fruit() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Fruit [price=" + price + "]";
	}
	
	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside init");
	}
	
	public void destroy() throws Exception {
		System.out.println("Inside destroy");
	}
}