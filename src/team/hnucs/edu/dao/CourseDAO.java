package team.hnucs.edu.dao;

import java.util.List;

import team.hnucs.edu.entity.Course;
import team.hnucs.edu.entity.Teacher;

public interface CourseDAO {
	abstract void save(Course cour);
	abstract void delete(String courNum);
	abstract List<Course> queryByName(String courName);
	abstract Course queryById(String courNum);
	abstract List<Course> findRemainingCourse();
	abstract Course findByTeaAndCour(String teaNum, String courseName);
}
