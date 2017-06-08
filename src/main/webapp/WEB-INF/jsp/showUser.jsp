<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>用户信息列表</title>
</head>
<body>
<c:if test="${!empty list}">
    <c:forEach var="user" items="${list}">
        姓名：${user.userName}&nbsp;&nbsp;
        手机号：${user.userPhone}&nbsp;&nbsp;
        邮箱：${user.userEmail}<br>
    </c:forEach>
</c:if>

<c:if test="${!empty users}">
        姓名：${users.userName}&nbsp;&nbsp;
        手机号：${users.userPhone}&nbsp;&nbsp;
        邮箱：${users.userEmail}<br>
</c:if>

<c:if test="${!empty userN}">
姓名：${userN.userName}&nbsp;&nbsp;
手机号：${userN.userPhone}&nbsp;&nbsp;
邮箱：${userN.userEmail}<br>
</c:if>

<c:if test="${!empty userP}">
    姓名：${userP.userName}&nbsp;&nbsp;
    手机号：${userP.userPhone}&nbsp;&nbsp;
    邮箱：${userP.userEmail}<br>
</c:if>

<c:if test="${!empty user}">
    id：${user.id}&nbsp;&nbsp;
    电话：${user.userPhone}&nbsp;&nbsp;
    密码：${user.userPwd}<br>
</c:if>

</body>
</html>
