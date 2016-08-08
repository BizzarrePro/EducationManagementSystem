package team.hnucs.edu.action.student;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.RequestAware;

import team.hnucs.edu.entity.Student;
import team.hnucs.edu.service.StudentService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class StudentManageInformationAction extends ActionSupport implements RequestAware{
	private StudentService studentService;
	private Map<String, Object> req;
	@Override
	public void setRequest(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		this.req = arg0;
	}
	public String queryById(){
		ActionContext context = ActionContext.getContext();
		String stuNum = (String) context.getSession().get("username");
		Student stu = studentService.queryById(stuNum);
		req.put("stuInfo", stu);
		return "queryById";
	}
	public String queryByClass(){
		ActionContext context = ActionContext.getContext();
		String stuNum = (String) context.getSession().get("username");
		Student stu = studentService.queryById(stuNum);
		List<Student> list = studentService.queryByClass(stu.getStuAcademy(), stu.getStuMajor(), stu.getStuClass());
		req.put("stuList", list);
		return "queryByClass";
	}
	public String updatePassword(){
		ActionContext context = ActionContext.getContext();
		String stuNum = (String) context.getSession().get("username");
		HttpServletRequest request = ServletActionContext.getRequest();
		String password = request.getParameter("password");
		studentService.updatePassword(stuNum, password);
		return "updatePassword";
	}
	public String updateInfo() throws ParseException{
		ActionContext context = ActionContext.getContext();
		String stuNum = (String) context.getSession().get("username");
		HttpServletRequest request = ServletActionContext.getRequest();
		String stuAge = request.getParameter("stuAge");
		String stuBirth = request.getParameter("stuBirth");
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date = format.parse(stuBirth);
		String stuRoot = request.getParameter("stuRoot");
		String stuContactWay = request.getParameter("stuContactWay");
		Student stu = studentService.queryById(stuNum);
		stu.setStuAge(Short.parseShort(stuAge));
		stu.setStuBirth(date);
		stu.setStuRoot(stuRoot);
		stu.setStuContactWay(stuContactWay);
		studentService.updateInfo(stu);
		return "updateInfo";
	}
}
