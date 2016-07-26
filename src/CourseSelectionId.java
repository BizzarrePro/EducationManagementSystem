// default package



/**
 * CourseSelectionId entity. @author MyEclipse Persistence Tools
 */

public class CourseSelectionId  implements java.io.Serializable {


    // Fields    

     private Student student;
     private Course course;
     private Teacher teacher;


    // Constructors

    /** default constructor */
    public CourseSelectionId() {
    }

    
    /** full constructor */
    public CourseSelectionId(Student student, Course course, Teacher teacher) {
        this.student = student;
        this.course = course;
        this.teacher = teacher;
    }

   
    // Property accessors

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
   



   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof CourseSelectionId) ) return false;
		 CourseSelectionId castOther = ( CourseSelectionId ) other; 
         
		 return ( (this.getStudent()==castOther.getStudent()) || ( this.getStudent()!=null && castOther.getStudent()!=null && this.getStudent().equals(castOther.getStudent()) ) )
 && ( (this.getCourse()==castOther.getCourse()) || ( this.getCourse()!=null && castOther.getCourse()!=null && this.getCourse().equals(castOther.getCourse()) ) )
 && ( (this.getTeacher()==castOther.getTeacher()) || ( this.getTeacher()!=null && castOther.getTeacher()!=null && this.getTeacher().equals(castOther.getTeacher()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getStudent() == null ? 0 : this.getStudent().hashCode() );
         result = 37 * result + ( getCourse() == null ? 0 : this.getCourse().hashCode() );
         result = 37 * result + ( getTeacher() == null ? 0 : this.getTeacher().hashCode() );
         return result;
   }   





}