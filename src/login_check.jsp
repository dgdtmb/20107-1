<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<%
    String id = request.getParameter("id");
    String   password = request.getParameter("password");
    String sql = "Select * fROM user where id = ? and password = ?";

    try{
        Connection conn = DBConnetion.getConnection();
        preparedStatement pstmt = conn.preparedStatement(sql);
        pstmt.setString(1, id);
        resultset result = pstmt.excuteQuery();
        
        while(result.next()){
            out.print(result.getString("name"))
        }
    } catch (Exception e) {
        e.printStackTrace()
    }
%>
</body>
</html>