<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/8/2
  Time: 14:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>新增商品</title>
    <script type="text/javascript">
        //添加用户
        function addBook() {
            var form = document.forms[0];
            form.action = "${pageContext.request.contextPath}/book/addBook";
            form.method = "post";
            form.submit();
        }
    </script>
</head>
<body>
<form action="/book/addBook">
    <%--<form:errors path="*" cssClass="error" />--%>
    <table>
        <tr>
            <td>id</td>
            <td><input type="text" name="id" value = ""></td>
            <%--<td><form:input path="id" />--%>
            <%--<td><form:errors path="id"/>--%>
        </tr>
        <tr>
            <td>书名</td>
            <td>
                <input type="text" name="name" value = ${bookName}>
            </td>
        </tr>
        <tr>
            <td>价格</td>
            <td>
                <input type="text" name="price" value = ${bookPrice}>
            </td>
        </tr>
        <tr>
            <td>备注</td>
            <td>
                <input type="text" name="info" value = ${bookInfo}>
            </td>
        </tr>
        <tr>
            <td></td>
            <td>
                <input type="submit" value="提交">
            </td>
        </tr>
    </table>
</form>
<a href="<c:url value="/book/"/>list">书籍列表</a>
</body>
</html>
