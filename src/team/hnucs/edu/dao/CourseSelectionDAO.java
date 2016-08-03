package team.hnucs.edu.dao;

import java.util.List;

import team.hnucs.edu.entity.Course;
import team.hnucs.edu.entity.CourseSelection;
import team.hnucs.edu.entity.Student;

public interface CourseSelectionDAO {
	//
	abstract List<Student> findByCourse(Course cour);
	abstract List<Course> findById(Student stu);
	abstract void select(CourseSelection cs);
	abstract void delete(Student stu, Course cour);
}
