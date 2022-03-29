<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/3/24
  Time: 2:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
1
    <%
        out.flush();
        out.write("out输出1</br>");

        out.write("out输出2</br>");
        response.getWriter().write("response输出1</br>");
        response.getWriter().write("response输出2</br>");
    %>
</body>
</html>
