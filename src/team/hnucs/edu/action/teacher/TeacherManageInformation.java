package team.hnucs.edu.action.teacher;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.http.HttpRequest;

import team.hnucs.edu.entity.Teacher;
import team.hnucs.edu.service.TeacherService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class TeacherManageInformation extends ActionSupport implements ModelDriven<Teacher>{
	private TeacherService teacherService;
	private Teacher tea = new Teacher();
	public void setTeacherService(TeacherService teacherService) {
		this.teacherService = teacherService;
	}
	public String query(){
		ActionContext context = ActionContext.getContext();
		String teaNum = (String) context.getSession().get("username");
		Teacher tea = teacherService.queryById(teaNum);
		context.put("teaInfo", tea);
		return "query";
	}
	public String update(){
		HttpServletRequest request = ServletActionContext.getRequest();
		
		return "update";
	}
	@Override
	public Teacher getModel() {
		// TODO Auto-generated method stub
		return tea;
	}
}
