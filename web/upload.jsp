<%--
  Created by IntelliJ IDEA.
  User: 王涛
  Date: 2019/4/2
  Time: 22:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <fieldset>
        <legend>文件上传</legend>
        <form action="/fileupload" method="post" enctype="multipart/form-data">
            <input type="file" name="file">
            <input type="submit" value="提交">
        </form>
    </fieldset>
</body>
</html>
