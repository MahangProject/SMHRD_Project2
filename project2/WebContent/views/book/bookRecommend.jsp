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
<!-- 
	Flask �������� ������ ������� ������ ����ڿ��� �����ش�.(0 or 1���� ���ŵȴ�.)
	�̹����� �ٲ㵵�ǰ�, ���ڸ� �ٲ㵵�ǰ� ������� ���� �������� ������ �����~!!
 -->
<% 
	String book1 = new String(request.getParameter("book1").getBytes("ISO-8859-1"), "UTF-8");
	String book2 = new String(request.getParameter("book2").getBytes("ISO-8859-1"), "UTF-8");
	String book3 = new String(request.getParameter("book3").getBytes("ISO-8859-1"), "UTF-8");
	String result = book1+", "+book2+", "+book3;
%>
<h1>����� ������ å�� ������� <%= result %>���� ��õ�մϴ�.</h1>
<table border="1" align="center">
<tr align="center"><%if (book1.equals("�ʰ��� : ������ ����")){%>
	<td><a href="https://www.aladin.co.kr/shop/wproduct.aspx?ItemId=250399431">
	<img src="./views/img/book1.jpg" width="300px" height="400px"/></a></td>
	<td><a href="http://www.yes24.com/Product/Goods/90266627">
	<img src="./views/img/book2.jpg" width="300px" height="400px"/></a></td>
	<td><a href="https://www.aladin.co.kr/shop/wproduct.aspx?ItemId=251645804">
	<img src="./views/img/book3.jpg" width="300px" height="400px"/></a></td>
	<%}else { %>
	<td><a href="https://www.aladin.co.kr/shop/wproduct.aspx?ItemId=249224932">
	<img src="./views/img/book4.jpg" width="300px" height="400px"/></a></td>
	<td><a href="http://www.yes24.com/Product/Goods/89860367">
	<img src="./views/img/book5.jpg" width="300px" height="400px"/></a></td>
	<td><a href="http://www.yes24.com/Product/Goods/90442617">
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