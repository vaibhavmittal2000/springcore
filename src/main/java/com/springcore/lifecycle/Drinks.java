package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Drinks {
	private String subject;

	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public Drinks() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Drinks [subject=" + subject + "]";
	}
	
	@PostConstruct
	public void start() {
		System.out.println("Initializing");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("Destroying");
	}
}