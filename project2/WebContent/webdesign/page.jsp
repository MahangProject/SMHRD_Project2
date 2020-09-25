<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  

<c:if test = "${id == null}">
	<c:redirect url = "home.html"/>
</c:if>
<!DOCTYPE HTML>
<html>
	<head>
		<title>${id}님</title>
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

			<!-- Nav -->
					<nav id="nav">
						<ul class="links">
							<li class="active"><a href="home.html">HOME</a></li>
							<li><a href="mypage.jsp">MY PAGE</a></li>
							<li><a href="plan.jsp">행동 PLAN</a></li>
							<li><a href="board.jsp">항아리 BOARD</a></li>
							<li class="active"><a href="page.jsp">도서 PAGE</a></li>
						</ul>
					</nav>

				<!-- Main -->
					<div id="main">

						<!-- Post -->
							<section class="post">
								<header class="major">
									<h1>도서<br />
									PAGE</h1>
								</header>
							</section>

					</div>

				<!-- Footer -->
					<footer id="footer">
						<section>
							<form method="post" action="#">
								
								<ul class="actions">
								<a href="/project2/booklist" class="button primary fit">자기계발</a>
								</ul>
								<ul class="actions">
									<a href="page.jsp" class="button primary fit">심신안정</a>
								</ul>
							</form>
						</section>
						
						
					
					</footer>


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