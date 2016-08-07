package team.hnucs.edu.dao;

import java.util.List;

import team.hnucs.edu.entity.Course;
import team.hnucs.edu.entity.Score;
import team.hnucs.edu.entity.ScoreId;
import team.hnucs.edu.entity.Student;

public interface ScoreDAO {
	abstract void save(Score score);
	abstract void delete(Course cour, Student stu);
	abstract List<Score> findById(Student stu);
	abstract List<Score> findAllbyCourse(Course cour);
	abstract void updateScore(Student stu, Course cour, Byte score);
}
