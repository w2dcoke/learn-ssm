<%--
  Created by IntelliJ IDEA.
  User: why
  Date: 2022/4/22
  Time: 15:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Find Account</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/account" method="get">
    <label>
        Account ID:<input type="text" name="id"/><br>
        <input type="submit" value="Find"/>
    </label>
</form>

</body>
</html>
