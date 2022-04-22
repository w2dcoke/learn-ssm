<%--
  Created by IntelliJ IDEA.
  User: why
  Date: 2022/4/22
  Time: 18:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update Account</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/account" method="post">
    <label>
        ID <input type="text" name="id"><br>
        Name <input type="text" name="name"/><br>
        Money <input type="text" name="money"/><br>
        <input type="submit" value="save"/>
    </label>
</form>
</body>
</html>
