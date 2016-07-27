package team.hnucs.edu.service.impl;

import java.util.List;

import team.hnucs.edu.dao.StudentDAO;
import team.hnucs.edu.entity.CourseSelection;
import team.hnucs.edu.entity.ExamArrangement;
import team.hnucs.edu.entity.Score;
import team.hnucs.edu.entity.Student;
import team.hnucs.edu.service.StudentService;

public class StudentServiceImpl implements StudentService{
	private StudentDAO studentDAO;
	public void setStudentDAO(StudentDAO studentDAO){
		this.studentDAO = studentDAO;
	}
	public StudentDAO getStudentDAO(){
		return studentDAO;
	}
	@Override
	public boolean checkLogIn(String stuNum, String password) {
		Student stu = studentDAO.checkLogIn(stuNum, password);
		if(stu != null && stu.getPassword().equals(password))
			return true;
		else
			return false;
	}

	@Override
	public void delete(String stuNum) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Student queryById(String stuNum) {
		// TODO Auto-generated method stub
		return null;
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
