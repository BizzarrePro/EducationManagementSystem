package com.action;

import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport{
	private String hello;
	public String getHello(){
		return hello;
	}
	public void setHello(String hello){
		this.hello = hello;
	}
	public String execute(){
		hello = "hello, world";
		return hello;
	}
	
}
