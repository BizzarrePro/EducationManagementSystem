package team.hnucs.edu.service;

import java.util.List;

import team.hnucs.edu.entity.Course;
import team.hnucs.edu.entity.CourseSelection;
import team.hnucs.edu.entity.Student;

public interface CourseSelectionService {
	abstract List<Student> findByCourse(String courName);
	abstract List<CourseSelection> findByStudent(String stuNum);
	abstract List<CourseSelection> findByTeacher(String teaNum);
	abstract void select(String stuNum, String courNum, String teacher);
	abstract void delete(String stuNum, String courNum, String teacher);
}
