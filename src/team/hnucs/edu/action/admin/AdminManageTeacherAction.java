package team.hnucs.edu.action.admin;

import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import team.hnucs.edu.entity.Student;
import team.hnucs.edu.entity.Teacher;
import team.hnucs.edu.service.TeacherService;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class AdminManageTeacherAction extends ActionSupport implements RequestAware, SessionAware, ModelDriven<Teacher>{
	private Teacher teacher = new Teacher();
	private TeacherService teacherService;
	private Map<String, Object> session;
	private Map<String, Object> req;
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
	@Override
	public void setRequest(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		this.req = arg0;
	}
	public String save() throws UnsupportedEncodingException, ParseException{
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setCharacterEncoding("utf-8");
		String birth = request.getParameter("teaBir");
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date = format.parse(birth);
		teacher.setTeaBirth(date);	
		String type = request.getParameter("userType");
		if(type.equals("管理员"))
			teacher.setType(false);
		else if(type.equals("教师"))
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
		if(type.equals("管理员"))
			teacher.setType(false);
		else if(type.equals("教师"))
			teacher.setType(true);
		teacherService.updateInfo(teacher);
		return "update";
	}
	public String delete(){
		HttpServletRequest request = ServletActionContext.getRequest();
		String teaNum = request.getParameter("teaNum");
		teacherService.delete(teaNum);
		return "delete";
	}
	//
	public String findById(){
		HttpServletRequest request = ServletActionContext.getRequest();
		String teaNum = request.getParameter("teaNum");
		Teacher tea = teacherService.queryById(teaNum);
		req.put("teacher", tea);
		return "findById";
	}
	//
	public String findAll(){
		 List<Teacher> list = teacherService.queryAll();
		 req.put("allTeacher", list);
		 return "findAll";
	}
}
