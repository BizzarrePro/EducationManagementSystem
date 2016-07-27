package team.hnucs.edu.entity;

// default package

/**
 * ExamArrangementId entity. @author MyEclipse Persistence Tools
 */

public class ExamArrangementId implements java.io.Serializable {

	// Fields

	private Course course;
	private String examAddr;
	private Short seatId;
	private Student student;
	private String examTime;

	// Constructors

	/** default constructor */
	public ExamArrangementId() {
	}

	/** full constructor */
	public ExamArrangementId(Course course, String examAddr, Short seatId,
			Student student, String examTime) {
		this.course = course;
		this.examAddr = examAddr;
		this.seatId = seatId;
		this.student = student;
		this.examTime = examTime;
	}

	// Property accessors

	public Course getCourse() {
		return this.course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public String getExamAddr() {
		return this.examAddr;
	}

	public void setExamAddr(String examAddr) {
		this.examAddr = examAddr;
	}

	public Short getSeatId() {
		return this.seatId;
	}

	public void setSeatId(Short seatId) {
		this.seatId = seatId;
	}

	public Student getStudent() {
		return this.student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String getExamTime() {
		return this.examTime;
	}

	public void setExamTime(String examTime) {
		this.examTime = examTime;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ExamArrangementId))
			return false;
		ExamArrangementId castOther = (ExamArrangementId) other;

		return ((this.getCourse() == castOther.getCourse()) || (this
				.getCourse() != null && castOther.getCourse() != null && this
				.getCourse().equals(castOther.getCourse())))
				&& ((this.getExamAddr() == castOther.getExamAddr()) || (this
						.getExamAddr() != null
						&& castOther.getExamAddr() != null && this
						.getExamAddr().equals(castOther.getExamAddr())))
				&& ((this.getSeatId() == castOther.getSeatId()) || (this
						.getSeatId() != null && castOther.getSeatId() != null && this
						.getSeatId().equals(castOther.getSeatId())))
				&& ((this.getStudent() == castOther.getStudent()) || (this
						.getStudent() != null && castOther.getStudent() != null && this
						.getStudent().equals(castOther.getStudent())))
				&& ((this.getExamTime() == castOther.getExamTime()) || (this
						.getExamTime() != null
						&& castOther.getExamTime() != null && this
						.getExamTime().equals(castOther.getExamTime())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCourse() == null ? 0 : this.getCourse().hashCode());
		result = 37 * result
				+ (getExamAddr() == null ? 0 : this.getExamAddr().hashCode());
		result = 37 * result
				+ (getSeatId() == null ? 0 : this.getSeatId().hashCode());
		result = 37 * result
				+ (getStudent() == null ? 0 : this.getStudent().hashCode());
		result = 37 * result
				+ (getExamTime() == null ? 0 : this.getExamTime().hashCode());
		return result;
	}

}