package com.springcore.constructor;

public class Person {
	private int personId;
	private String name;
	private Certi certi;
	
	public Person(String name,int personId,Certi certi) {
		this.name = name;
		this.personId = personId;
		this.certi = certi;
	}

	@Override
	public String toString() {
		return this.name+" : "+this.personId+"{"+this.certi.name+"}";
	}
}