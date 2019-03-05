<%@ taglib prefix="c" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2/12/2019
  Time: 2:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Detail</title>
</head>

<body>
    <h1>User Details</h1>
    <div>
        <span CLASS="id">User Id:</span>
        <span CLASS="id">${user.userId}</span>
    </div>
    <div>
        <span CLASS="username">User Name:</span>
        <span CLASS="userName">${user.userName}</span>
    </div>
    <div>
        <span CLASS="Password:">Password:</span>
        <span CLASS="userName">${user.password}</span>
    </div>
</body>
</html>
