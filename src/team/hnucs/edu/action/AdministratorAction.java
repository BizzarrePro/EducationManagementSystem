package team.hnucs.edu.action;

import java.util.Date;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.springframework.context.annotation.Scope;

import team.hnucs.edu.entity.Student;
import team.hnucs.edu.service.StudentService;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
@Scope("prototype")
public class AdministratorAction extends ActionSupport implements SessionAware, ModelDriven<Student>{
	private Student stu = new Student();
	private StudentService stuService;
	public void setStuService(StudentService stuService) {
		this.stuService = stuService;
	}
	private Map<String, Object> session;
	@Override
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		this.session = session;
	}

	@Override
	public Student getModel() {
		// TODO Auto-generated method stub
		return stu;
	}
	public String saveInfo(){
		stuService.save(stu);
		return "student";
	}

}
