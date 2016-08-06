package team.hnucs.edu.action.admin;

import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

import team.hnucs.edu.entity.Student;
import team.hnucs.edu.entity.Teacher;
import team.hnucs.edu.service.TeacherService;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class AdminManageTeacherAction extends ActionSupport implements SessionAware, ModelDriven<Teacher>{
	private Teacher teacher = new Teacher();
	private TeacherService teacherService;
	private Map<String, Object> session;
	@Override
	public Teacher getModel() {
		// TODO Auto-generated method stub
		return teacher;
	}

	public void setTeacherService(TeacherService teacherService) {
		this.teacherService = teacherService;
	}

	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		this.session = arg0;
	}
	public String save() throws UnsupportedEncodingException, ParseException{
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setCharacterEncoding("utf-8");
		String birth = request.getParameter("teaBir");
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date = format.parse(birth);
		teacher.setTeaBirth(date);	
		String type = request.getParameter("userType");
		if(type.equals("����Ա"))
			teacher.setType(false);
		else if(type.equals("��ʦ"))
			teacher.setType(true);
		teacherService.save(teacher);
		return "save";
	}
	public String update() throws UnsupportedEncodingException, ParseException{
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setCharacterEncoding("utf-8");
		String birth = request.getParameter("teaBir");
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date = format.parse(birth);
		teacher.setTeaBirth(date);	
		String type = request.getParameter("userType");
		if(type.equals("����Ա"))
			teacher.setType(false);
		else if(type.equals("��ʦ"))
			teacher.setType(true);
		teacherService.updateInfo(teacher);
		return "update";
	}
}