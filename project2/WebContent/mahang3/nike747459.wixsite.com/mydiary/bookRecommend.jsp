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
	String book1 = request.getParameter("book1"); 
	String book2 = request.getParameter("book2"); 
	String book3 = request.getParameter("book3"); 
	
	String result = book1+", "+book2+", "+book3;
%>
<h1>����� ������ å�� ������� <%= result %>���� ��õ�մϴ�.</h1>
</body>
</html>