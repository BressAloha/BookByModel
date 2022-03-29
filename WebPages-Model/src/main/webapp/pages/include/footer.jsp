<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/3/24
  Time: 3:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
页脚信息
<br>
改下
<%=
    "yes"

%>
<%

    out.print("我是最帅的");

    response.getWriter().write("黑诶嘿");
    for(int i=1;i<= 9;i++){
        %>
</br>
<%
        for(int j =1;j<= i;j++){
  %>
    <%=
    j+"*"+i+"="+(i*j)
 %><%

        }
    }

%>
</body>
</html>
