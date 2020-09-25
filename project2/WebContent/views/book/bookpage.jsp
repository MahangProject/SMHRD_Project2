<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@page import="java.util.*"%>
<%@page import="kr.mmem.model.*"%>
<%
	response.setCharacterEncoding("UTF-8");
	String id = "whizzerscowl";
	ArrayList<BookVO> list = (ArrayList<BookVO>)request.getAttribute("list");
	double[] list2 = (double[])request.getAttribute("list2");
	ArrayList<MMemberVO> list3 = (ArrayList<MMemberVO>)request.getAttribute("list3");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form action="http://localhost:9000/mahang/bookrecommend" method="get">
<input style='font-size:30pt;border:none;' type="text" name="id" value="<%=id%>" /><h4>님 환영합니다.</h4>
<input type="text" name="bookname" /><input type="submit" value="도서 추천"/>
<table border='1'>
		<tr>
			<td>책 제목</td>
			<td>분야</td>
			<td>책 소개</td>
			<td>사용자 평점</td>
			<td>해당 책 기준</td>
		</tr>
		<%
		for(int i = 0; i < 165; i++) { %>
		<tr>
			<td><%=list.get(i).getB_name()%></td>
			<td><%=list.get(i).getB_category() %></td>
			<td><a href=<%=list.get(i).getB_url()%>>책 소개 페이지로</a></td>
			<td><%=list2[i]%></td>
			<td><input type="submit" value="도서 추천"></td>
		</tr>
		<% } %>
</table>
</form>
</body>
</html>