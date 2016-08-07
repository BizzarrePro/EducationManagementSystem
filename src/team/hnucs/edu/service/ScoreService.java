package team.hnucs.edu.service;

import java.util.List;

import team.hnucs.edu.entity.Course;
import team.hnucs.edu.entity.Score;
import team.hnucs.edu.entity.ScoreId;
import team.hnucs.edu.entity.Student;

public interface ScoreService {
	abstract List<Score> findAllbyCourse(String courseName);
	abstract void add(Score score);
	abstract List<Score> findById(String stuNum);
	abstract void delete(String courName, String stuNum);
	abstract void updateScore(String stuNum, String courName, Byte score);
}
