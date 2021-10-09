<%@ page import="java.util.Enumeration" %><%--
  Created by IntelliJ IDEA.
  User: dlrud
  Date: 2021-10-09
  Time: 오후 2:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String msg = (String) request.getAttribute("msg");
    System.out.println(msg);
%>
<html>
<head>
</head>
<body>
<%=msg%>
</body>
</html>
