package com.test.model;

public class Employee {
	private int id;
	private String name;
	private String country;
	
	public Employee() {
		
	}
	
	public Employee(int id, String name, String country) {
		super();
		this.id = id;
		this.name = name;
		this.country = country;
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	
}
