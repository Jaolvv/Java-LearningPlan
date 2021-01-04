<%--
  Created by IntelliJ IDEA.
  User: Huawei
  Date: 1/4/2021
  Time: 11:05 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="com.zcloud.issue.entity.Issue" %>
<%@ page import="com.zcloud.issue.service.IssueManager" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>提交缺陷</title>
</head>
<body>
<%
    Issue issue = new Issue();
    issue.setName(request.getParameter("name"));
    issue.setType(request.getParameter("type"));
    issue.setRemark(request.getParameter("remark"));
    issue.setRemark(request.getParameter("state"));

    String state = "";
    IssueManager issueManager = new IssueManager();
    try {
        issueManager.saveIssue(issue);
        state = "保存成功！";
    } catch (Exception e) {
        e.printStackTrace();
        state = "保存失败！异常信息：" + e.getMessage();
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