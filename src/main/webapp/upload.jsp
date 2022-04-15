<%--
  Created by IntelliJ IDEA.
  User: why
  Date: 2022/4/14
  Time: 16:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/upload" method="post" enctype="multipart/form-data">
    File<input type="file" name="multipartFile"/>
    <input type="submit" value="submit"/>
</form>
</body>
</html>
