package team.hnucs.edu.action.admin;

import java.util.List;
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

public class AdminManageScoreAction extends ActionSupport implements RequestAware{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ScoreService scoreService;
	private StudentService studentService;
	private CourseService courseService;
	private Map<String, Object> req;
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
	public void setCourseService(CourseService courseService) {
		this.courseService = courseService;
	}
	public void setScoreService(ScoreService scoreService) {
		this.scoreService = scoreService;
	}
	@Override
	public void setRequest(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		req = arg0;
	}
	public String save(){
		HttpServletRequest request = ServletActionContext.getRequest();
		String teaNum = request.getParameter("teaNum");
		String stuNum = request.getParameter("stuNum");
		String courName = request.getParameter("courName");
		Byte semester = Byte.parseByte(request.getParameter("semester"));
		Byte score = Byte.parseByte(request.getParameter("score"));
		if(teaNum != null){
			Student stu = studentService.queryById(stuNum);
			Course cour = courseService.findByTeaAndCour(teaNum, courName);
			scoreService.add(new Score(new ScoreId(stu, cour, semester, score), stu, cour));
			return "saveScore";
		}
		return "error";
	}
	public String delete(){
		HttpServletRequest request = ServletActionContext.getRequest();
		String stuNum = request.getParameter("stuNum");
		String courName = request.getParameter("courName");
		scoreService.delete(courName, stuNum);
		return "delete";
	}
	public String update(){
		HttpServletRequest request = ServletActionContext.getRequest();
		String stuNum = request.getParameter("stuNum");
		String courName = request.getParameter("courName");
		Byte score = Byte.parseByte(request.getParameter("score"));
		scoreService.updateScore(stuNum, courName, score);
		return "update";
	}
	//
	public String findById(){
		HttpServletRequest request = ServletActionContext.getRequest();
		String stuNum = request.getParameter("stuNum");
		List<Score> scList = scoreService.findById(stuNum);
		req.put("scoreList", scList);
		return "findById";
	}
	//
	public String findAll(){
		HttpServletRequest request = ServletActionContext.getRequest();
		String courName = request.getParameter("courName");
		List<Score> scList = scoreService.findAllbyCourse(courName);
		req.put("scoreList", scList);
		return "findAll";
	}

}
