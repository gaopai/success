<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/11/17 0017
  Time: 上午 11:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Hello World!</h2>
<a href="user/hello">Hello</a>

<a href="user/add/22">Hello</a>

<form action="user/add" method="post">
    姓名:<input type="text" name="name"/><br/>
    生日:<input type="date" name="birthday"/><br/>
    <input type="submit">
</form>
</body>
</html>
