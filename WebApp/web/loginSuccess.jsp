<%--
  Created by IntelliJ IDEA.
  User: Huawei
  Date: 12/13/2020
  Time: 4:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>登录成功</title>

    <script src="jquery-3.5.1.js"></script>

    <script>
        $(function() {
            //toRight
            $("#toRight").click(function() {
                //获取右边的下拉列表对象，append(左边下拉列表选中的option)
                $("#rightName").append($("#leftName > option:selected"));
            });
        });
    </script>
    <style>
        #leftName, #btn, #rightName {
            width: 100px;
            height: 150px;
        }
        #toRight {
            margin-top: 100px;
            margin-left: 30px;
            width: 50px;
        }
        .border {
            height: 400px;
            padding: 100px;
        }
    </style>


</head>
<body>
Hello:<br>
<font color="green" size="22">
    <%
        out.print(request.getParameter("userName")+"<br>");
    %>
</font>
<a href="<%=request.getContextPath()%>/index.jsp">点击这里重新登录</a>

</div>

<div>
    <form action="${pageContext.request.contextPath}/HeroSelect" method="post" >
        <div class="border">
            英雄：
            <select id="leftName" multiple="multiple">
                <option value="葫芦娃">葫芦娃</option>
                <option value="一只耳">一只耳</option>
                <option value="美国队长">美国队长</option>
                <option value="黑猫警长">黑猫警长</option>
                <option value="唐老鸭的情妇">唐老鸭的情妇</option>
            </select>
            </select> <input type="button" id="toRight" value="-->"> 败类：

            <select id="rightName" name="bailei" multiple="multiple">

            </select>
            <br/>
            <input type="submit" value="提交">
        </div>
    </form>
</div>

</body>
</html>
