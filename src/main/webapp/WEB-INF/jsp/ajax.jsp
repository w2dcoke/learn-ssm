<%--
  Created by IntelliJ IDEA.
  User: why
  Date: 2022/4/13
  Time: 23:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/js/jquery-3.6.0.js"></script>
    <script>
        const list = new Array();
        list.push({id: 1, name: "why"});
        list.push({id: 2, name: "ethan"});
        $.ajax({
            url: "${pageContext.request.contextPath}/home9",
            type: "post",
            data: JSON.stringify(list),
            contentType: "application/json;charset=utf-8",
        })
    </script>
</head>
<body>

</body>
</html>
