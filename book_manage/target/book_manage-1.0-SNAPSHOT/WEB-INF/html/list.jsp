<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/8/2
  Time: 14:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <style>
        table {

            border-collapse: collapse;

            font-family: Futura, Arial, sans-serif;

        }

        caption {
            padding: 0 0 5px 0;
            width: 700px;
            font: italic 11px "Trebuchet MS", Verdana, Arial, Helvetica, sans-serif;
            text-align: right;
        }

        caption {

            font-size: larger;

            margin: 1em auto;

        }

        th,td {

            padding: .65em;

        }

        th {

            background: #555 nonerepeat scroll 0 0;

            /* border: 1px solid #777; */

            color: #fff;

        }

        td {

            /* border: 1px solid #777; */

        }

        tbody tr:nth-child(odd) {

            background: #ccc;

        }
        tbody tr:hover {

            background: linear-gradient(#fff,#aaa);

            font-size: 17px;

        }

        th:first-child {

            border-radius: 9px 0 0 0;

        }

        th:last-child {

            border-radius: 0 9px 0 0;

        }

        tr:last-child td:first-child {

            border-radius: 0 0 0 9px;

        }

        tr:last-child td:last-child {

            border-radius: 0 0 9px 0;

        }
    </style>
    <%--<link rel="stylesheet" href="1.css" type="text/css">--%>

    <title>书籍列表</title>
    一共有${sum}条数据</head><br>
<div style="text-align:right">
    <a href="<c:url value="/user/"/>logout">登出</a>
</div>



        <table border="1" align="center">
            <caption>数据库书籍列表</caption>
            <thead>
            <tr>
                <td>书籍ID</td>
                <td>图书名称</td>
                <td>图书价格</td>
                <td>图书备注</td>
                <td></td>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="x" items="${result}">
            <tr>
                <td>${x.id}</td>
                <td>${x.name}</td>
                <td>${x.price}</td>
                <td>${x.info}</td>
                <td><a href="<c:url value="/book/"/>delete/${x.id}">删除</a></td>
                <td><a href="<c:url value="/book/"/>buy/${x.name}">添加到我的书库</a></td>
            </tr>
            </c:forEach>
            </tbody>
        </table>
<div style="text-align:right">
    <a href="<c:url value="/book/"/>add">新增书籍</a><br>
    <a href="<c:url value="/person/book/"/>${username}">展示我的书籍</a><br>
</div>





</head>
<body>

</body>
</html>
