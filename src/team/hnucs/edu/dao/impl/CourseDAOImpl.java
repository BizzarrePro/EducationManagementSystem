package team.hnucs.edu.dao.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import team.hnucs.edu.dao.CourseDAO;
import team.hnucs.edu.entity.Course;

public class CourseDAOImpl extends HibernateDaoSupport implements CourseDAO {
	private static final Logger log = LoggerFactory.getLogger(CourseDAOImpl.class);
	@Override
	public void save(Course cour) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String courName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Course> queryByName(String courName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Course> findRemainingCourse() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Course queryById(String courNum) {
		// TODO Auto-generated method stub
		return null;
	}

}
