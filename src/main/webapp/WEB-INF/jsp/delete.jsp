<%--
  Created by IntelliJ IDEA.
  User: why
  Date: 2022/4/22
  Time: 16:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete Account</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/account" method="post">
  <label>
      <input type="text" name="id"/><br>
      <input type="hidden" name="_method" value="delete">
      <input type="submit" value="Delete"/>
  </label>
</form>

</body>
</html>
