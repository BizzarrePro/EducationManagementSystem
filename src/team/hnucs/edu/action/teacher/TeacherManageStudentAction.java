package team.hnucs.edu.action.teacher;

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
import team.hnucs.edu.service.TeacherService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class TeacherManageStudentAction extends ActionSupport implements RequestAware{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private TeacherService teacherService;
	private Map<String, Object> req;
	public void setTeacherService(TeacherService teacherService) {
		this.teacherService = teacherService;
	}
	@Override
	public void setRequest(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		this.req = arg0;
	}
	public String queryStudentOfCourse(){
		ActionContext context = ActionContext.getContext();
		String teaNum = (String) context.getSession().get("username");
		HttpServletRequest request = ServletActionContext.getRequest();
		String courName = request.getParameter("courName");
		List<Student> stuList = teacherService.queryStuOfCourse(teaNum, courName);
		req.put("stuList", stuList);
		return "queryStudentOfScore";
	}
	public String queryScoreOfClass(){
		ActionContext context = ActionContext.getContext();
		String teaNum = (String) context.getSession().get("username");
		HttpServletRequest request = ServletActionContext.getRequest();
		String courName = request.getParameter("courName");
		List<Score> sc = teacherService.queryAllStudentScore(teaNum, courName);
		req.put("scoreList", sc);
		return "queryScoreOfClass";
	}
}
