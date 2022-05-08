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
<form action="${pageContext.request.contextPath}/uploadMulti" method="post" enctype="multipart/form-data">
    <h3>UploadMulti</h3>
    <input type="file" name="multipartFiles" multiple/><br>
    <input type="submit" value="submit"/>
</form>
</body>
</html>
