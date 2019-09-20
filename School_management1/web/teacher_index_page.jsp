

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Stranica za nastavnike</title>
        <link rel="stylesheet" type= "text/css" href="style.css">
    </head>
    <body>
        <div class="loginbox">
            <img src="images/login.png" class="avatar">
            <br>
            <br>
            <p>Registracija ucenika:</p>

            <form method="get" action="register_student.html">
                <input type="submit" name="reg" value="Registruj ucenika" />
            </form>
            <br>

            <form method="get" action="ViewStudentsServlet">
                <p>Pregled registrovanih ucenika po razredima:</p>   
                <input type="submit" value="Pregled"/>
            </form>
            <br>

            <p>Ocijeni ucenika:</p>
            <form method="get" action="grade_student.jsp">
                <input type="submit" name="sb" value="Ocijeni ucenika" />
            </form>
            <br>

            <p>Odaberite razred i odjeljenje :</p>
            <form method="get" action="students_class_sub.jsp">
                <input type="submit" name="s" value="Odaberite razred i odjeljenje" />
                <br>
                <br>
            </form>
            <p>Video uputstvo :</p>
            <form method="get" action="manual_teachers.jsp">
                <input type="submit" name="s" value="Pogledajte video uputstvo o radu" />
                <br>
                <br>
            </form>
            <form method="get" action="LogOutServlet">
                <p>Odjavite se</p>   
                <input type="submit" value="Odjava"/>
            </form>
        </div>
    </body>
</html>
