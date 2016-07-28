package team.hnucs.edu.dao.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import team.hnucs.edu.dao.StudentDAO;
import team.hnucs.edu.entity.CourseSelection;
import team.hnucs.edu.entity.ExamArrangement;
import team.hnucs.edu.entity.Score;
import team.hnucs.edu.entity.Student;

public class StudentDAOImpl extends HibernateDaoSupport implements StudentDAO{
	private static final Logger log = LoggerFactory.getLogger(StudentDAOImpl.class);
	@Override
	public Student checkLogIn(String stuNum, String password) {
		// TODO Auto-generated method stub
		Student instance = this.queryById(stuNum);
		if(instance != null)
			System.out.println(instance.getStuMinority());
		return instance;
	}

	@Override
	public boolean delete(String stuNum) {
		// TODO Auto-generated method stub
		log.debug("delete Student information");
		Student instance = this.queryById(stuNum);
		if(instance != null){
			try{
				getHibernateTemplate().delete(instance);
				return true;
			} catch (RuntimeException e){
				log.error("delete failed", e);
				throw e;
			}
		}
		return false;
	}

	@Override
	public Student queryById(String stuNum) {
		// TODO Auto-generated method stub
		log.debug("query Student information");
		try{
			Student instance = (Student) getHibernateTemplate().get("team.hnucs.edu.entity.Student", stuNum);
			return instance;
		} catch (RuntimeException e){
			log.error("get failed", e);
			throw e;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Student> queryByClass(String academy, String major,
			String stuClass) {
		log.debug("query student by class information");
		try{
			String hql = "FROM Student s WHERE s.stuAcademy = '"+academy+"' AND s.stuMajor = '"+major+
					"' AND s.stuClass = '"+stuClass+"'"; 
			List<Student> list = (List<Student>) this.getHibernateTemplate().find(hql);
			return list;
		} catch (RuntimeException e){
			log.error("get list failed", e);
			throw e;
		}
	}

	@Override
	public void updatePassword(String stuNum, String password) {
		// TODO Auto-generated method stub
		log.debug("update student password");
		try{
			Student instance = (Student) this.getHibernateTemplate().get("team.hnucs.edu.entity.Student", stuNum);
			instance.setPassword(password);
			this.getHibernateTemplate().update(instance);
		} catch(RuntimeException e){
			log.error("update psw failed", e);
			throw e;
		}
	}

	@Override
	public void updateInfo(Student stu) {
		// TODO Auto-generated method stub
		log.debug("update student information");
		try{
			this.getHibernateTemplate().update(stu);
		} catch(RuntimeException e){
			log.error("update info failed", e);
			throw e;
		}
	}

	@Override
	public List<Score> queryScore(String stuNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ExamArrangement> queryExamRoom(String stuNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CourseSelection> queryCourseSelectionResult(String stuNum) {
		// TODO Auto-generated method stub
		return null;
	}

}
