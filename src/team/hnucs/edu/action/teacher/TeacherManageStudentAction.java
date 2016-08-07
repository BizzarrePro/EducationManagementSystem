package team.hnucs.edu.action.teacher;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.RequestAware;

import team.hnucs.edu.service.ScoreService;

import com.opensymphony.xwork2.ActionSupport;

public class TeacherManageStudentAction extends ActionSupport {
	private ScoreService scoreService;
	private StudentService studentService;
	private CourseService courseService;
	public String saveScore(){
		HttpServletRequest request = ServletActionContext.getRequest();
		String stuNum = request.getParameter("stuNum");
		String courNum = request.getParameter("courNum");
		String semester = request.getParameter("semester");
		String score = request.getParameter("score");
		
		return "save";
	}
}
