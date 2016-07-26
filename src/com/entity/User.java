package com.entity;

public class User {
	private String name;
	private String attribute;
	public User(){
		
	}
	public User(String name, String attribute){
		this.name = name;
		this.attribute = attribute;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAttribute() {
		return attribute;
	}
	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}
	
}
