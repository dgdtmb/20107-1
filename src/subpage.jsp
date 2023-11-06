<!DOCTYPE html>
<%@ page contentType="text/html;charset=utf-8"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<%
    session = request.getSession();

    session.setAttribute("id", request.getParameter("id"));
    session.setAttribute("password", request.getParameter("password"));
%>

<% String id= session.getAttribute("id").toString();%>
<% String password = session.getAttribute("password").toString();%>
<% if(session.getAttribute("id").equals("") && session.getAttribute("password").equals("")) {
    out.print("로그인 성공");
} %>

<button type="button" onclick=location.href="/src/index.jsp">홈으로</button>
</body>
</html>