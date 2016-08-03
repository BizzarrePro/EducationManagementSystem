package team.hnucs.edu.service;

import java.util.List;

import team.hnucs.edu.entity.Course;
import team.hnucs.edu.entity.Student;
import team.hnucs.edu.entity.Teacher;

public interface TeacherService {
	abstract Teacher checkLogIn(String teaNum, String password);
	abstract void updatePassword(String teaNum, String password);
	abstract List<Course> queryCourse(String teaNum);
	abstract List<Student> queryStuOfCourse(String teaNum, String course);
	abstract void updateInfo(Teacher tea);
	abstract Teacher queryById(String teaNum);
}
