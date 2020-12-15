<%--
  Created by IntelliJ IDEA.
  User: Huawei
  Date: 12/13/2020
  Time: 4:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<html>
<head>
    <title>选择结果</title>
</head>
<body>

欢迎：<br>
<font color="green" size="22">

    <%
        String UserName = (String)request.getAttribute("UserName");
        out.print("Liu");
    %>
</font>
<br>

发现了混入革命队伍的败类：<br>
<%
    String [] s1 = (String [])request.getAttribute("s");
    for (String s : s1) {
        out.print(s + "<br>");
    }
%>

<a href="<%=request.getContextPath()%>/index.jsp">点击这里重新登录</a>

</body>
</html>
