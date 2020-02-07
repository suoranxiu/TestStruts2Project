<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: suoranxiu
  Date: 2020/1/13
  Time: 14:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

  <head>
    <title>$Title$</title>
  </head>

  <body>

    <a href="TestActionContext.action?name=suruxin">Test ActionContext</a>
    <br><br>
    <a href="TestAwareAction.action?name=suruxin">Test AwareAction</a>
    <br><br>
    <a href="TestServletActionContextAction.action?name=suruxin">Test ServletActionContextAction</a>
    <br><br>
    <a href="TestServletAwareAction.action?name=suruxin">Test TestServletAwareAction</a>
    <br><br>
    <a href="TestServletAwareAction.action?name=suruxin">Test TestServletAwareAction</a>
    <%
      if(application.getAttribute("date")== null){
        application.setAttribute("date",new Date());
      }
    %>
  </body>
</html>
