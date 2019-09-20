

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <title>Pogresan username ili password</title>
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

    <form name="forma" action="login_student.jsp" method="POST">

        <div class="loginbox">
            <img src="images/login.png" class="avatar">
            <h1>Pogresno uneseni  <br> Username ili Password!</h1>
            <br>
                <br>
            <form> 
                <input type="submit" name="u" value="Pokušajte ponovo Ucenik">
            </form>
            <br>
                <br>
                    <br>
            <form action="login_teacher.jsp">
                <input type="submit" name="n" value="Pokušajte ponovo Nastavnik">
            </form>
            Pogriješili ste  <%=counter%> puta.
        </div>
    </form>
</body>
</html>
