package entity;
import java.util.HashSet;
import java.util.Set;

public class Students  implements java.io.Serializable {


     private Integer studentsId;
     private String name;
     private String parentName;
     private String surname;
     private int dob;
     private int clas;
     private int subClass;
     private Set userses = new HashSet(0);
     private Set studentsHasSubjectsHasEvaluations = new HashSet(0);

    public Students() {
    }

	
    public Students(String name, String surname, int dob, int class_, int subClass) {
        this.name = name;
        this.surname = surname;
        this.dob = dob;
        this.clas = class_;
        this.subClass = subClass;
    }
    public Students(String name, String parentName, String surname, int dob, int class_, int subClass) {
       this.name = name;
       this.parentName = parentName;
       this.surname = surname;
       this.dob = dob;
       this.clas = class_;
       this.subClass = subClass;
    }
   
    
    public Integer getStudentsId() {
        return this.studentsId;
    }
    
    public void setStudentsId(Integer studentsId) {
        this.studentsId = studentsId;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getParentName() {
        return this.parentName;
    }
    
    public void setParentName(String parentName) {
        this.parentName = parentName;
    }
    public String getSurname() {
        return this.surname;
    }
    
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public int getDob() {
        return this.dob;
    }
    
    public void setDob(int dob) {
        this.dob = dob;
    }
    public int getClas() {
        return this.clas;
    }
    
    public void setClas(int clas) {
        this.clas = clas;
    }
    public int getSubClass() {
        return this.subClass;
    }
    
    public void setSubClass(int subClass) {
        this.subClass = subClass;
    }
    public Set getUserses() {
        return this.userses;
    }
    
    public void setUserses(Set userses) {
        this.userses = userses;
    }
    public Set getStudentsHasSubjectsHasEvaluations() {
        return this.studentsHasSubjectsHasEvaluations;
    }
    
    public void setStudentsHasSubjectsHasEvaluations(Set studentsHasSubjectsHasEvaluations) {
        this.studentsHasSubjectsHasEvaluations = studentsHasSubjectsHasEvaluations;
    }




}


