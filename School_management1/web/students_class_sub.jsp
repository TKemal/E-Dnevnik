<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Unesite ID </title>
        <link rel="stylesheet" type= "text/css" href="style.css">
    </head>
    <body>
        <form name="forma" action="ClassStudentServlet" method="POST">

            <div class="loginbox">
                <img src="images/login.png" class="avatar">
                <h1>Odaberite razred i odjeljenje</h1>
                <form>
                    <p>Unesite razred </p>
                    <input type="text" name="clas" placeholder="Unesite razred " required>
                    <p>Unesite odjeljenje </p>
                    <input type="text" name="subClas" placeholder="Unesite odjeljenje " required>
                   
                    <input type="submit" name="s" value="Unesi">
                </form>
                </body>
                </html>
