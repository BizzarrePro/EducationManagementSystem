package team.hnucs.edu.action.admin;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import team.hnucs.edu.entity.Course;
import team.hnucs.edu.entity.Score;
import team.hnucs.edu.entity.ScoreId;
import team.hnucs.edu.entity.Student;
import team.hnucs.edu.service.CourseService;
import team.hnucs.edu.service.ScoreService;
import team.hnucs.edu.service.StudentService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class AdminManageScoreAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ScoreService scoreService;
	private StudentService studentService;
	private CourseService courseService;

	public void setScoreService(ScoreService scoreService) {
		this.scoreService = scoreService;
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
}
