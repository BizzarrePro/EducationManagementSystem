package team.hnucs.edu.action.teacher;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.RequestAware;

import team.hnucs.edu.entity.Course;
import team.hnucs.edu.entity.Score;
import team.hnucs.edu.entity.ScoreId;
import team.hnucs.edu.entity.Student;
import team.hnucs.edu.service.CourseService;
import team.hnucs.edu.service.ScoreService;
import team.hnucs.edu.service.StudentService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class TeacherManageStudentAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ScoreService scoreService;
	private StudentService studentService;
	public void setScoreService(ScoreService scoreService) {
		this.scoreService = scoreService;
	}
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
	public void setCourseService(CourseService courseService) {
		this.courseService = courseService;
	}
	private CourseService courseService;
	public String saveScore(){
		HttpServletRequest request = ServletActionContext.getRequest();
		ActionContext context = ActionContext.getContext();
		String teaNum = (String)context.getSession().get("username");
		String stuNum = request.getParameter("stuNum");
		String courName = request.getParameter("courName");
		Byte semester = Byte.parseByte(request.getParameter("semester"));
		Byte score = Byte.parseByte(request.getParameter("score"));
		if(teaNum != null){
			Student stu = studentService.queryById(stuNum);
			Course cour = courseService.findByTeaAndCour(teaNum, courName);
			scoreService.add(new Score(new ScoreId(stu, cour, semester, score), stu, cour));
			return "save";
		}
		return "error";
	}
	public String deleteScore(){
		HttpServletRequest request = ServletActionContext.getRequest();
		String stuNum = request.getParameter("stuNum");
		String courName = request.getParameter("courName");
		scoreService.delete(courName, stuNum);
		return "delete";
	}
}
