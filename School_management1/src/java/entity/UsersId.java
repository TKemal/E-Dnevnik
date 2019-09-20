package entity;

public class UsersId  implements java.io.Serializable {


     private String username;
     private int studentsStudentsId;

    public UsersId() {
    }

    public UsersId(String username, int studentsStudentsId) {
       this.username = username;
       this.studentsStudentsId = studentsStudentsId;
    }
   
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    public int getStudentsStudentsId() {
        return this.studentsStudentsId;
    }
    
    public void setStudentsStudentsId(int studentsStudentsId) {
        this.studentsStudentsId = studentsStudentsId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof UsersId) ) return false;
		 UsersId castOther = ( UsersId ) other; 
         
		 return ( (this.getUsername()==castOther.getUsername()) || ( this.getUsername()!=null && castOther.getUsername()!=null && this.getUsername().equals(castOther.getUsername()) ) )
 && (this.getStudentsStudentsId()==castOther.getStudentsStudentsId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getUsername() == null ? 0 : this.getUsername().hashCode() );
         result = 37 * result + this.getStudentsStudentsId();
         return result;
   }   


}


