<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/3/24
  Time: 3:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript">
        window.onload = function(){
            document.getElementsByClassName("btn").onclick=function (){



            }
        }

    </script>

</head>
<body>
头部信息</br>
主体内容</br>
<%--
<%@
    include file=""
%>就是静态包含
--%>
<%--<%@include file="/pages/include/footer.jsp"%>--%>
<form action="../../showServlet"method="get">
<input type="text" name="name" class="name">
<input type="submit" class="btn"value="submit">
</form>


<%--<jsp:include page="/pages/include/showInfor.jsp"></jsp:include>&lt;%&ndash;动态包含&ndash;%&gt;--%>
</body>
</html>
