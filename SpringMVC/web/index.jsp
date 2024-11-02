<%--
  Created by IntelliJ IDEA.
  User: Azhu
  Date: 2024/10/25
  Time: 上午9:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<h1>index</h1>
<a href="/hello">hello</a>
<a href="/stu/test01">test01</a>
<a href="/stu/test02">test02</a>
<form action="/stu/test03">
    <input type="text" name="sid"/>
    <input type="text" name="sname"/>
    <input type="password" name="spassword"/>
    <input type="text" name="sright"/>
    <input type="text" name="sflag"/>
    <input type="submit" name="注册">
</form>
<a href="/mvctest">Spring MVC Test</a>
</body>
</html>
