package team.hnucs.edu.service.impl;

import java.util.List;

import team.hnucs.edu.dao.ExamArrangementDAO;
import team.hnucs.edu.dao.StudentDAO;
import team.hnucs.edu.entity.ExamArrangement;
import team.hnucs.edu.entity.Student;
import team.hnucs.edu.service.ExamArrangementService;

public class ExamArrangementServiceImpl implements ExamArrangementService{
	private ExamArrangementDAO eaDAO;
	private StudentDAO studentDAO;
	public void setEaDAO(ExamArrangementDAO eaDAO) {
		this.eaDAO = eaDAO;
	}

	public void setStudentDAO(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}

	@Override
	public void assignExamination(ExamArrangement ea) {
		// TODO Auto-generated method stub
		eaDAO.assignExamination(ea);
	}

	@Override
	public List<ExamArrangement> queryById(String stuNum) {
		// TODO Auto-generated method stub
		Student stu = studentDAO.queryById(stuNum);
		return eaDAO.findById(stu);
	}

	@Override
	public void deleteExamination(ExamArrangement ea) {
		// TODO Auto-generated method stub
		eaDAO.deleteExamination(ea);
	}
	
}
