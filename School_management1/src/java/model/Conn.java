package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conn {

    private static Connection conn = null;

    private Conn() {
    }

    public static Connection connection() throws SQLException {
        if (conn == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
            }
            try {
                conn = DriverManager.getConnection("jdbc:mysql://localhost/school_management3", "root", "Kemo.111");
            } catch (SQLException ex) {
                throw new SQLException(ex.getMessage());
            }
        }
        return conn;
    }
}
