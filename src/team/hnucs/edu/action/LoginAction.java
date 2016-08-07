package team.hnucs.edu.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import team.hnucs.edu.entity.Teacher;
import team.hnucs.edu.service.StudentService;
import team.hnucs.edu.service.TeacherService;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware{
	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	private String type;
	private Map<String, Object> session;
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
	private StudentService studentService;
	private TeacherService teacherService;
	public void setStudentService(StudentService studentService){
		this.studentService = studentService;
	}
	public void setTeacherService(TeacherService teacherService){
		this.teacherService = teacherService;
	}
	public StudentService getStudentService(){
		return studentService;
	}
	public TeacherService getTeacherService(){
		return teacherService;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		this.session = session;
	}
	public String login(){
		System.out.println("Hello");
		if(type.equals("学生")){
			if(studentService.checkLogIn(username, password)){
				session.put("username", username);
				return "student";
			}
			else
				return "loginError";
		}
		else if(type.equals("老师")){
			Teacher tea = teacherService.checkLogIn(username, password);
			if(tea != null){
				session.put("username", username);
				return "teacher";
			}
			else
				return "loginError";
		}
		else if(type.equals("管理员")){
			Teacher admin = teacherService.checkLogIn(username, password);
			if(admin.getType()){
				session.put("username", username);
				return "admin";
			}
			else
				return "loginError";
		}
		return "loginError";
	}
	public String execute(){
		return "homepage";
	}
}
