package team.hnucs.edu.service;

import java.util.List;

import team.hnucs.edu.entity.CourseSelection;
import team.hnucs.edu.entity.Student;

public interface CourseSelectionService {
	abstract List<Student> findByCourse(String courName);
	abstract CourseSelection findById(String stuNum);
	abstract void select(String stuNum, String courNum);
	abstract void delete(String stuNum, String courNum);
}
