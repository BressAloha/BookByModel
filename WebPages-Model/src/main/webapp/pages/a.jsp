<%@ page import="javax.swing.*" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/3/23
  Time: 23:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <base href="http://localhost:8080/WebPages_Model/">
</head>
<body>
<p>
    <input class="name">

</p>
<p>这是JSP文件</p>
<%--
    <%! 这是声明脚本 %>
--%>
<%--
    <%= 这是表达式脚本 %>
--%>
<%--
    <% 这是代码脚本 %>
--%>
<%!
    public int sum(Integer a,Integer b) {
    return a+b;
}
%>
<%!
    private String username = "YYDSasda";
%>
<%=
    request.getParameter(username)
%>
<%=
    username
%>
<%
    for(int i = 0; i<10;i++){
%>
        <%=i%><%="very handsome!"%> <br>
<%
    }
%>
</body>
</html>
