package entity;

import java.util.Date;

public class Evaluation  implements java.io.Serializable {


     private int students_has_evaluation_id;
     private int students_has_subjects_students_students_id;
     private int students_has_subjects_subjects_subjects_id;
     private int evaluation_evaluation_id;
     private String evaluation_time;

    public Evaluation() {
    }

   /* public Evaluation(int students_has_evaluation_id, int students_has_subjects_students_students_id, int students_has_subjects_subjects_subjects_id, int evaluation_evaluation_id, Date evaluation_time) {
        this.students_has_evaluation_id = students_has_evaluation_id;
        this.students_has_subjects_students_students_id = students_has_subjects_students_students_id;
        this.students_has_subjects_subjects_subjects_id = students_has_subjects_subjects_subjects_id;
        this.evaluation_evaluation_id = evaluation_evaluation_id;
        this.evaluation_time = evaluation_time;
    }*/

    public Evaluation(int students_has_subjects_students_students_id, int students_has_subjects_subjects_subjects_id, 
            int evaluation_evaluation_id, String evaluation_time) {
        this.students_has_subjects_students_students_id = students_has_subjects_students_students_id;
        this.students_has_subjects_subjects_subjects_id = students_has_subjects_subjects_subjects_id;
        this.evaluation_evaluation_id = evaluation_evaluation_id;
        this.evaluation_time = evaluation_time;
    }

    public int getStudents_has_evaluation_id() {
        return students_has_evaluation_id;
    }

    public void setStudents_has_evaluation_id(int students_has_evaluation_id) {
        this.students_has_evaluation_id = students_has_evaluation_id;
    }

    public int getStudents_has_subjects_students_students_id() {
        return students_has_subjects_students_students_id;
    }

    public void setStudents_has_subjects_students_students_id(int students_has_subjects_students_students_id) {
        this.students_has_subjects_students_students_id = students_has_subjects_students_students_id;
    }

    public int getStudents_has_subjects_subjects_subjects_id() {
        return students_has_subjects_subjects_subjects_id;
    }

    public void setStudents_has_subjects_subjects_subjects_id(int students_has_subjects_subjects_subjects_id) {
        this.students_has_subjects_subjects_subjects_id = students_has_subjects_subjects_subjects_id;
    }

    public int getEvaluation_evaluation_id() {
        return evaluation_evaluation_id;
    }

    public void setEvaluation_evaluation_id(int evaluation_evaluation_id) {
        this.evaluation_evaluation_id = evaluation_evaluation_id;
    }

    public String getEvaluation_time() {
        return evaluation_time;
    }

    public void setEvaluation_time(String evaluation_time) {
        this.evaluation_time = evaluation_time;
    }

    @Override
    public String toString() {
        return "Evaluation{" + "students_has_evaluation_id=" + students_has_evaluation_id + ", students_has_subjects_students_students_id=" + students_has_subjects_students_students_id + ", students_has_subjects_subjects_subjects_id=" + students_has_subjects_subjects_subjects_id + ", evaluation_evaluation_id=" + evaluation_evaluation_id + ", evaluation_time=" + evaluation_time + '}';
    }
    
}


