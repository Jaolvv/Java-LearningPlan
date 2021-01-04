<%--
  Created by IntelliJ IDEA.
  User: Huawei
  Date: 1/4/2021
  Time: 9:28 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.zcloud.issue.service.*" %>
<%@ page import="com.zcloud.issue.entity.Issue" %>
<%@ page import="java.util.List" %>
<%
    String name= request.getParameter("name");
    IssueManager issueManager = new IssueManager();
    List<Issue> issueList = issueManager.find(name);
%>
<html>
<head>
    <title>项目缺陷管理</title>
</head>
<body>
<Form action="issueList.jsp" method="post">
    请输入缺陷名称：
    <input name="name" value="<%=name==null?"":name%>">
    <input type="submit" value="查询">
    <input type="button" value="新增" onclick="onAdd()">
</Form>
<table style="border-collapse:collapse;border:none">
    <thead>
    <tr>
        <th style="border:solid #000 1px;">编号</th>
        <th style="border:solid #000 1px;">名称</th>
        <th style="border:solid #000 1px;">类型</th>
        <th style="border:solid #000 1px;">描述</th>
        <th style="border:solid #000 1px;">状态</th>
        <th style="border:solid #000 1px;">操作</th>
    </tr>
    </thead>
    <tbody>
    <% for (Issue issue : issueList) { %>
    <tr>
        <td style="border:solid #000 1px;"><%=issue.getId()%>
        </td>
        <td style="border:solid #000 1px;"><%=issue.getName()%>
        </td>
        <td style="border:solid #000 1px;"><%=issue.getType()%>
        </td>
        <td style="border:solid #000 1px;"><%=issue.getRemark()%>
        </td>
        <td style="border:solid #000 1px;"><%=issue.getState()%>
        </td>
        <td style="border:solid #000 1px;">
            <input type="button" name="delete" value="删除"
                   onclick="deleteById('<%=issue.getId()%>')"/>
            <input type="button" name="edit" value="编辑"
                   onclick="onEdit('<%=issue.getId()%>')"/>
        </td>
    </tr>
    <% } %>
    </tbody>
</table>
<span>共有：<%=issueList.size()%>个缺陷</span>

</body>
<script>
    deleteById = (id) => {
        window.location.href = "issueDelete.jsp?id=" + id
    }
    onAdd = () => {
        window.location.href = "issueEdit.jsp"
    }
    onEdit = (id) => {
        window.location.href = "issueEdit.jsp?id=" + id
    }
</script>
</html>
