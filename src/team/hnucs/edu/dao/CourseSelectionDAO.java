package team.hnucs.edu.dao;

import java.util.List;

import team.hnucs.edu.entity.Course;
import team.hnucs.edu.entity.CourseSelection;
import team.hnucs.edu.entity.Student;
import team.hnucs.edu.entity.Teacher;

public interface CourseSelectionDAO {
	abstract List<Student> findByCourse(Course cour);
	abstract List<CourseSelection> findByStudent(Student stu);
	abstract List<CourseSelection> findByTeacher(Teacher tea);
	abstract void select(CourseSelection cs);
	abstract void delete(CourseSelection cs);
}
