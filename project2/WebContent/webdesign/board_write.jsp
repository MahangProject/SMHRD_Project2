<%@page import="com.BoardDTO"%>  
<%@page import="java.util.ArrayList"%>
<%@page import="com.BoardDAO"%>
<%@ page import = "java.sql.*"%>

<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<c:if test = "${id == null}">
	<c:redirect url = "home.html"/>
</c:if>
<!DOCTYPE HTML>
<html>
	<head>
		<title>MA_HANG</title>
		<meta charset="euc-kr" />
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
		<link rel="stylesheet" href="assets/css/main.css" />
		<noscript><link rel="stylesheet" href="assets/css/noscript.css" /></noscript>
	</head>
	<body class="is-preload">
		<!-- Wrapper -->
			<div id="wrapper">

				<!-- Header -->
					<header id="header">
						<a href="home.html" class="logo">MA_HANG</a>
					</header>
				<p>확인</p>
					
				<!-- Nav -->
					<nav id="nav">
						<ul class="links">
							<li><a href="home.html">HOME</a></li>
							<li><a href="mypage.jsp">MY PAGE</a></li>
							<li><a href="plan.jsp">행동 PLAN</a></li>
							<li class="active"><a href="board.jsp">항아리 BOARD</a></li>
							<li><a href="page.jsp">도서 PAGE</a></li>
						</ul>
					</nav>

				<!-- Main -->
					<div id="main">

						<!-- Post -->
							<section class="post">
								<header class="major">
									<h1>항아리<br />
									BOARD</h1>

									<h3>LIST</h3>
									<div class="table-wrapper">
										<table>
											<thead>
												<tr>
													<th>NUM</th>
													<th>Description</th>
													<th>WRITER</th>
													<th>DATE</th>
												</tr>
											</thead>
											
											<tbody>
												<tr>
													<td>1</td>
													<td>hello</td>
													<td>스마트</td>
													<td>2020.10.01</td>
												</tr>
											</tbody>
											<tfoot>
												<tr>
													<td colspan="2"></td>
												</tr>
											</tfoot>
										</table>
									</div>
								</header>
							</section>

					</div>

				<!-- Footer -->
					<footer id="footer">
						<section>

							<ul class="actions">
										<a href="board.jsp" class="button fit">WRITE</a>
									</ul>
						</section>
					</footer>

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