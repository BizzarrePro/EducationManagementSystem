package team.hnucs.edu.dao;

import java.util.List;
import java.util.Set;

import team.hnucs.edu.entity.Course;
import team.hnucs.edu.entity.Student;
import team.hnucs.edu.entity.Teacher;

public interface TeacherDAO {
	abstract void updatePassword(String teaNum, String password);
	abstract void save(Teacher tea);
	abstract Set<Course> queryCourse(String teaNum);
	abstract List<Student> queryStuOfCourse(String teaNum, String course);
	abstract void updateInfo(Teacher tea);
	abstract Teacher queryById(String teaNum);
}
