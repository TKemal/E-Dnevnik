<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Unesite ID </title>
        <link rel="stylesheet" type= "text/css" href="style.css">
    </head>

    <body>

        <form name="forma" action="RewiewStudentServlet" method="POST">


            <div class="loginbox">
                <img src="images/login.png" class="avatar">
                <h1>Unesite svoj ID </h1>
                <form>
                    <p>Unesite svoj ID </p>
                    <input type="text" name="studentId" placeholder="Unesite svoj ID " required>

                    <input type="submit" name="s" value="Unesi">
                    <br>
                    <br>
                    <br>
                    <br>
                    <br>
                    <br>
                    <div>Sada je : <%= new java.util.Date()%></div>
                </form>
                </body>
                </html>
