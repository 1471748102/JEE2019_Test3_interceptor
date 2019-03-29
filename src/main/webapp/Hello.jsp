<%--
  Created by IntelliJ IDEA.
  User: Hzw
  Date: 2019/3/29
  Time: 15:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Hello</title>
</head>
<body>
<s:debug/>
用户后缀为"r"的用户可以访问命名空间为"/sec"的action<br>
<a href="/sec/private.action">前去访问</a><br>
<a href="index.jsp">返回登录页面</a>
</body>
</html>
