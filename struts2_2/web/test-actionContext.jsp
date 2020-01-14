<%--
  Created by IntelliJ IDEA.
  User: suoranxiu
  Date: 2020/1/13
  Time: 14:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h4>Test ActionContext Page </h4>
    application:${applicationScope.applicationKey}
    <br><br>
    session:${sessionScope.sessionKey}
    <br><br>
    request:${requestScope.requestKey}
    <br><br>

</body>
</html>
