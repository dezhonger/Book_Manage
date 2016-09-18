<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!--<%@ page contentType="text/html;charset=UTF-8" language="java" %>-->
<html>
<head>
    <title>DaoHang</title>
</head>
<body>
<style>
    ul{overflow: hidden; width:100%;}
    ul li{width: 20%; float: left;list-style: none;}
    li a{display:block; width:100px; height:20px; border:1px solid #5466da;}
    a:link {color: #000000}		/* 未访问的链接 */
    a:visited {color: #00FF00}	/* 已访问的链接 */
    a:hover {color: #FF00FF}	/* 鼠标移动到链接上 */
    a:active {color: #0000FF}	/* 选定的链接 */
</style>

<div style="border:1px solid #000;margin:10px">
    <ul>
<c:forEach var="x" items="${list}">
        <li><a href=${x.url}>${x.name}</a></li>
</c:forEach>
    </ul>
</div>



</body>
</html>
