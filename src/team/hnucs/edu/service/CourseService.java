package team.hnucs.edu.service;

import java.util.List;

import team.hnucs.edu.entity.Course;

public interface CourseService {
	abstract void save(Course cour);
	abstract void delete(String courName);
	abstract Course findByName(String courName);
	abstract List<Course> findRemainingCourse();
}
