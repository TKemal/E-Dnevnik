<%@page import= "java.sql.Statement" %>
<%@page import= "java.sql.Connection" %>
<%@page import= "java.sql.ResultSet" %>
<%@page import= "java.sql.DriverManager" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Stranica za ocijenjivanje</title>
        <link rel="stylesheet" type= "text/css" href="style.css">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>

    <body>
                <select>
<option>Odaberi predmet za ID Predmeta</option>
<option>ID-1	Bosanski, hrvatski, srpski</option>
<option>ID-2	Engleski jezik </option>
<option>ID-3	Njemacki jezik</option>
<option>ID-4	Francuski jezik</option>
<option>ID-5	Matematika</option>
<option>ID-6	Moja okolina</option>
<option>ID-7	Priroda</option>
<option>ID-8	Društvo</option>
<option>ID-9	Kultura življenja</option>
<option>ID-10	Historija/Povijest</option>
<option>ID-11	Geografija/Zemljopis</option>
<option>ID-12	Biologija</option> 
<option>ID-13	Hemija/Kemija</option>
<option>ID-14	Fizika</option>
<option>ID-15	Osnovi tehnike</option> 
<option>ID-16	Tehnička kultura</option>
<option>ID-17	Informatika</option> 
<option>ID-18	Likovna kultura</option>
<option>ID-19	Muzička/Glazbena kultura</option>
<option>ID-20	Tjelesni i zdravstveni odgoj</option>
<option>ID-21	Građansko obrazovanje</option>
<option>ID-22	Vjeronauka/Vjeronauk</option>
<option>ID-23	Društvo/Kultura/Religija</option>
        </select>
        <br>
            <br>
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
       
        <form name="forma" action="GradeStudentServlet" method="POST">

            <div class="loginbox">
                <img src="images/login.png" class="avatar">
                <h1>Ocijeni ucenika</h1>
                <form>
                    <p>I.D. ucenika:</p>
                    <input type="text" name="id" placeholder="Unesite I.D. ucenika (38)" required>
                    <p>I.D. predmeta:</p>
                    <input type="text" name="class" placeholder="Naziv predmeta (1)" required>
                    <p>Ocjena:</p>
                    <input type="text" name="grade" placeholder="Unesite ocjenu (1-5)" required>
                    <p>Datum:</p>
                    <input type="date" name="time" value="" />
                    <input type="submit" name="sm" value="Ocijeni">
                </form>
                <form name="forma" action="teacher_index_page.jsp" method="POST">
                    <input type="submit" name="nazad" value="Nazad na pocetnu stranicu">
                </form>
                
            </div>
        </form>
        
    </body>
</html>
