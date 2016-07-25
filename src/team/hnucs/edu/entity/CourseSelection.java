package team.hnucs.edu.entity;
// default package



/**
 * CourseSelection entity. @author MyEclipse Persistence Tools
 */

public class CourseSelection  implements java.io.Serializable {


    // Fields    

     private CourseSelectionId id;
     private Student student;
     private Course course;
     private Teacher teacher;


    // Constructors

    /** default constructor */
    public CourseSelection() {
    }

    
    /** full constructor */
    public CourseSelection(CourseSelectionId id, Student student, Course course, Teacher teacher) {
        this.id = id;
        this.student = student;
        this.course = course;
        this.teacher = teacher;
    }

   
    // Property accessors

    public CourseSelectionId getId() {
        return this.id;
    }
    
    public void setId(CourseSelectionId id) {
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

    public Teacher getTeacher() {
        return this.teacher;
    }
    
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
   








}