package team.hnucs.edu.dao.impl;

import java.util.List;

import team.hnucs.edu.dao.ScoreDAO;
import team.hnucs.edu.entity.Course;
import team.hnucs.edu.entity.Score;
import team.hnucs.edu.entity.ScoreId;
import team.hnucs.edu.entity.Student;

public class ScoreDAOImpl implements ScoreDAO{

	@Override
	public void save(Student stu, Course cour, ScoreId sc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String courNum, String stuNum) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Score> findById(String stuNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Score> findByClass(String acadamy, String major, String stuClass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Score> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
