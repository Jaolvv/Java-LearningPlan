<%--
  Created by IntelliJ IDEA.
  User: Huawei
  Date: 1/4/2021
  Time: 10:57 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="com.zcloud.issue.dao.IssueDao" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>删除缺陷</title>
</head>
<body>
<%
    String id = request.getParameter("id");
    IssueDao issueDao = new IssueDao();
    String state = "";
    try {
        issueDao.delete(id);
        state = "删除成功！";
    } catch (Exception exception) {
        state = "删除失败！";
    }

%>
<H1><%=state%></H1>
<input type="button" name="return" value="返回缺陷列表"
       onclick="returnIssueList()"/>
</body>

<script>
    returnIssueList = () => {
        window.location.href = "issueList.jsp"
    }
</script>
</html>