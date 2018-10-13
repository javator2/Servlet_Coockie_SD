<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: goobar
  Date: 07.10.18
  Time: 00:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Books</title>
</head>
<body>
<br/>
Title:
    <c:out value="${title}"/>
<br/>
ISBN:
    <c:out value="${isbn}"/>
</body>
</html>