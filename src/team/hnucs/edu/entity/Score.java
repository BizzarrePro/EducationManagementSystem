package team.hnucs.edu.entity;
// default package



/**
 * Score entity. @author MyEclipse Persistence Tools
 */

public class Score  implements java.io.Serializable {


    // Fields    

     private ScoreId id;
     private Student student;
     private Course course;


    // Constructors

    /** default constructor */
    public Score() {
    }

    
    /** full constructor */
    public Score(ScoreId id, Student student, Course course) {
        this.id = id;
        this.student = student;
        this.course = course;
    }

   
    // Property accessors

    public ScoreId getId() {
        return this.id;
    }
    
    public void setId(ScoreId id) {
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