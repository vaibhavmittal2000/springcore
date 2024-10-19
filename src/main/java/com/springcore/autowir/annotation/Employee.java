package com.springcore.autowir.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	@Autowired
	@Qualifier("address1")
	private Address address;

	public Address getAddress() {
		return address;
	}
	//@Autowired
	public void setAddress(Address address) {
		System.out.println("Setting value");
		this.address = address;
	}
	
	public Employee() {
		super();
	}
	//@Autowired
	public Employee(Address address) {
		super();
		System.out.println("Constructor");
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
}