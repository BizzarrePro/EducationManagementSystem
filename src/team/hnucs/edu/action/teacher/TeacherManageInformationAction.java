package team.hnucs.edu.action.teacher;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.RequestAware;
import org.springframework.http.HttpRequest;

import team.hnucs.edu.entity.Course;
import team.hnucs.edu.entity.Student;
import team.hnucs.edu.entity.Teacher;
import team.hnucs.edu.service.ScoreService;
import team.hnucs.edu.service.TeacherService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class TeacherManageInformationAction extends ActionSupport implements RequestAware, ModelDriven<Teacher>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private TeacherService teacherService;
	private Teacher tea = new Teacher();
	private Map<String, Object> req;
	public void setTeacherService(TeacherService teacherService) {
		this.teacherService = teacherService;
	}
	@Override
	public Teacher getModel() {
		// TODO Auto-generated method stub
		return tea;
	}
	@Override
	public void setRequest(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		this.req = arg0;
	}
	public String update() throws ParseException{
		ActionContext context = ActionContext.getContext();
		String teaNum = (String) context.getSession().get("username");
		HttpServletRequest request = ServletActionContext.getRequest();
		String teaAge = request.getParameter("teaAge");
		String teaBirth = request.getParameter("teaBirth");
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date = format.parse(teaBirth);
		String teaContactWay = request.getParameter("teaContactWay");
		Teacher tea = teacherService.queryById(teaNum);
		tea.setTeaAge(Short.parseShort(teaAge));
		tea.setTeaBirth(date);
		tea.setTeaContactWay(teaContactWay);
		teacherService.updateInfo(tea);
		return "updateInfo";
	}
	public String updatePassword(){
		ActionContext context = ActionContext.getContext();
		String teaNum = (String) context.getSession().get("username");
		HttpServletRequest request = ServletActionContext.getRequest();
		String password = request.getParameter("password");
		teacherService.updatePassword(teaNum, password);
		return "updatePassword";
	}
	public String queryInfo(){
		ActionContext context = ActionContext.getContext();
		String teaNum = (String) context.getSession().get("username");
		Teacher tea = teacherService.queryById(teaNum);
		context.put("teaInfo", tea);
		return "queryInfo";
	}
	public String queryCourse(){
		ActionContext context = ActionContext.getContext();
		String teaNum = (String) context.getSession().get("username");
		List<Course> courList = teacherService.queryCourse(teaNum);
		req.put("courList", courList);
		return "queryCourse";
	}
}
