<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cpath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>ȸ������</title>
<style type="text/css">
</style>
</head>
<body>
	-ȸ������-
	<form action="../../insert" method="post"> <!-- testPage�� �̵� -->
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
				<td>�̸�</td>
				<td><input type="text" name="name" /></td>
			</tr>
						
			<tr>
				<td>E-mail</td>
				<td><input type="text" name="email" /></td> 		
			</tr>

			<tr>
				<td>����</td>
				<td><input type="number" name="age" /></td>
			</tr>

			<tr>			
				<td>����</td>
				<td><input type="text" name="gender"/></td>
		
			</tr>
			
			
			
			<tr>
				<td colspan="2" align="center"><input type="submit" value="����" />
					<input type="reset" value="���" />
			</tr>
		</table>
	</form>
</body>
</html>