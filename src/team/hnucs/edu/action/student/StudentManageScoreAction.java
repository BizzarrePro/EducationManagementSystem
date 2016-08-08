package team.hnucs.edu.action.student;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import team.hnucs.edu.entity.Score;
import team.hnucs.edu.service.ScoreService;
import team.hnucs.edu.service.StudentService;

public class StudentManageScoreAction extends ActionSupport implements RequestAware{
	private StudentService studentService;
	private ScoreService scoreService;
	private Map<String, Object> req;
	@Override
	public void setRequest(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		this.req = arg0;
	}
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
	public void setScoreService(ScoreService scoreService) {
		this.scoreService = scoreService;
	}
	public String queryById(){
		ActionContext context = ActionContext.getContext();
		String stuNum = (String) context.getSession().get("username");
		List<Score> list = studentService.queryScore(stuNum);
		req.put("scoreList", list);
		return "queryById";
	}
	public String queryByClass(){
		return "queryByClass";
	}
	
}
