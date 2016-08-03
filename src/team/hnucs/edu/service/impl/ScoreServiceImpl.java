package team.hnucs.edu.service.impl;

import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import team.hnucs.edu.dao.CourseDAO;
import team.hnucs.edu.dao.ScoreDAO;
import team.hnucs.edu.dao.StudentDAO;
import team.hnucs.edu.entity.Course;
import team.hnucs.edu.entity.Score;
import team.hnucs.edu.entity.ScoreId;
import team.hnucs.edu.entity.Student;
import team.hnucs.edu.service.ScoreService;

public class ScoreServiceImpl extends HibernateDaoSupport implements ScoreService{
	private ScoreDAO scoreDAO;
	private StudentDAO studentDAO;
	private CourseDAO courseDAO;

	public void setScoreDAO(ScoreDAO scoreDAO) {
		this.scoreDAO = scoreDAO;
	}

	public void setStudentDAO(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}

	public void setCourseDAO(CourseDAO courseDAO) {
		this.courseDAO = courseDAO;
	}

	@Override
	public List<Score> findAllbyCourse(String courseNum) {
		// TODO Auto-generated method stub
		Course cour = courseDAO.queryById(courseNum);
		return scoreDAO.findAllbyCourse(cour);
	}
	@Override
	public void add(Score score) {
		// TODO Auto-generated method stub
		scoreDAO.save(score);
	}

	@Override
	public List<Score> findById(String stuNum) {
		// TODO Auto-generated method stub
		Student stu = studentDAO.queryById(stuNum);
		return scoreDAO.findById(stu);
	}

	@Override
	public void delete(String courNum, String stuNum) {
		// TODO Auto-generated method stub
		Course cour = courseDAO.queryById(courNum);
		Student stu = studentDAO.queryById(stuNum);
		scoreDAO.delete(cour, stu);
	}

}
