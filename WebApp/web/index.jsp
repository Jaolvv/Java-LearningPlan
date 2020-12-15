<%--
  Created by IntelliJ IDEA.
  User: Huawei
  Date: 12/13/2020
  Time: 4:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>登录界面</title>

  <style type="text/css">
    body{ background-color:#d0e4fe; }
    *{margin: 0;padding: 0;}
    form{margin: 0 auto;padding:15px; width: 300px;height:300px;text-align: center;}
    #submit{padding: 15px}
    #submit input{width: 50px;height: 24px;}
  </style>

</head>

<body>
<!-- login -->
<div class="wrapper">
  <div align="center">用户名:Liu 密码:123</div>

  <form action="<%=request.getContextPath()%>/login" method="post">
    <label>用户名:</label>
    <input type="text" name="userName" value="${param.userName}"/><br><br>
    <label>密&nbsp码：</label>
    <input type="password" name="password"/><br>

    <font color="red">
      <%
        if(request.getAttribute("message")!= null){
          out.print(request.getAttribute("message"));
        }
      %>
    </font>

    <div id="submit">
      <input type="submit" value="登录"/>
    </div>

  </form>
</div>
</body>
</html>
