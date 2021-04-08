<%--
  Created by IntelliJ IDEA.
  User: anngonzales
  Date: 4/8/21
  Time: 2:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% if (request.getMethod().equals("POST")) {
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    if (username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("password")) {
        response.sendRedirect("/profile.jsp");
    } else {
        response.sendRedirect("login.jsp");
    }
}
%>

<html>
<head>
    <title>Login</title>
</head>
<body>

<form action="/login.jsp" method="POST">

    <div class="container">
        <label for="username"><b>Username</b></label>
        <input id="username"input type="text" placeholder="Enter Username" name="username" required>

        <label for="password"><b>Password</b></label>
        <input id="password"input type="password" placeholder="Enter Password" name="password" required>

        <button type="submit">Login</button>

    </div>
</form>




</body>
</html>
