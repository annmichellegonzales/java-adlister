<%--
  Created by IntelliJ IDEA.
  User: anngonzales
  Date: 4/9/21
  Time: 12:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.Arrays" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="model.Contact" %>
<%@ page import="model.User" %>



<html>
<head>

    <title>Contacts</title>
    <style>
        h1 {
            color: rebeccapurple;
        }

        h3 {
            color: mediumpurple;
        }

        tr {
            background: hotpink;
            color: white;
            margin: 1em 0;
            padding: 1em;
            border-radius: .2em;
        }
    </style>

</head>
<body>

<h1>Krusty the Clown Show Employee Contacts</h1>
<h3>Online now: </h3>

<table>

    <thead>

    <tr>

        <td>Name</td>
        <td>Phone</td>
        <td>Email</td>
        <td>Address</td>
        <td>Profile created</td>

    </tr>

    </thead>

    <tbody>

    <c:forEach items="${contacts}" var="contact">
        <c:if test="${contact.getIsActive() == true}">

            <tr>
                <td>${contact.name}</td>
                <td>${contact.phoneNumber}</td>
                <td>${contact.email}</td>
                <td>${contact.address}</td>
                <td>${contact.getDate}</td>
                <img src="${contact.img_url}">
                <c:if test="${contact.name.equalsIgnoreCase(loggedInUser.name)}">
                    <a href="">Edit Contact</a>
                </c:if>
            </tr>

        </c:if>
    </c:forEach>

    </tbody>

</table>

</body>
</html>
