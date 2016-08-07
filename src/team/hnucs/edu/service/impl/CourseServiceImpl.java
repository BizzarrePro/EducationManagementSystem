package team.hnucs.edu.service.impl;

import java.util.List;

import team.hnucs.edu.dao.CourseDAO;
import team.hnucs.edu.dao.TeacherDAO;
import team.hnucs.edu.entity.Course;
import team.hnucs.edu.entity.Teacher;
import team.hnucs.edu.service.CourseService;

public class CourseServiceImpl implements CourseService{
	private CourseDAO courseDAO;
	public void setCourseDAO(CourseDAO courseDAO) {
		this.courseDAO = courseDAO;
	}

	@Override
	public void save(Course cour) {
		// TODO Auto-generated method stub
		courseDAO.save(cour);
	}

	@Override
	public void delete(String courNum) {
		// TODO Auto-generated method stub
		courseDAO.delete(courNum);
	}

	@Override
	public List<Course> findByName(String courName) {
		// TODO Auto-generated method stub
		return courseDAO.queryByName(courName);
	}

	@Override
	public List<Course> findRemainingCourse() {
		// TODO Auto-generated method stub
		return courseDAO.findRemainingCourse();
	}

	@Override
	public Course findByTeaAndCour(String teaNum, String courName) {
		// TODO Auto-generated method stub
		return courseDAO.findByTeaAndCour(teaNum, courName);
	}

	@Override
	public Course findById(String courNum) {
		// TODO Auto-generated method stub
		return courseDAO.queryById(courNum);
	}

	@Override
	public void updateCourse(Course cour) {
		// TODO Auto-generated method stub
		courseDAO.updateCourse(cour);
	}

}
