package team.hnucs.edu.service.impl;

import java.util.List;

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
		return null;
	}

	@Override
	public void updatePassword(String password) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Course> queryCourse(String teaNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> queryStuOfCourse(String course) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateInfo(String teaNum) {
		// TODO Auto-generated method stub
		
	}

}
