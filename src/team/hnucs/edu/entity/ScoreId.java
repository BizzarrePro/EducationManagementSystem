package team.hnucs.edu.entity;
// default package



/**
 * ScoreId entity. @author MyEclipse Persistence Tools
 */

public class ScoreId  implements java.io.Serializable {


    // Fields    

     private Student student;
     private Course course;
     private Boolean semester;
     private Byte score;


    // Constructors

    /** default constructor */
    public ScoreId() {
    }

	/** minimal constructor */
    public ScoreId(Student student, Course course, Boolean semester) {
        this.student = student;
        this.course = course;
        this.semester = semester;
    }
    
    /** full constructor */
    public ScoreId(Student student, Course course, Boolean semester, Byte score) {
        this.student = student;
        this.course = course;
        this.semester = semester;
        this.score = score;
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

    public Boolean getSemester() {
        return this.semester;
    }
    
    public void setSemester(Boolean semester) {
        this.semester = semester;
    }

    public Byte getScore() {
        return this.score;
    }
    
    public void setScore(Byte score) {
        this.score = score;
    }
   



   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ScoreId) ) return false;
		 ScoreId castOther = ( ScoreId ) other; 
         
		 return ( (this.getStudent()==castOther.getStudent()) || ( this.getStudent()!=null && castOther.getStudent()!=null && this.getStudent().equals(castOther.getStudent()) ) )
 && ( (this.getCourse()==castOther.getCourse()) || ( this.getCourse()!=null && castOther.getCourse()!=null && this.getCourse().equals(castOther.getCourse()) ) )
 && ( (this.getSemester()==castOther.getSemester()) || ( this.getSemester()!=null && castOther.getSemester()!=null && this.getSemester().equals(castOther.getSemester()) ) )
 && ( (this.getScore()==castOther.getScore()) || ( this.getScore()!=null && castOther.getScore()!=null && this.getScore().equals(castOther.getScore()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getStudent() == null ? 0 : this.getStudent().hashCode() );
         result = 37 * result + ( getCourse() == null ? 0 : this.getCourse().hashCode() );
         result = 37 * result + ( getSemester() == null ? 0 : this.getSemester().hashCode() );
         result = 37 * result + ( getScore() == null ? 0 : this.getScore().hashCode() );
         return result;
   }   





}