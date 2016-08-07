package team.hnucs.edu.dao.impl;

import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import team.hnucs.edu.dao.TeacherDAO;
import team.hnucs.edu.entity.Course;
import team.hnucs.edu.entity.Score;
import team.hnucs.edu.entity.Student;
import team.hnucs.edu.entity.Teacher;

public class TeacherDAOImpl extends HibernateDaoSupport implements TeacherDAO{
	private static final Logger log = LoggerFactory.getLogger(TeacherDAOImpl.class);
	@Override
	public void updatePassword(String teaNum, String password) {
		// TODO Auto-generated method stub
		log.debug("update teacher password");
		try{
			Teacher instance = (Teacher) this.getHibernateTemplate().get("team.hnucs.edu.entity,Teacher", teaNum);
			instance.setTeaPassword(password);
			this.getHibernateTemplate().update(instance);
		} catch(RuntimeException e){
			log.error("update psw failed", e);
			throw e;
		}
	}

	@Override
	public Set<Course> queryCourse(String teaNum) {
		// TODO Auto-generated method stub
		log.debug("query teacher's course");
		try{
			Teacher instance = this.queryById(teaNum);
			Set<Course> set = instance.getCourses();
			return set;
		} catch(RuntimeException e) {
			log.error("query course failed", e);
			throw e;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Student> queryStuOfCourse(String teaNum, String course) {
		// TODO Auto-generated method stub
		log.debug("query student of course failed");
		try{
			Teacher instance = this.queryById(teaNum);
			String hql = "FROM Course cour WHERE cour.courName = '"+course+"' AND cour.teacher = " + instance;
			List<Student> stuList = (List<Student>)this.getHibernateTemplate().find(hql);
			return stuList;
		} catch(RuntimeException e) {
			log.error("query student of course failed", e);
			throw e;
		}
	}

	@Override
	public void updateInfo(Teacher tea) {
		// TODO Auto-generated method stub
		log.debug("update teacher information");
		try{
			this.getHibernateTemplate().update(tea);
		} catch(RuntimeException e){
			log.error("update info failed", e);
			throw e;
		}
	}

	@Override
	public Teacher queryById(String teaNum) {
		// TODO Auto-generated method stub
		log.debug("query Teacher information");
		try{
			Teacher instance = (Teacher) getHibernateTemplate().get("team.hnucs.edu.entity.Teacher",teaNum);
			return instance;
		} catch (RuntimeException e){
			log.error("get failed", e);
			throw e;
		}
	}

	@Override
	public void save(Teacher tea) {
		// TODO Auto-generated method stub
		log.debug("save teacher info");
		try{
			this.getHibernateTemplate().save(tea);
		} catch(DataAccessException e) {
			log.error("save failed");
			throw e;
		}
	}

	@Override
	public void delete(Teacher tea) {
		// TODO Auto-generated method stub
		log.debug("delete teacher info");
		try{
			this.getHibernateTemplate().delete(tea);
		} catch(DataAccessException e) {
			log.error("delete failed");
			throw e;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Teacher> queryAll() {
		// TODO Auto-generated method stub
		log.debug("query all teacher info");
		try{
			String hql = "FROM Teacher";
			List<Teacher> list = (List<Teacher>) this.getHibernateTemplate().find(hql);
			return list;
		} catch(DataAccessException e) {
			log.error("query all failed");
			throw e;
		}
	}
	
}
