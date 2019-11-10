<%--
  Created by IntelliJ IDEA.
  User: 王涛
  Date: 2019/3/27
  Time: 20:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册页面</title>
</head>
<body>
    <fieldset>
        <legend>用户注册</legend>
        <form action="/param" method="post">
            账号：<input type="text" name="username"><br>
            密码：<input type="text" name="password"><br>
            <input type="submit" value="提交">
        </form>
    </fieldset>
    <fieldset>
        <legend>用户注册1</legend>
        <form action="/param1" method="post">
            账号：<input type="text" name="username"><br>
            密码：<input type="text" name="password"><br>
            <input type="submit" value="提交">
        </form>
    </fieldset>
    <fieldset>
        <legend>用户注册2</legend>
        <form action="/param2" method="post">
            账号：<input type="text" name="username"><br>
            密码：<input type="text" name="password"><br>
            <input type="submit" value="提交">
        </form>
    </fieldset>
    <fieldset>
        <legend>用户注册3</legend>
        <form action="/param3" method="post">
            账号：<input type="text" name="username"><br>
            密码：<input type="text" name="password"><br>
            <input type="submit" value="提交">
        </form>
    </fieldset>
    <fieldset>
        <legend>用户注册4</legend>
        <form action="/date" method="post">
            账号：<input type="text" name="username"><br>
            密码：<input type="text" name="password"><br>
            注册时间:<input type="date" name="date">
            <input type="submit" value="提交">
        </form>
    </fieldset>
</body>
</html>
