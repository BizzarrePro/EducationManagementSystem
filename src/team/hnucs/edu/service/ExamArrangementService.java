package team.hnucs.edu.service;

import java.util.List;

import team.hnucs.edu.entity.ExamArrangement;

public interface ExamArrangementService {
	abstract void assignExamination(ExamArrangement ea);
	abstract List<ExamArrangement> queryById(String stu);
	abstract void deleteExamination(ExamArrangement ea);
}
