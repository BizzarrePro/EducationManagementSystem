package team.hnucs.edu.action;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class StudentAction extends ActionSupport{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	private String type;
	public String getUsername(){
		return username;
	}
	public String getPassword(){
		return password;
	}
	public String getType(){
		return type;
	}
	public void setUsername(String username){
		this.username = username;
	}
	public void setPassword(String password){
		this.password = password;
	}
	public void setType(String type){
		this.type = type;
	}
	public String login(){
		switch(type){
		case "学生":
			return "student";
		case "老师":
			return "teacher";
		case "管理员":
			return "admin";
		}
		return "error";
	}
	public String execute(){
		return "success";
	}
}
