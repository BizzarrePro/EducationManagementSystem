package team.hnucs.edu.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import team.hnucs.edu.dao.TeacherDAO;
import team.hnucs.edu.entity.Course;
import team.hnucs.edu.entity.Student;
import team.hnucs.edu.entity.Teacher;

public class TeacherDAOImpl extends HibernateDaoSupport  implements TeacherDAO{

	@Override
	public Teacher checkLogIn(String teaNum) {
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
