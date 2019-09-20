<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Unesite ID ucenika za dodavanje svih predmeta </title>
        <link rel="stylesheet" type= "text/css" href="style.css">
    </head>
    <body>
        <form name="forma" action="AddSubjectServlet" method="POST">

            <div class="loginbox">
                <img src="images/login.png" class="avatar">
                <h1>Unesite naziv nastavnog predmeta </h1>
                <form>
                    <p>Naziv nastavnog predmeta </p>
                    <input type="text" name="subject" placeholder="Unesite naziv predmeta " required >
                   
                    <input type="submit" name="s" value="Unesi">
                </form>
                </body>
                </html>
