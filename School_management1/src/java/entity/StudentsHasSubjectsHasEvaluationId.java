package entity;

public class StudentsHasSubjectsHasEvaluationId  implements java.io.Serializable {


     private int studentsStudentsId;
     private int subjectsHasEvaluationSubjectsSubjectsId;
     private int subjectsHasEvaluationEvaluationEvaluationId;

    public StudentsHasSubjectsHasEvaluationId() {
    }

    public StudentsHasSubjectsHasEvaluationId(int studentsStudentsId, int subjectsHasEvaluationSubjectsSubjectsId, int subjectsHasEvaluationEvaluationEvaluationId) {
       this.studentsStudentsId = studentsStudentsId;
       this.subjectsHasEvaluationSubjectsSubjectsId = subjectsHasEvaluationSubjectsSubjectsId;
       this.subjectsHasEvaluationEvaluationEvaluationId = subjectsHasEvaluationEvaluationEvaluationId;
    }
   
    public int getStudentsStudentsId() {
        return this.studentsStudentsId;
    }
    
    public void setStudentsStudentsId(int studentsStudentsId) {
        this.studentsStudentsId = studentsStudentsId;
    }
    public int getSubjectsHasEvaluationSubjectsSubjectsId() {
        return this.subjectsHasEvaluationSubjectsSubjectsId;
    }
    
    public void setSubjectsHasEvaluationSubjectsSubjectsId(int subjectsHasEvaluationSubjectsSubjectsId) {
        this.subjectsHasEvaluationSubjectsSubjectsId = subjectsHasEvaluationSubjectsSubjectsId;
    }
    public int getSubjectsHasEvaluationEvaluationEvaluationId() {
        return this.subjectsHasEvaluationEvaluationEvaluationId;
    }
    
    public void setSubjectsHasEvaluationEvaluationEvaluationId(int subjectsHasEvaluationEvaluationEvaluationId) {
        this.subjectsHasEvaluationEvaluationEvaluationId = subjectsHasEvaluationEvaluationEvaluationId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof StudentsHasSubjectsHasEvaluationId) ) return false;
		 StudentsHasSubjectsHasEvaluationId castOther = ( StudentsHasSubjectsHasEvaluationId ) other; 
         
		 return (this.getStudentsStudentsId()==castOther.getStudentsStudentsId())
 && (this.getSubjectsHasEvaluationSubjectsSubjectsId()==castOther.getSubjectsHasEvaluationSubjectsSubjectsId())
 && (this.getSubjectsHasEvaluationEvaluationEvaluationId()==castOther.getSubjectsHasEvaluationEvaluationEvaluationId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getStudentsStudentsId();
         result = 37 * result + this.getSubjectsHasEvaluationSubjectsSubjectsId();
         result = 37 * result + this.getSubjectsHasEvaluationEvaluationEvaluationId();
         return result;
   }   


}


