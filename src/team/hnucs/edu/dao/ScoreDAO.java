package team.hnucs.edu.dao;

import java.util.List;

import team.hnucs.edu.entity.Course;
import team.hnucs.edu.entity.Score;
import team.hnucs.edu.entity.ScoreId;
import team.hnucs.edu.entity.Student;

public interface ScoreDAO {
	abstract void save(Student stu, Course cour, ScoreId sc);
	abstract void delete(String courNum, String stuNum);
	abstract List<Score> findById(String stuNum);
	abstract List<Score> findByClass(String acadamy, String major, String stuClass);
	abstract List<Score> findAll();
}
