<%--
  Created by IntelliJ IDEA.
  User: why
  Date: 2022/4/13
  Time: 22:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/home8" method="post">
        <input type="input" name="list[0].id"><br>
        <input type="input" name="list[0].name"><br>
        <input type="input" name="list[1].id"><br>
        <input type="input" name="list[1].name"><br>
        <input type="submit" value="Submit">
</form>
</body>
</html>
