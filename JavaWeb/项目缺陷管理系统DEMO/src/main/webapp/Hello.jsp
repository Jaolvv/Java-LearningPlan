<%--
  Created by IntelliJ IDEA.
  User: Huawei
  Date: 12/28/2020
  Time: 11:40 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>项目缺陷管理DEMO</title>
    <style type="text/css">
        body{
           background: #646b7a;
        }
    </style>
</head>
<body>
    <div class="wall" align="center">
        <div align="center">
            <h1 style="color: #ffffff">
                点击进入项目缺陷管理系统
            </h1>
        </div>
        <form action="<%=request.getContextPath()%>/issueList.jsp" method="post">
            <input type="button" name="return" value="进入缺陷列表" onclick="loginIssueList()"/>
        </form>
        <div style="color: #761c19">
            <h1>DEMO</h1>
        </div>
    </div>
</body>
<script>
    loginIssueList = () => {
        window.location.href = "issueList.jsp"
    }
</script>
</html>
