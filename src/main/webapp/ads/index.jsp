<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--<jsp:useBean id="ads" scope="request" type=""/>--%>
<%--
  Created by IntelliJ IDEA.
  User: anngonzales
  Date: 4/13/21
  Time: 10:35 AM
  To change this template use File | Settings | File Templates.
--%>


<html>
<head>
    <title>Ads</title>
</head>
<body>

<h1>Ad Listings</h1>

<c:forEach var="ads" items="${ads}">
    <div>
        <h2>Ad id: ${ads.id}</h2>
        <p>User id: ${ads.userId}</p>
        <p>Title: ${ads.title}</p>
        <p>Description: ${ads.description}</p>
    </div>
</c:forEach>

</body>
</html>
