<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Unesi nastavnika</title>
        <link rel="stylesheet" type= "text/css" href="style.css">
    </head>
    <body>
        <form name="forma" action="InsertTeacherServlet" method="POST">

            <div class="loginbox">
                <img src="images/login.png" class="avatar">
                <h1>Unesi nastavnika</h1>
                <form>
                    <p>Postavite korisnicko ime nastavnika</p>
                    <input type="text" name="username" placeholder="Postavite korisnicko ime" required>
                    <p>postavite korisnicku lozinka nastavnika</p>
                    <input type="text" name="password" placeholder="Postavite lozinku" required>
                    <input type="submit" name="sbmt" value="Unesi">
                </form>
                </body>
                </html>
