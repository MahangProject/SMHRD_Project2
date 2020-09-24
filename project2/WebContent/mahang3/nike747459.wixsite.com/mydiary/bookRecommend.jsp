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
	Flask 서버에서 전송한 결과값을 꺼내서 사용자에게 보여준다.(0 or 1값이 수신된다.)
	이미지를 바꿔도되고, 글자를 바꿔도되고 결과물에 대한 디자인은 여러분 맘대로~!!
 -->
<% 
	String book1 = request.getParameter("book1"); 
	String book2 = request.getParameter("book2"); 
	String book3 = request.getParameter("book3"); 
	
	String result = book1+", "+book2+", "+book3;
%>
<h1>당신이 선택한 책을 기반으로 <%= result %>들을 추천합니다.</h1>
</body>
</html>