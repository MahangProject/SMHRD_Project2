<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@page import="java.util.*"%>
<%@page import="kr.mmem.model.*"%>
<%
	response.setCharacterEncoding("UTF-8");
	String id = "whizzerscowl";
	ArrayList<BookVO> list = (ArrayList<BookVO>)request.getAttribute("list");
	double[] list2 = (double[])request.getAttribute("list2");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form action="http://localhost:9000/mahang/bookrecommend" method="get">
<h2><%=id%></h2><h4>�� ȯ���մϴ�.</h4>
<input type="text" name="id" value="<%=id%>" /><input type="text" name="bookname" /><input type="submit" value="���� ��õ"/>
<table border='1'>
		<tr>
			<td>å ����</td>
			<td>�о�</td>
			<td>å �Ұ�</td>
			<td>����� ����</td>
			<td>�ش� å ����</td>
		</tr>
		<%
		for(int i = 0; i < 165; i++) { %>
		<tr>
			<td><%=list.get(i).getB_name()%></td>
			<td><%=list.get(i).getB_category() %></td>
			<td><a href=<%=list.get(i).getB_url()%>>å �Ұ� ��������</a></td>
			<td><%=list2[i]%></td>
			<td><input type="submit" value="���� ��õ"></td>
		</tr>
		<% } %>
</table>
</form>
</body>
</html>