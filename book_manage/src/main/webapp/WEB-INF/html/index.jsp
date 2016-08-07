<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/8/3
  Time: 9:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <script type="text/javascript">
        //Login
        function login() {
            var form = document.forms[0];
            form.action = "${pageContext.request.contextPath}/user/login";
            form.method = "post";
            form.submit();
        }
    </script>

</head>
<body>

<form action="/user/login">
    <table>
        <tr>
            <td>name</td>
            <td>
                <input type="text" name="name">
            </td>
        </tr>
        <tr>
            <td>password</td>
            <td>
                <input type="password" name="password">
            </td>
        </tr>
        <%--<tr>--%>
            <%--<td></td>--%>
            <%--<td>--%>
                <%--<input type="button" value="提交" onclick="login()">--%>
            <%--</td>--%>
        <%--</tr>--%>
        <tr>
            <td></td>
            <td>
                <input type="submit" value="提交">
            </td>
        </tr>
    </table>
</form>

</body>
</html>
