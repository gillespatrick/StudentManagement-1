<%-- 
    Document   : listStudents
    Created on : Jan 14, 2023, 6:21:16 PM
    Author     : gilles
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student List </title>
    </head>
    <body>
        <h1>Students List!</h1>


        <table border = 1>

            <tr>
                <th>
                    First Name
                </th>
                <th>
                    Last Name
                </th>
                <th>
                    email Name
                </th>
            </tr>


            <c:forEach var = "tempStudent" items = "${students_list}"  >

                <tr>
                    <td> ${tempStudent.firstName}</td>
                    <td> ${tempStudent.lastName}</td>
                    <td> ${tempStudent.email}</td>
                    
                </tr>    

            </c:forEach>
        </table>
    </body>
</html>
