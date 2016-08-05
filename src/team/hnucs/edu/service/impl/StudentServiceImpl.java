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
		return false;
	}

	@Override
	public boolean delete(String stuNum) {
		// TODO Auto-generated method stub
		return studentDAO.delete(stuNum);
	}

	@Override
	public Student queryById(String stuNum) {
		// TODO Auto-generated method stub
		Student stu = studentDAO.queryById(stuNum);
		return stu;
	}

	@Override
	public List<Student> queryByClass(String acadamy, String major,
			String stuClass) {
		// TODO Auto-generated method stub
		List<Student> list = studentDAO.queryByClass(acadamy, major, stuClass);
		return list;
	}

	@Override
	public void updatePassword(String stuNum, String password) {
		// TODO Auto-generated method stub
		studentDAO.updatePassword(stuNum, password);
	}

	@Override
	public void updateInfo(Student stu) {
		// TODO Auto-generated method stub
		studentDAO.updateInfo(stu);
	}

	@Override
	public List<Score> queryScore(String stuNum) {
		// TODO Auto-generated method stub
		return studentDAO.queryScore(stuNum);
	}

	@Override
	public List<ExamArrangement> queryExamRoom(String stuNum) {
		// TODO Auto-generated method stub
		return studentDAO.queryExamRoom(stuNum);
	}

	@Override
	public List<CourseSelection> queryCourseSelectionResult(String stuNum) {
		// TODO Auto-generated method stub
		return studentDAO.queryCourseSelectionResult(stuNum);
	}
	@Override
	public void save(Student stu) {
		// TODO Auto-generated method stub
		System.out.println(stu);
		studentDAO.save(stu);
	}
	@Override
	public List<Student> queryAll() {
		// TODO Auto-generated method stub
		return studentDAO.queryAll();
	}

}
