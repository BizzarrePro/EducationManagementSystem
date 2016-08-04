package team.hnucs.edu.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import team.hnucs.edu.dao.TeacherDAO;
import team.hnucs.edu.entity.Course;
import team.hnucs.edu.entity.Student;
import team.hnucs.edu.entity.Teacher;
import team.hnucs.edu.service.TeacherService;

public class TeacherServiceImpl implements TeacherService{
	TeacherDAO teacherDAO;
	public void setTeacherDAO(TeacherDAO teacherDAO){
		this.teacherDAO = teacherDAO;
	}
	public TeacherDAO getTeacherDAO(){
		return teacherDAO;
	}
	@Override
	public Teacher checkLogIn(String teaNum, String password) {
		// TODO Auto-generated method stub
		Teacher teacher = teacherDAO.queryById(teaNum);
		if(teacher != null && teacher.getTeaPassword().equals(password))
			return teacher;
		return null;
	}

	@Override
	public void updatePassword(String teaNum, String password) {
		// TODO Auto-generated method stub
		teacherDAO.updatePassword(teaNum, password);
	}

	@Override
	public List<Course> queryCourse(String teaNum) {
		// TODO Auto-generated method stub
		Set<Course> set = teacherDAO.queryCourse(teaNum);
		List<Course> list = new ArrayList<Course>();
		Iterator<Course> iter = set.iterator();
		while(iter.hasNext())
			list.add(iter.next());
		return list;
	}

	@Override
	public List<Student> queryStuOfCourse(String teaNum, String course) {
		// TODO Auto-generated method stub
		return teacherDAO.queryStuOfCourse(teaNum, course);
	}

	@Override
	public void updateInfo(Teacher tea) {
		// TODO Auto-generated method stub
		teacherDAO.updateInfo(tea);
	}
	@Override
	public Teacher queryById(String teaNum) {
		// TODO Auto-generated method stub
		return teacherDAO.queryById(teaNum);
	}

}
