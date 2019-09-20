package entity;

public class Subjects  implements java.io.Serializable {


     private Integer subjectsId;
     private String subject;

    public Subjects() {
    }

    public Subjects(Integer subjectsId, String subject) {
        this.subjectsId = subjectsId;
        this.subject = subject;
    }
    

    public Subjects(String subject) {
       this.subject = subject;
    }
   
    public Integer getSubjectsId() {
        return this.subjectsId;
    }
    
    public void setSubjectsId(Integer subjectsId) {
        this.subjectsId = subjectsId;
    }
    public String getSubject() {
        return this.subject;
    }
    
    public void setSubject(String subject) {
        this.subject = subject;
    }




}


