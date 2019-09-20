<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin index page</title>
         <link rel="stylesheet" type= "text/css" href="style.css">
    </head>
    <body>
        
        <div class="loginbox">
            <img src="images/login.png" class="avatar">
            <h2> Administratorski panel</h2>
            <br>
            <p>Registracija ucenika:</p>

            <form method="get" action="admin_register_student.html">
                <input type="submit" name="reg" value="Registruj ucenika" />
            </form>
          
          
            <p>Registruj ucenika kao korisnika</p>
            <form method="get" action="insert_user.jsp">
                <input type="submit" name="rk" value="Registruj korisnika" />
            </form>
         
            
            <p>Registruj Nastavnika kao korisnika</p>
            <form method="get" action="insert_teacher.jsp">
                <input type="submit" name="rn" value="Registruj Nastavnika" />
            </form>
           
            <p>Dodaj uceniku predmete</p>
            <form method="get" action="addSubjectToStudent.jsp">
                <input type="submit" name="dp" value="Dodaj uceniku predmete" />
            </form>
             <p>Dodaj nastavni predmet</p>
            <form method="get" action="addSubject.jsp">
                <input type="submit" name="dp" value="Dodaj nastavni predmet" />
            </form>
            <p>Video uputstvo</p>
            <form method="get" action="manual_admin.jsp">
                <input type="submit" name="dp" value="Video uputstva " />
            </form>
            <br>
             <form method="get" action="LogOutServlet">
                <p>Odjavite se</p>   
                <input type="submit" value="Odjava"/>
            </form>
        </div>
    </body>
</html>
