package team.hnucs.edu.dao.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import team.hnucs.edu.dao.CourseDAO;
import team.hnucs.edu.dao.ScoreDAO;
import team.hnucs.edu.dao.StudentDAO;
import team.hnucs.edu.entity.Course;
import team.hnucs.edu.entity.Score;
import team.hnucs.edu.entity.ScoreId;
import team.hnucs.edu.entity.Student;

public class ScoreDAOImpl extends HibernateDaoSupport implements ScoreDAO{
	private static final Logger log = LoggerFactory.getLogger(ScoreDAOImpl.class);
	@Override
	public void save(Score score) {
		// TODO Auto-generated method stub
		log.debug("save student info");
		try{
			this.getHibernateTemplate().save(score);
		} catch(DataAccessException e) {
			log.error("sace failed");
			throw e;
		}
	}

	@Override
	public void delete(Course cour, Student stu) {
		// TODO Auto-generated method stub
		log.debug("delete score record information");
		try{
			String hql = "FROM Score sco WHERE sco.student = "+stu+" AND sco.course = "+cour;
			this.getHibernateTemplate().delete(hql);
		} catch (RuntimeException e){
			log.error("delete failed", e);
			throw e;
		}
	}

	@Override
	public List<Score> findById(Student stu) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public List<Score> findByClass(List<Student> list) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Score> findAllbyCourse(Course cour) {
		// TODO Auto-generated method stub
		return null;
	}

}
