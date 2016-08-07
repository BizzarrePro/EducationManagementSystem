package team.hnucs.edu.service.impl;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import team.hnucs.edu.dao.CourseDAO;
import team.hnucs.edu.dao.ScoreDAO;
import team.hnucs.edu.dao.StudentDAO;
import team.hnucs.edu.entity.Course;
import team.hnucs.edu.entity.CourseSelection;
import team.hnucs.edu.entity.Score;
import team.hnucs.edu.entity.ScoreId;
import team.hnucs.edu.entity.Student;
import team.hnucs.edu.service.ScoreService;

public class ScoreServiceImpl implements ScoreService{
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
	public void delete(String courName, String stuNum) {
		// TODO Auto-generated method stub
		Student stu = studentDAO.queryById(stuNum);
		Set<CourseSelection> cs = stu.getCourseSelections();
		Iterator<CourseSelection> iter = cs.iterator();
		Course cour = null;
		while(iter.hasNext()){
			cour = iter.next().getCourse();
			if(cour.getCourName().equals(courName)){
				scoreDAO.delete(cour, stu);
				break;
			}
		}
	}

	@Override
	public void updateScore(String stuNum, String courName, Byte score) {
		// TODO Auto-generated method stub
		Student stu = studentDAO.queryById(stuNum);
		Set<CourseSelection> cs = stu.getCourseSelections();
		Iterator<CourseSelection> iter = cs.iterator();
		Course cour = null;
		while(iter.hasNext()){
			cour = iter.next().getCourse();
			if(cour.getCourName().equals(courName)){
				scoreDAO.updateScore(stu, cour, score);
				break;
			}
		}
	}

}
