package team.hnucs.edu.action.student;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.RequestAware;

import team.hnucs.edu.entity.Course;
import team.hnucs.edu.entity.CourseSelection;
import team.hnucs.edu.service.CourseSelectionService;
import team.hnucs.edu.service.CourseService;
import team.hnucs.edu.service.StudentService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class StudentManageCourseSelectionAction  extends ActionSupport implements RequestAware{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private CourseSelectionService courSelService;
	private StudentService studentService;
	private CourseService courseService;
	private Map<String, Object> req;
	@Override
	public void setRequest(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		this.req = arg0;
	}
	public String selectCourse(){
		ActionContext context = ActionContext.getContext();
		String stuNum = (String) context.getSession().get("username");
		HttpServletRequest request = ServletActionContext.getRequest();
		String courNum = request.getParameter("courNum");
		String teaNum = request.getParameter("teaNum");
		courSelService.select(stuNum, courNum, teaNum);
		return "selectCourse";
	}
	public String queryCourse(){
		ActionContext context = ActionContext.getContext();
		String stuNum = (String) context.getSession().get("username");
		List<CourseSelection> list = studentService.queryCourseSelectionResult(stuNum);
		req.put("courSelList", list);
		return "querySelectionResult";
	}
	public String findRemainCourse(){
		List<Course> courList = courseService.findRemainingCourse();
		req.put("remainCourseList", courList);
		return "findRemain";
	}
}
