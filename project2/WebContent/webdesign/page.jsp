<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.*"%>
<%@page import="kr.mmem.model.*"%>
<%
	response.setCharacterEncoding("UTF-8");
	String id = "whizzerscowl";
	ArrayList<BookVO> list = (ArrayList<BookVO>) request.getAttribute("list");
	double[] list2 = (double[]) request.getAttribute("list2");
	ArrayList<MMemberVO> list3 = (ArrayList<MMemberVO>) request.getAttribute("list3");
%>
<c:if test="${id == null}">
	<c:redirect url="home.jsp" />
</c:if>
<!DOCTYPE HTML>
<html>
<head>
<title>${id}님</title>

<meta charset="euc-kr" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no" />
<link rel="stylesheet" href="webdesign/assets/css/main.css" />
<noscript>
	<link rel="stylesheet" href="webdesign/assets/css/noscript.css" />
</noscript>
</head>
<body class="is-preload">

	<!-- Wrapper -->
	<div id="wrapper">

		<!-- Header -->
		<header id="header">
			<a href="home.jsp" class="logo">MA_HANG</a>
		</header>

		<!-- Nav -->
		<nav id="nav">
			<ul class="links">
				<li><a href="home.jsp">HOME</a></li>
				<li><a href="mypage.jsp">MY PAGE</a></li>
				<li><a href="plan.jsp">행동 PLAN</a></li>
				<li><a href="board.jsp">항아리 BOARD</a></li>
				<li class="active"><a href="../booklist">도서 PAGE</a></li>
			</ul>
		</nav>

		<!-- Main -->
		<div id="main">

			<!-- Post -->
			<section class="post">
				<header class="major">
					<h1>
						도서<br /> PAGE
					</h1>
				</header>
				<form action="http://localhost:9000/mahang/bookrecommend" method="get">
				<input style='font-family: gothic; background-color: beige; font-size: 30pt; border: none;'
					type="text" name="id" value="<%=id%>" />
				<h4>님 환영합니다.</h4>
				<input type="text" name="bookname" /><input type="submit" value="도서 추천" />
				<table border='1'>
					<tr>
						<td><strong>책 제목</strong></td>
						<td><strong>분야</strong></td>
						<td><strong>책 소개</strong></td>
						<td><strong>사용자 평점</strong></td>
					</tr>
					<%
						for (int i = 0; i < 165; i++) {
					%>
					<tr>
						<td><%=list.get(i).getB_name()%></td>
						<td><%=list.get(i).getB_category()%></td>
						<td><a href=<%=list.get(i).getB_url()%>>책 소개 페이지로</a></td>
						<td><%=list2[i]%></td>
					</tr>
					<%
						}
					%>
				</table>
			</form>
			</section>
			
		</div>



	</div>

	<!-- Scripts -->
	<script src="assets/js/jquery.min.js"></script>
	<script src="assets/js/jquery.scrollex.min.js"></script>
	<script src="assets/js/jquery.scrolly.min.js"></script>
	<script src="assets/js/browser.min.js"></script>
	<script src="assets/js/breakpoints.min.js"></script>
	<script src="assets/js/util.js"></script>
	<script src="assets/js/main.js"></script>

</body>
</html>