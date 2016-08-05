package team.hnucs.edu.entity;

// default package

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Student entity. @author MyEclipse Persistence Tools
 */

public class Student implements java.io.Serializable {

	// Fields

	private String stuNum;
	private String stuName;
	private String stuSex;
	private Short stuAge;
	private Date stuBirth;
	private String stuMinority;
	private String stuRoot;
	private String stuAcademy;
	private String stuMajor;
	private String stuClass;
	private String stuPoliticalStatus;
	private Date stuEnrollmentDate;
	private String stuContactWay;
	private Boolean semester;
	private String password;
	private Set<Score> scores = new HashSet<Score>(0);
	private Set<ExamArrangement> examArrangements = new HashSet<ExamArrangement>(0);
	private Set<CourseSelection> courseSelections = new HashSet<CourseSelection>(0);

	// Constructors

	/** default constructor */
	public Student() {
	}

	/** minimal constructor */
	public Student(String stuNum, String stuName, String stuSex, Short stuAge,
			Date stuBirth, String stuMinority, String stuRoot,
			String stuAcademy, String stuMajor, String stuClass,
			String stuPoliticalStatus, Date stuEnrollmentDate) {
		this.stuNum = stuNum;
		this.stuName = stuName;
		this.stuSex = stuSex;
		this.stuAge = stuAge;
		this.stuBirth = stuBirth;
		this.stuMinority = stuMinority;
		this.stuRoot = stuRoot;
		this.stuAcademy = stuAcademy;
		this.stuMajor = stuMajor;
		this.stuClass = stuClass;
		this.stuPoliticalStatus = stuPoliticalStatus;
		this.stuEnrollmentDate = stuEnrollmentDate;
	}

	/** full constructor */
	public Student(String stuNum, String stuName, String stuSex, Short stuAge,
			Date stuBirth, String stuMinority, String stuRoot,
			String stuAcademy, String stuMajor, String stuClass,
			String stuPoliticalStatus, Date stuEnrollmentDate,
			String stuContactWay, Boolean semester, String password,
			Set<Score> scores, Set<ExamArrangement> examArrangements, Set<CourseSelection> courseSelections) {
		this.stuNum = stuNum;
		this.stuName = stuName;
		this.stuSex = stuSex;
		this.stuAge = stuAge;
		this.stuBirth = stuBirth;
		this.stuMinority = stuMinority;
		this.stuRoot = stuRoot;
		this.stuAcademy = stuAcademy;
		this.stuMajor = stuMajor;
		this.stuClass = stuClass;
		this.stuPoliticalStatus = stuPoliticalStatus;
		this.stuEnrollmentDate = stuEnrollmentDate;
		this.stuContactWay = stuContactWay;
		this.semester = semester;
		this.password = password;
		this.scores = scores;
		this.examArrangements = examArrangements;
		this.courseSelections = courseSelections;
	}

	// Property accessors

	public String getStuNum() {
		return this.stuNum;
	}

	public void setStuNum(String stuNum) {
		this.stuNum = stuNum;
	}

	public String getStuName() {
		return this.stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getStuSex() {
		return this.stuSex;
	}

	public void setStuSex(String stuSex) {
		this.stuSex = stuSex;
	}

	public Short getStuAge() {
		return this.stuAge;
	}

	public void setStuAge(Short stuAge) {
		this.stuAge = stuAge;
	}

	public Date getStuBirth() {
		return this.stuBirth;
	}

	public void setStuBirth(Date stuBirth) {
		this.stuBirth = stuBirth;
	}

	public String getStuMinority() {
		return this.stuMinority;
	}

	public void setStuMinority(String stuMinority) {
		this.stuMinority = stuMinority;
	}

	public String getStuRoot() {
		return this.stuRoot;
	}

	public void setStuRoot(String stuRoot) {
		this.stuRoot = stuRoot;
	}

	public String getStuAcademy() {
		return this.stuAcademy;
	}

	public void setStuAcademy(String stuAcademy) {
		this.stuAcademy = stuAcademy;
	}

	public String getStuMajor() {
		return this.stuMajor;
	}

	public void setStuMajor(String stuMajor) {
		this.stuMajor = stuMajor;
	}

	public String getStuClass() {
		return this.stuClass;
	}

	public void setStuClass(String stuClass) {
		this.stuClass = stuClass;
	}

	public String getStuPoliticalStatus() {
		return this.stuPoliticalStatus;
	}

	public void setStuPoliticalStatus(String stuPoliticalStatus) {
		this.stuPoliticalStatus = stuPoliticalStatus;
	}

	public Date getStuEnrollmentDate() {
		return this.stuEnrollmentDate;
	}

	public void setStuEnrollmentDate(Date stuEnrollmentDate) {
		this.stuEnrollmentDate = stuEnrollmentDate;
	}

	public String getStuContactWay() {
		return this.stuContactWay;
	}

	public void setStuContactWay(String stuContactWay) {
		this.stuContactWay = stuContactWay;
	}

	public Boolean getSemester() {
		return this.semester;
	}

	public void setSemester(Boolean semester) {
		this.semester = semester;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	@Override
	public String toString() {
		return "Student [stuNum=" + stuNum + ", stuName=" + stuName
				+ ", stuSex=" + stuSex + ", stuAge=" + stuAge + ", stuBirth="
				+ stuBirth + ", stuMinority=" + stuMinority + ", stuRoot="
				+ stuRoot + ", stuAcademy=" + stuAcademy + ", stuMajor="
				+ stuMajor + ", stuClass=" + stuClass + ", stuPoliticalStatus="
				+ stuPoliticalStatus + ", stuEnrollmentDate="
				+ stuEnrollmentDate + ", stuContactWay=" + stuContactWay
				+ ", semester=" + semester + ", password=" + password
				+ "]";
	}

}