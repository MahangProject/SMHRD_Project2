<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cpath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>회원가입</title>
<style type="text/css">
</style>
</head>
<body>
	-회원가입-
	<form action="../../insert" method="post"> <!-- testPage로 이동 -->
		<table border="0">

			<tr>	
				<td>id</td>
				<td><input type="text" name="id" /></td>
			</tr>
			<tr>
				<td>password</td>
				<td><input type="text" name="pw" /></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><input type="text" name="name" /></td>
			</tr>
						
			<tr>
				<td>E-mail</td>
				<td><input type="text" name="email" /></td> 		
			</tr>

			<tr>
				<td>나이</td>
				<td><input type="number" name="age" /></td>
			</tr>

			<tr>			
				<td>성별</td>
				<td><input type="text" name="gender"/></td>
		
			</tr>
			
			
			
			<tr>
				<td colspan="2" align="center"><input type="submit" value="가입" />
					<input type="reset" value="취소" />
			</tr>
		</table>
	</form>
</body>
</html>