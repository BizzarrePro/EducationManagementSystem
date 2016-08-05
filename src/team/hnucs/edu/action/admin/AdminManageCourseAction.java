package team.hnucs.edu.action.admin;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import team.hnucs.edu.entity.Course;
import team.hnucs.edu.entity.Student;
import team.hnucs.edu.service.CourseService;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class AdminManageCourseAction extends ActionSupport implements ModelDriven<Course>{
	private Course course = new Course();
	private CourseService courseService;
	
	public void setCourseService(CourseService courseService) {
		this.courseService = courseService;
	}

	@Override
	public Course getModel() {
		// TODO Auto-generated method stub
		return course;
	}
	public String save(){
		
		
		return "save";
	}


}
