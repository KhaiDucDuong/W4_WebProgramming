<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Java Servlets and JSP</title>
        <link rel="stylesheet" href="styles/main.css" type="text/css"/>
    </head>
    <body>
        <h1>THanks for joining  our email list</h1>
        
        <p>Here is the information that you entered:</p>
        
        <label>Email:</label>
        <span>${user.email}</span><br>
        
        <label>First Name:</label>
        <span>${user.firstName}</span><br>
        
        <label>Last Name:</label>
        <span>${user.lastName}</span><br>
        
        <label>Date of Birth:</label>
        <span>${user.dateOfBirth}</span><br>
        
        <label>User hear option:</label>
        <span>${user.hearOption}</span><br>
        
        <label>User announcement choice:</label>
        <span>${user.isAnnoucement}</span><br>
        
        <label>User email announcement choice:</label>
        <span>${user.isEmailAnnoucement}</span><br>
        
        <label>User contact option:</label>
        <span>${user.contactOption}</span><br>
        
        <p>Click here to return back.</p>
        <form action="" method="get">
            <input type="hidden" name="action" value="join">
            <input type="submit" value="Return">
        </form>
    </body>
</html>
