package team.hnucs.edu.dao.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import team.hnucs.edu.dao.CourseDAO;
import team.hnucs.edu.dao.CourseSelectionDAO;
import team.hnucs.edu.entity.Course;
import team.hnucs.edu.entity.CourseSelection;
import team.hnucs.edu.entity.Student;

public class CourseSelectionDAOImpl extends HibernateDaoSupport implements CourseSelectionDAO{
	private static final Logger log = LoggerFactory.getLogger(CourseSelectionDAOImpl.class);
	@SuppressWarnings("unchecked")
	@Override
	public List<Student> findByCourse(Course cour) {
		// TODO Auto-generated method stub
		log.debug("query student who select this course information");
		try{
			String hql = "FROM CourseSelection cs WHERE cs.course = " + cour;
			List<Student> list = (List<Student>)super.getHibernateTemplate().find(hql);
			return list;
		} catch (RuntimeException e){
			log.error("get student list failed", e);
			throw e;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Course> findById(Student stu) {
		// TODO Auto-generated method stub
		log.debug("query course which was selected by this student");
		try{
			String hql = "FROM CourseSelection cs WHERE cs.student = " + stu;
			List<Course> list = (List<Course>)super.getHibernateTemplate().find(hql);
			return list;
		} catch (RuntimeException e){
			log.error("get course list failed", e);
			throw e;
		}
	}

	@Override
	public void select(CourseSelection cs) {
		// TODO Auto-generated method stub
		log.debug("select course");
		try {
			super.getHibernateTemplate().save(cs);
		} catch (RuntimeException e){
			log.error("select failed", e);
			throw e;
		}
	}

	@Override
	public void delete(Student stu, Course cour) {
		// TODO Auto-generated method stub
		log.debug("delete course selection");
		try {
			String hql = "FROM CourseSelection cs WHERE cs.course = " + cour + " AND cs.student = " + stu;
			super.getHibernateTemplate().delete(hql);
		} catch (RuntimeException e){
			log.error("delete failed", e);
			throw e;
		}
	}
	
}
