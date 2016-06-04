package team.hnucs.edu.entity;
// default package



/**
 * ExamArrangement entity. @author MyEclipse Persistence Tools
 */

public class ExamArrangement  implements java.io.Serializable {


    // Fields    

     private ExamArrangementId id;
     private Student student;
     private Course course;


    // Constructors

    /** default constructor */
    public ExamArrangement() {
    }

    
    /** full constructor */
    public ExamArrangement(ExamArrangementId id, Student student, Course course) {
        this.id = id;
        this.student = student;
        this.course = course;
    }

   
    // Property accessors

    public ExamArrangementId getId() {
        return this.id;
    }
    
    public void setId(ExamArrangementId id) {
        this.id = id;
    }

    public Student getStudent() {
        return this.student;
    }
    
    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return this.course;
    }
    
    public void setCourse(Course course) {
        this.course = course;
    }
   








}