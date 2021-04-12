<%--
  Created by IntelliJ IDEA.
  User: anngonzales
  Date: 4/12/21
  Time: 12:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Color Choice</title>
</head>
<body>

<form action="/pick-color" id="color" method="POST">
    <label for="color">Type in a Color: </label>
    <input type="text" name="color">
    <input type="submit">

</form>

</body>
</html>