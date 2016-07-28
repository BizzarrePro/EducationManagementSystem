package team.hnucs.edu.service;

import java.util.List;

import team.hnucs.edu.entity.CourseSelection;
import team.hnucs.edu.entity.ExamArrangement;
import team.hnucs.edu.entity.Score;
import team.hnucs.edu.entity.Student;

public interface StudentService {
	abstract void save(Student stu);
	abstract boolean checkLogIn(String stuNum, String password);
	abstract boolean delete(String stuNum);
	abstract Student queryById(String stuNum);
	abstract List<Student> queryByClass(String acadamy, String major, String stuClass);
	abstract void updatePassword(String stuNum, String password);
	abstract void updateInfo(Student stu);
	abstract List<Score> queryScore(String stuNum);
	abstract List<ExamArrangement> queryExamRoom(String stuNum);
	abstract List<CourseSelection> queryCourseSelectionResult(String stuNum);
}
