<%--
  Created by IntelliJ IDEA.
  User: ranxiusuo
  Date: 2020/2/7
  Time: 8:51 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    Welcome: ${sessionScope.username}
    <br><br>
    Count: ${applicationScope.count}
    <br><br>
    <a href="user-logout.do">Do Log out</a>
</body>
</html>
