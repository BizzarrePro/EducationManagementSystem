package team.hnucs.edu.service.impl;

import java.util.List;

import team.hnucs.edu.dao.ScoreDAO;
import team.hnucs.edu.entity.Course;
import team.hnucs.edu.entity.Score;
import team.hnucs.edu.entity.ScoreId;
import team.hnucs.edu.entity.Student;
import team.hnucs.edu.service.ScoreService;

public class ScoreServiceImpl implements ScoreService{
	private ScoreDAO scoreDao;
	@Override
	public List<Score> findAll() {
		// TODO Auto-generated method stub
		return scoreDao.findAll();
	}

	@Override
	public void add(Student stu, Course cour, ScoreId sc) {
		// TODO Auto-generated method stub
		scoreDao.save(stu, cour, sc);
	}

	@Override
	public List<Score> findById(String stuNum) {
		// TODO Auto-generated method stub
		return scoreDao.findById(stuNum);
	}

	@Override
	public void delete(String courName, String stuNum) {
		// TODO Auto-generated method stub
		scoreDao.delete(courName, stuNum);
	}

}
