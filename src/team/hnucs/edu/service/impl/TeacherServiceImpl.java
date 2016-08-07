package team.hnucs.edu.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import team.hnucs.edu.dao.CourseSelectionDAO;
import team.hnucs.edu.dao.ScoreDAO;
import team.hnucs.edu.dao.TeacherDAO;
import team.hnucs.edu.entity.Course;
import team.hnucs.edu.entity.CourseSelection;
import team.hnucs.edu.entity.Score;
import team.hnucs.edu.entity.Student;
import team.hnucs.edu.entity.Teacher;
import team.hnucs.edu.service.TeacherService;

public class TeacherServiceImpl implements TeacherService{
	TeacherDAO teacherDAO;
	CourseSelectionDAO courSelDAO;
	public void setScoreDAO(ScoreDAO scoreDAO) {
		this.scoreDAO = scoreDAO;
	}
	ScoreDAO scoreDAO;
	public void setTeacherDAO(TeacherDAO teacherDAO){
		this.teacherDAO = teacherDAO;
	}
	public void setCourSelDAO(CourseSelectionDAO courSelDAO) {
		this.courSelDAO = courSelDAO;
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
	@Override
	public void save(Teacher tea) {
		// TODO Auto-generated method stub
		teacherDAO.save(tea);
	}
	@Override
	public void delete(String teaNum) {
		// TODO Auto-generated method stub
		Teacher tea = teacherDAO.queryById(teaNum);
		teacherDAO.delete(tea);
	}
	@Override
	public List<Teacher> queryAll() {
		// TODO Auto-generated method stub
		return teacherDAO.queryAll();
	}
	@Override
	public List<Score> queryAllStudentScore(String teaNum, String courName) {
		// TODO Auto-generated method stub
		Teacher tea = teacherDAO.queryById(teaNum);
		List<CourseSelection> courSelList = courSelDAO.findByTeacher(tea);
		Iterator<CourseSelection> iter = courSelList.iterator();
		Set<Course> courSet = teacherDAO.queryCourse(teaNum);
		Iterator<Course> courIter = courSet.iterator();
		Course cour = null;
		while(courIter.hasNext()){
			cour = courIter.next();
			if(cour.getCourName().equals(courName))
				break;
		}
		List<Score> scList = new ArrayList<Score>();
		if(cour != null){
			while(iter.hasNext()){
				Score sc = scoreDAO.findByStuAndCour(iter.next().getStudent(), cour);
				if(sc != null)
					scList.add(sc);
			}
		}
		return scList;
	}

}
