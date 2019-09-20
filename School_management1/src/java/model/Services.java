package model;

import entity.Evaluation;
import entity.Students;
import entity.Subjects;
import entity.Teachers;
import entity.Users;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Services {

    private static Statement st;
    private static ResultSet rs;
    private static final ArrayList<Users> usersList = new ArrayList();
    CallableStatement cs = null;
    private static List<String> ls; 

    private static Statement Connects() throws SQLException {
        return Conn.connection().createStatement();
    }

    private static Statement ConnectsPreparedCall() throws SQLException {
        return Conn.connection().prepareCall("");
    }
    

    public static void insertStudent(Students u) throws SQLException {
        st = Connects();
         String insert = "INSERT INTO `school_management3`.`students` (`name`, `parent_name`, `surname`, `dob`, `class`, `sub_class`) VALUES ('" 
         + u.getName() + "','" + u.getParentName() +"','" + u.getSurname() + "','" + u.getDob() + "','" + u.getClas() +"','"+ u.getSubClass() +  "')";
        st.executeUpdate(insert);
        /*String procedura = "{ CALL insertStudent('"
                + u.getName() + "','"
                + u.getParentName() + "','"
                + u.getSurname() + "','"
                + u.getDob() + "','"
                + u.getClas() + "','"
                + u.getSubClass() + "') }";
        st.executeQuery(procedura);*/
    }

    public static boolean loginUsers(Users u) throws SQLException {
        st = Connects();
        String query = "select * from users where username ='" + u.getUsername()
                + "' and password='" + u.getPassword() + "'";
        rs = st.executeQuery(query);
        return rs.next();
    }

    public static boolean loginTeacher(Teachers t) throws SQLException {
        st = Connects();
        String query = "select * from teachers where username ='" + t.getUsername()
                + "' and password='" + t.getPassword() + "'";
        rs = st.executeQuery(query);
        return rs.next();
    }

    public static void insertUser(Users u) throws SQLException {
        st = Connects();
        String insertUser = "INSERT INTO `school_management3`.`users` (`username`, `password`) VALUES ('"
                + u.getUsername() + "','" + u.getPassword() + "')";
        st.executeUpdate(insertUser);
    }

    public static void insertTeacher(Teachers t) throws SQLException {
        st = Connects();
        String insertUser = "INSERT INTO `school_management3`.`teachers` (`username`, `password`) VALUES ('"
                + t.getUsername() + "','" + t.getPassword() + "')";
        st.executeUpdate(insertUser);
    }

    public static void evaluateSudent(Evaluation e) throws SQLException {
        st = Connects();
        String insertUser = "INSERT INTO `school_management3`.`students_has_subjects_has_evaluation`"
                + "(`students_has_subjects_students_students_id`, "
                + "`students_has_subjects_subjects_subjects_id`,"
                + " `evaluation_evaluation_id`, `evaluation_time`) VALUES ('" + e.getStudents_has_subjects_students_students_id()
                + "','" + e.getStudents_has_subjects_subjects_subjects_id() + "','"
                + e.getEvaluation_evaluation_id() + "','" + e.getEvaluation_time() + " ')";
        st.executeUpdate(insertUser);
    }
    
    public static void addSubject(Subjects s) throws SQLException {
        st = Connects();
        String insertUser = "INSERT INTO school_management3.subjects (`subject`) VALUES ('"
                + s.getSubject() + "')";
        st.executeUpdate(insertUser);
    }
     public static List<String> selectAllNames(Students name) throws SQLException {
        st = Connects();
        String query = "select * from school_management3.students where name" ;
        rs = st.executeQuery(query);
        return ls;
    }

}
