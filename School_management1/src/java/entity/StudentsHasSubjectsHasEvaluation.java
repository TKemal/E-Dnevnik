package entity;

public class StudentsHasSubjectsHasEvaluation  implements java.io.Serializable {


     private StudentsHasSubjectsHasEvaluationId id;
     private Students students;

    public StudentsHasSubjectsHasEvaluation() {
    }

    public StudentsHasSubjectsHasEvaluation(StudentsHasSubjectsHasEvaluationId id, Students students) {
       this.id = id;
       this.students = students;
    }
   
    public StudentsHasSubjectsHasEvaluationId getId() {
        return this.id;
    }
    
    public void setId(StudentsHasSubjectsHasEvaluationId id) {
        this.id = id;
    }
    public Students getStudents() {
        return this.students;
    }
    
    public void setStudents(Students students) {
        this.students = students;
    }




}


