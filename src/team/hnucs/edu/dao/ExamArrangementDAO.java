package team.hnucs.edu.dao;

import java.util.List;

import team.hnucs.edu.entity.ExamArrangement;
import team.hnucs.edu.entity.ExamArrangementId;

public interface ExamArrangementDAO {
	abstract List<ExamArrangement> findClass(String acadamy, String major, String stuClass);
	abstract ExamArrangement findById(String stuNum);
	abstract void AssignExamination(ExamArrangementId assignExamination);
}
