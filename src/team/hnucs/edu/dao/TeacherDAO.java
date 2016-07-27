package team.hnucs.edu.dao;

import java.util.List;

import team.hnucs.edu.entity.Course;
import team.hnucs.edu.entity.Student;
import team.hnucs.edu.entity.Teacher;

public interface TeacherDAO {
	abstract Teacher checkLogIn(String teaNum);
	abstract void updatePassword(String password);
	abstract List<Course> queryCourse(String teaNum);
	abstract List<Student> queryStuOfCourse(String course);
	abstract void updateInfo(String teaNum);
}
