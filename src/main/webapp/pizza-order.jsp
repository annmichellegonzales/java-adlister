<%--
  Created by IntelliJ IDEA.
  User: anngonzales
  Date: 4/12/21
  Time: 9:30 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="/pizza-order" id="pizzaform" method="POST">

    <label for="fname">Firstname:</label>
    <input type="text" id="fname" name="fname">

    <label for="crust">Choose crust:</label>
    <select name="crust" id="crust" form="pizzaform">
        <option value="thinandcrispy">Thin and Crispy</option>
        <option value="handtosse3d">Hand Tossed</option>
        <option value="pan">Pan</option>
        <option value="stuffedcrust">Stuffed Crust</option>
    </select>

    <label for="sauce">Choose sauce:</label>
    <select name="sauce" id="sauce" form="pizzaform">
        <option value="nosauce">No Sauce</option>
        <option value="light">Light</option>
        <option value="regular">Regular</option>
        <option value="heavy">Heavy</option>
    </select>

    <label for="size">Choose size:</label>
    <select name="size" id="size" form="pizzaform">
        <option value="small">Small</option>
        <option value="medium">Medium</option>
        <option value="large">Large</option>
    </select>

    <input type="submit">

</form>

</body>
</html>
