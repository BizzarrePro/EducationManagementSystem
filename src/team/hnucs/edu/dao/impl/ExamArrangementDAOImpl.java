package team.hnucs.edu.dao.impl;

import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import team.hnucs.edu.dao.ExamArrangementDAO;
import team.hnucs.edu.entity.Course;
import team.hnucs.edu.entity.ExamArrangement;
import team.hnucs.edu.entity.ExamArrangementId;
import team.hnucs.edu.entity.Student;

public class ExamArrangementDAOImpl extends HibernateDaoSupport implements ExamArrangementDAO{
	private static final Logger log = LoggerFactory.getLogger(ExamArrangementDAOImpl.class);

	@SuppressWarnings("unchecked")
	@Override
	public List<ExamArrangement> findById(Student stu) {
		// TODO Auto-generated method stub
		log.debug("query infomation of exam for student");
		try{
			String hql = "FROM ExamArrangement cs WHERE cs.student = " + stu;
			List<ExamArrangement> list = (List<ExamArrangement>) super.getHibernateTemplate().find(hql);
			return list;
		} catch (RuntimeException e){
			log.error("get exam information list failed", e);
			throw e;
		}
	}

	@Override
	public void assignExamination(ExamArrangement assignExamination) {
		// TODO Auto-generated method stub
		log.debug("assign examination");
		try {
			super.getHibernateTemplate().save(assignExamination);
		} catch (RuntimeException e){
			log.error("assign failed", e);
			throw e;
		}
	}

	@Override
	public void deleteExamination(ExamArrangement assignExamination) {
		// TODO Auto-generated method stub
		log.debug("delete examination");
		try {
			super.getHibernateTemplate().delete(assignExamination);
		} catch (RuntimeException e){
			log.error("delete failed", e);
			throw e;
		}
	}

}
