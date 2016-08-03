package team.hnucs.edu.service.impl;

import java.util.List;

import team.hnucs.edu.dao.CourseDAO;
import team.hnucs.edu.dao.CourseSelectionDAO;
import team.hnucs.edu.dao.StudentDAO;
import team.hnucs.edu.dao.TeacherDAO;
import team.hnucs.edu.entity.Course;
import team.hnucs.edu.entity.CourseSelection;
import team.hnucs.edu.entity.CourseSelectionId;
import team.hnucs.edu.entity.Student;
import team.hnucs.edu.entity.Teacher;
import team.hnucs.edu.service.CourseSelectionService;

public class CourseSelectionServiceImpl implements CourseSelectionService{
	private CourseSelectionDAO courSelDao;
	private CourseDAO courDao;
	private StudentDAO studentDao;
	private TeacherDAO teacherDao;
	
	public void setCourSelDao(CourseSelectionDAO courSelDao) {
		this.courSelDao = courSelDao;
	}

	public void setCourDao(CourseDAO courDao) {
		this.courDao = courDao;
	}

	public void setStudentDao(StudentDAO studentDao) {
		this.studentDao = studentDao;
	}
	
	public void setTeacherDao(TeacherDAO teacherDao) {
		this.teacherDao = teacherDao;
	}
	
	@Override
	public List<Student> findByCourse(String courNum) {
		// TODO Auto-generated method stub
		Course cour = courDao.queryById(courNum);
		return courSelDao.findByCourse(cour);
	}
	@Override
	public List<Course> findById(String stuNum) {
		// TODO Auto-generated method stub
		Student stu = studentDao.queryById(stuNum);
		return courSelDao.findById(stu);
	}

	@Override
	public void select(String stuNum, String courNum, String teaNum) {
		// TODO Auto-generated method stub
		Student stu = studentDao.queryById(stuNum);
		Course cour = courDao.queryById(courNum);
		Teacher tea = teacherDao.queryById(teaNum);
		CourseSelection cs = new CourseSelection(new CourseSelectionId(stu, cour, tea),  stu, cour, tea);
		courSelDao.select(cs);
	}

	@Override
	public void delete(String stuNum, String courNum, String teaNum) {
		// TODO Auto-generated method stub
		Student stu = studentDao.queryById(stuNum);
		Course cour = courDao.queryById(courNum);
		Teacher tea = teacherDao.queryById(teaNum);
		CourseSelection cs = new CourseSelection(new CourseSelectionId(stu, cour, tea),  stu, cour, tea);
		courSelDao.delete(cs);
	}

}
