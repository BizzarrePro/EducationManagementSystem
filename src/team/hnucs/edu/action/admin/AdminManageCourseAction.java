package team.hnucs.edu.action.admin;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import team.hnucs.edu.entity.Course;
import team.hnucs.edu.entity.Student;
import team.hnucs.edu.entity.Teacher;
import team.hnucs.edu.service.CourseService;
import team.hnucs.edu.service.TeacherService;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class AdminManageCourseAction extends ActionSupport implements RequestAware, ModelDriven<Course>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Course course = new Course();
	private CourseService courseService;
	private TeacherService teacherService;
	private Map<String, Object> req;
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
	@Override
	public void setRequest(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		this.req = arg0;
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
		String courseNum = request.getParameter("courNum");
		courseService.delete(courseNum);
		return "delete";
	}
	public String update(){
		HttpServletRequest request = ServletActionContext.getRequest();
		String courNum = request.getParameter("courNum");
		String courLimitedNum = request.getParameter("courLimitedNum");
		String courCredits = request.getParameter("courCredits");
		String courType = request.getParameter("courType");
		String choosedNum = request.getParameter("choosedNum");
		Course cour = courseService.findById(courNum);
		cour.setCourLimitedNum(Short.parseShort(courLimitedNum));
		cour.setCourCredits(Short.parseShort(courCredits));
		cour.setCourType(courType);
		cour.setChoosedNum(Short.parseShort(choosedNum));
		courseService.updateCourse(cour);
		return "update";
	}
	//
	public String findByName(){
		HttpServletRequest request = ServletActionContext.getRequest();
		String courName = request.getParameter("courName");
		List<Course> courList = courseService.findByName(courName);
		req.put("courseList", courList);
		return "findByName";
	}
	//
	public String findRemainCourse(){
		List<Course> courList = courseService.findRemainingCourse();
		req.put("remainCourseList", courList);
		return "findRemain";
	}

}
