<%@page import= "java.sql.Statement" %>
<%@page import= "java.sql.Connection" %>
<%@page import= "java.sql.ResultSet" %>
<%@page import= "java.sql.DriverManager" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Unesite ID ucenika za dodavanje svih predmeta </title>
        <link rel="stylesheet" type= "text/css" href="style.css">
    </head>

    <body>
        <%
            Connection conn = null;
            Statement stmt = null;

            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/school_management3", "root", "Kemo.111");
            stmt = conn.createStatement();
            String query = ("SELECT students.students_id,students.surname,students.name FROM students ORDER BY students.surname, students.name");
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                int students_id = rs.getInt("students_id");
                String studentName = rs.getString("name");
                String studentSurname = rs.getString("surname");
        %>
        <table border="1">
            <tr><td>ID ucenika</td><td>Ime ucenika</td><td>Prezime ucenika</td></tr>
            <tr><td><%= students_id%></td><td><%= studentName%></td><td><%=studentSurname%></td></tr>
            <%
                }
            %>
        </table>
        <br>
        <br>
        <form name="forma" action="AddSubjectToStudentServlet" method="POST">

            <div class="loginbox">
                <img src="images/login.png" class="avatar">
                <h1>Dodaj uceniku predmete </h1>
                <form>
                    <p>Unesite studentov ID </p>
                    <input type="text" name="studentId" placeholder="Unesite studentov ID " required >

                    <input type="submit" name="s" value="Dodaj nastavne predmete">
                </form>
                </body>
                </html>
