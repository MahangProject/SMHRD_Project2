<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%request.setCharacterEncoding("UTF-8");%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head> 
<body>
<%  //플라스크에서 받아온 값을 UTF-8로 인코딩
	String book1 = new String(request.getParameter("book1").getBytes("ISO-8859-1"), "UTF-8");
	String book2 = new String(request.getParameter("book2").getBytes("ISO-8859-1"), "UTF-8");
	String book3 = new String(request.getParameter("book3").getBytes("ISO-8859-1"), "UTF-8");
%>
<table border="1" align="center">
<tr align="center"><%if (book1.equals("멀쩡한 어른 되긴 글렀군")){//임시로 보여주기용%>
	<td><a href="https://www.aladin.co.kr/shop/wproduct.aspx?ItemId=250044628">
	<img src="./views/img/book1.jpg" width="300px" height="400px"/></a></td>
	<td><a href="http://www.yes24.com/Product/Goods/90895702">
	<img src="./views/img/book2.jpg" width="300px" height="400px"/></a></td>
	<td><a href=http://www.yes24.com/Product/Goods/91401551>
	<img src="./views/img/book3.jpg" width="300px" height="400px"/></a></td>
	<%}else { %>
	<td><a href="http://www.yes24.com/Product/Goods/91401551">
	<img src="./views/img/book3.jpg" width="300px" height="400px"/></a></td>
	<td><a href="https://www.aladin.co.kr/shop/wproduct.aspx?ItemId=249224932">
	<img src="./views/img/book4.jpg" width="300px" height="400px"/></a></td>
	<td><a href="https://www.aladin.co.kr/shop/wproduct.aspx?ItemId=228727924">
	<img src="./views/img/book6.jpg" width="300px" height="400px"/></a></td>
	<%} %>
</tr>
<tr align="center">
	<td><%=book1%></td>
	<td><%=book2%></td>
	<td><%=book3%></td>
</tr>
</table>
</body>
</html>