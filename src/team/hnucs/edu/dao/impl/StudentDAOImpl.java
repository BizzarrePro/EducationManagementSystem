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
	public void delete(String stuNum) {
		// TODO Auto-generated method stub
		
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

	@Override
	public List<Student> queryByClass(String acadamy, String major,
			String stuClass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updatePassword(String password) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateInfo(Student stu) {
		// TODO Auto-generated method stub
		
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
