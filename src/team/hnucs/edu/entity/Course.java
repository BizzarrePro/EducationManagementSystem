package team.hnucs.edu.entity;

// default package

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Course entity. @author MyEclipse Persistence Tools
 */

public class Course implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String courNum;
	private Teacher teacher;
	private String courName;
	private Short courLimitedNum;
	private Date courStartDate;
	private Boolean courCredits;
	private String courType;
	private Short choosedNum;
	private Boolean courseSemester;
	private Set<Score> scores = new HashSet<Score>();
	private Set<ExamArrangement> examArrangements = new HashSet<ExamArrangement>();
	private Set<CourseSelection> courseSelections = new HashSet<CourseSelection>();

	// Constructors

	/** default constructor */
	public Course() {
	}

	/** minimal constructor */
	public Course(String courNum, Teacher teacher, String courName,
			Short courLimitedNum, Date courStartDate, Boolean courCredits,
			String courType) {
		this.courNum = courNum;
		this.teacher = teacher;
		this.courName = courName;
		this.courLimitedNum = courLimitedNum;
		this.courStartDate = courStartDate;
		this.courCredits = courCredits;
		this.courType = courType;
	}

	/** full constructor */
	public Course(String courNum, Teacher teacher, String courName,
			Short courLimitedNum, Date courStartDate, Boolean courCredits,
			String courType, Short choosedNum, Boolean courseSemester,
			Set<Score> scores, Set<ExamArrangement> examArrangements, Set<CourseSelection> courseSelections) {
		this.courNum = courNum;
		this.teacher = teacher;
		this.courName = courName;
		this.courLimitedNum = courLimitedNum;
		this.courStartDate = courStartDate;
		this.courCredits = courCredits;
		this.courType = courType;
		this.choosedNum = choosedNum;
		this.courseSemester = courseSemester;
		this.scores = scores;
		this.examArrangements = examArrangements;
		this.courseSelections = courseSelections;
	}

	// Property accessors

	public String getCourNum() {
		return this.courNum;
	}

	public void setCourNum(String courNum) {
		this.courNum = courNum;
	}

	public Teacher getTeacher() {
		return this.teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public String getCourName() {
		return this.courName;
	}

	public void setCourName(String courName) {
		this.courName = courName;
	}

	public Short getCourLimitedNum() {
		return this.courLimitedNum;
	}

	public void setCourLimitedNum(Short courLimitedNum) {
		this.courLimitedNum = courLimitedNum;
	}

	public Date getCourStartDate() {
		return this.courStartDate;
	}

	public void setCourStartDate(Date courStartDate) {
		this.courStartDate = courStartDate;
	}

	public Boolean getCourCredits() {
		return this.courCredits;
	}

	public void setCourCredits(Boolean courCredits) {
		this.courCredits = courCredits;
	}

	public String getCourType() {
		return this.courType;
	}

	public void setCourType(String courType) {
		this.courType = courType;
	}

	public Short getChoosedNum() {
		return this.choosedNum;
	}

	public void setChoosedNum(Short choosedNum) {
		this.choosedNum = choosedNum;
	}

	public Boolean getCourseSemester() {
		return this.courseSemester;
	}

	public void setCourseSemester(Boolean courseSemester) {
		this.courseSemester = courseSemester;
	}

	public Set<Score> getScores() {
		return this.scores;
	}

	public void setScores(Set<Score> scores) {
		this.scores = scores;
	}

	public Set<ExamArrangement> getExamArrangements() {
		return this.examArrangements;
	}

	public void setExamArrangements(Set<ExamArrangement> examArrangements) {
		this.examArrangements = examArrangements;
	}

	public Set<CourseSelection> getCourseSelections() {
		return this.courseSelections;
	}

	public void setCourseSelections(Set<CourseSelection> courseSelections) {
		this.courseSelections = courseSelections;
	}

}