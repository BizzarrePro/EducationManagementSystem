package com.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.entity.User;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class LoginAction extends ActionSupport implements ModelDriven<User>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private User user1 = new User();
	private ArrayList<ArrayList<User>> primeList = new ArrayList<ArrayList<User>>(); 
	public String execute() throws Exception{
		ActionContext context = ActionContext.getContext();
		context.put("user1", getModel());
		User user = new User("Hi", "I am No.2");
		setUser(user);
		ArrayList<User> list = new ArrayList<User>();
		list.add(new User("12222","hahaa"));
		list.add(new User("23333","hahaa"));
		list.add(new User("34444","hahaa"));
		ArrayList<User> list1 = new ArrayList<User>();
		list1.add(new User("wahaha","hahha"));
		primeList.add(list);
		primeList.add(list1);
		context.put("list", primeList);
		return SUCCESS;
	}
	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user1;
	}
	public void setUser(User user){
		this.user1 = user;
	}
	
}
