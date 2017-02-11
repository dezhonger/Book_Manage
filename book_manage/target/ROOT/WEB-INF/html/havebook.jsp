<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/8/3
  Time: 15:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <title>havebook</title>
    <%--${result}--%>

    <table border="2" >
        <caption>我的数据库书籍列表</caption>
        <thead>
        <tr>
            <td>图书名称</td>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="x" items="${result}">
            <tr>
                <td>${x.bookname}</td>
                <td><a href="<c:url value="/book/"/>deletemy/${x.id}">删除</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

    <div style="text-align:right">
        <a href="<c:url value="/book/list"/>">返回书籍列表</a><br>
    </div>
</head>
<body>

</body>
</html>
