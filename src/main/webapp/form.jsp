<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<form action="/Book" method="POST" target="_blank">
    Title
    <input type="text" name="title" value="<c:out value="${titleValue}"/>"/>
    ISBN
    <input type="text" name="isbn"/>
    <input type="submit" value="Post"/>
</form>
</body>
</html>



