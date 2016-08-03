package team.hnucs.edu.dao;

import java.util.List;

import team.hnucs.edu.entity.ExamArrangement;
import team.hnucs.edu.entity.ExamArrangementId;
import team.hnucs.edu.entity.Student;

public interface ExamArrangementDAO {
	abstract List<ExamArrangement> findById(Student stu);
	abstract void assignExamination(ExamArrangement assignExamination);
	abstract void deleteExamination(ExamArrangement assignExamination);
}
