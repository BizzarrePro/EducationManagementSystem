package team.hnucs.edu.action.admin;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

import team.hnucs.edu.entity.Course;
import team.hnucs.edu.entity.Student;
import team.hnucs.edu.entity.Teacher;
import team.hnucs.edu.service.CourseService;
import team.hnucs.edu.service.TeacherService;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class AdminManageCourseAction extends ActionSupport implements ModelDriven<Course>{
	private Course course = new Course();
	private CourseService courseService;
	private TeacherService teacherService;
	
	public void setTeacherService(TeacherService teacherService) {
		this.teacherService = teacherService;
	}

	public void setCourseService(CourseService courseService) {
		this.courseService = courseService;
	}

	@Override
	public Course getModel() {
		// TODO Auto-generated method stub
		return course;
	}
	public String save() throws ParseException{
		HttpServletRequest request = ServletActionContext.getRequest();
		String teacher = request.getParameter("tea");
		Teacher tea = teacherService.queryById(teacher);
		course.setTeacher(tea);
		String courStart = request.getParameter("courStart");
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date = format.parse(courStart);
		course.setCourStartDate(date);
		courseService.save(course);
		return "save";
	}
	public String delete(){
		HttpServletRequest request = ServletActionContext.getRequest();
		String courseNum = request.getParameter("courseNum");
		courseService.delete(courseNum);
		return "delete";
	}


}
