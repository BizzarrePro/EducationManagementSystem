package team.hnucs.edu.action.student;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import team.hnucs.edu.dao.ExamArrangementDAO;
import team.hnucs.edu.entity.ExamArrangement;
import team.hnucs.edu.service.ExamArrangementService;
import team.hnucs.edu.service.StudentService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class StudentManageExamAction  extends ActionSupport implements RequestAware{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ExamArrangementService examService;
	private StudentService studentService;
	public void setExamService(ExamArrangementService examService) {
		this.examService = examService;
	}
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
	private Map<String, Object> req;
	@Override
	public void setRequest(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		this.req = arg0;
	}
	public String queryExamination(){
		ActionContext context = ActionContext.getContext();
		String stuNum = (String) context.getSession().get("username");
		List<ExamArrangement> exam = studentService.queryExamRoom(stuNum);
		req.put("examlist", exam);
		return "examination";
	}
}
