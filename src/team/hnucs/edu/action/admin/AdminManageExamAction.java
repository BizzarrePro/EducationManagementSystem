package team.hnucs.edu.action.admin;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import team.hnucs.edu.entity.Course;
import team.hnucs.edu.entity.ExamArrangement;
import team.hnucs.edu.entity.ExamArrangementId;
import team.hnucs.edu.entity.Student;
import team.hnucs.edu.service.CourseService;
import team.hnucs.edu.service.ExamArrangementService;
import team.hnucs.edu.service.StudentService;

import com.opensymphony.xwork2.ActionSupport;

public class AdminManageExamAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ExamArrangementService examArrangeService;
	private StudentService studentService;
	private CourseService courseService;
	public void setExamArrangeService(ExamArrangementService examArrangeService) {
		this.examArrangeService = examArrangeService;
	}
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
	public void setCourseService(CourseService courseService) {
		this.courseService = courseService;
	}
	public String arrangeExamination(){
		HttpServletRequest request = ServletActionContext.getRequest();
		String stuNum = request.getParameter("stuNum");
		String courNum = request.getParameter("courNum");
		String examAddr = request.getParameter("examAddr");
		String seatId = request.getParameter("seatId");
		String examTime = request.getParameter("examTime");
		Student stu = studentService.queryById(stuNum);
		Course cour = courseService.findById(courNum);
		ExamArrangementId eaId = new ExamArrangementId(cour, examAddr, Short.parseShort(seatId), stu, examTime);
		ExamArrangement ea = new ExamArrangement(eaId, stu, cour);
		examArrangeService.assignExamination(ea);
		return "arrange";
	}
}
