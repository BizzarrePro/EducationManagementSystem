package team.hnucs.edu.dao;

import java.util.List;

import team.hnucs.edu.entity.Course;

public interface CourseDAO {
	abstract void save(Course cour);
	abstract void delete(String courNum);
	abstract List<Course> queryByName(String courName);
	abstract Course queryById(String courNum);
	abstract List<Course> findRemainingCourse();
}
