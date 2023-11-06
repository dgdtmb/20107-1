<!DOCTYPE html>
<%@ page contentType="text/html;charset=utf-8"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <div>
        <form action="/src/subpage.jsp">
        ID: <input type="text" name="id">
        PASSWORD: <input type="text" name="password">
        <button type="submit">로그인</button>
        </form>

    </div>
  
    ID는 <%=session.getAttribute("id")%>
    PASSWORD sms <%=session.getAttribute("password")%>

    
</body>
</html>