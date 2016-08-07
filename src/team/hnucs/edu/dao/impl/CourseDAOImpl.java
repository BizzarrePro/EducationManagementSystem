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
		log.debug("save course info");
		try{
			super.getHibernateTemplate().save(cour);
		} catch (RuntimeException e){
			log.error("save failed", e);
			throw e;
		}
	}

	@Override
	public void delete(String courNum) {
		// TODO Auto-generated method stub
		log.debug("delete course");
		try{
			Course cour = this.queryById(courNum);
			super.getHibernateTemplate().delete(cour);
		} catch (RuntimeException e){
			log.error("delete failed", e);
			throw e;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Course> queryByName(String courName) {
		// TODO Auto-generated method stub
		log.debug("query course by course name");
		try{
			String hql = "FROM Course cour WHERE cour.courName = "+courName; 
			List<Course> list = (List<Course>) super.getHibernateTemplate().find(hql);
			return list;
		} catch (RuntimeException e){
			log.error("query failed", e);
			throw e;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Course> findRemainingCourse() {
		// TODO Auto-generated method stub
		log.debug("query remaining course");
		try{
			String hql = "FROM Course cour WHERE cour.choosedNum < cour.courLimitedNum"; 
			List<Course> list = (List<Course>) super.getHibernateTemplate().find(hql);
			return list;
		} catch (RuntimeException e){
			log.error("find failed", e);
			throw e;
		}
	}

	@Override
	public Course queryById(String courNum) {
		// TODO Auto-generated method stub
		log.debug("query by course number");
		try{
			Course cour = (Course) super.getHibernateTemplate().get("team.hnucs.edu.entity.Course", courNum);
			return cour;
		} catch (RuntimeException e){
			log.error("find failed", e);
			throw e;
		}
	}

	@Override
	public Course findByTeaAndCour(String teaNum, String courseName) {
		// TODO Auto-generated method stu
		log.debug("query by course name and teacher number");
		try{
			String hql = "FROM Course cour WHERE cour.teacher = '" + teaNum + "' AND cour.courName = '"+courseName+"'";
			return (Course)super.getHibernateTemplate().find(hql);
		} catch (RuntimeException e){
			log.error("find failed", e);
			throw e;
		}
	}

	@Override
	public void updateCourse(Course cour) {
		// TODO Auto-generated method stub
		try{
			this.getHibernateTemplate().update(cour);
		} catch (RuntimeException e){
			log.error("update failed", e);
			throw e;
		}
	}

}
