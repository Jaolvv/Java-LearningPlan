<%--
  Created by IntelliJ IDEA.
  User: Huawei
  Date: 1/4/2021
  Time: 11:02 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="com.zcloud.issue.entity.Issue" %>
<%@ page import="com.zcloud.issue.dao.IssueDao" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>提交缺陷</title>
</head>
<%
    String id = request.getParameter("id")==null?"":request.getParameter("id");
    IssueDao issueDao = new IssueDao();
    Issue issue = new Issue();
    if( ! id.equals("")) issue=issueDao.findIssueOne(id);
%>
<body>
<form action="IssueSave.jsp" method="post">
    <label>缺陷编号：<input name="id" value="<%=id%>" disabled/></label><br/>
    <label>缺陷名称：<input name="name" value="<%=issue.getName()%>"/></label><br/>
    <label>缺陷类型：<input name="type" value="<%=issue.getType()%>"/></label><br/>
    <label>缺陷描述：<input name="remark" value="<%=issue.getRemark()%>"/></label><br/>
    <label>缺陷状态：<input name="state" value="<%=issue.getState()%>"/></label><br/>
    <input type="submit" value="提交">&nbsp;&nbsp;
    <input type="reset" value="重置">
</form>
</body>
</html>