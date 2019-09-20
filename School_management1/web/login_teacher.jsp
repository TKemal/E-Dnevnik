

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
      <head>
        <title>Stranica za prijavu</title>
        <link rel="stylesheet" type= "text/css" href="style.css">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <%Integer counter = (Integer) session.getAttribute("counter");
        if (counter == null) {
            counter = new Integer(1);
        } else {
            counter = new Integer(counter.intValue() + 1);
        }
        session.setAttribute("counter", counter);
    %>
    <body>
        
        <form name="forma" action="LoginTeacherServlet" method="POST">

            <div class="loginbox">
                <img src="images/login.png" class="avatar">
                <h1>Prijava nastavnika</h1>
                <form>
                    <p>Korisničko ime</p>
                    <input type="text" name="usernameTeacher" placeholder="Unesite korisnicko ime" required="">
                    <p>Lozinka</p>
                    <input type="password" name="passwordTeacher" placeholder="Unesite lozinku" required="">
                    <input type="submit" name="l" value="Prijava">
                    </form>
                <form action="index.html">
                <input type="submit" name="nazad" value="Nazad na početnu stranicu">
                    Prijavljujete se <%=counter%> put.

                </form>
            </div>


        </form>
    </body>
</html>
