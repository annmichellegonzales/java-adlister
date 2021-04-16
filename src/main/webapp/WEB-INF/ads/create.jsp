<%--
  Created by IntelliJ IDEA.
  User: anngonzales
  Date: 4/13/21
  Time: 2:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create</title>
</head>
<body>

<div class="container">
    <h1>Create Ad</h1>
    <form action="/ads/create" method="post">
        <label for="title">Title</label>
        <input type="text" id="title" name="title">
        <label for="description">Description</label>
        <input type="text" id="description" name="description">
        <button>Save</button>
    </form>
</div>



</body>
</html>
