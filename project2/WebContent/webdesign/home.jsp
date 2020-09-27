<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	session = request.getSession(false);
	int score = 0;
	if(session.getAttribute("rses")==null){}else{
	score = (Integer)session.getAttribute("rses");}
%>
<!DOCTYPE HTML>
<html>
	<head>
		<title>MAHANG</title>
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script type="text/javascript"></script>

		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
		<link rel="stylesheet" href="assets/css/main.css" />
		<noscript><link rel="stylesheet" href="assets/css/noscript.css" /></noscript>
	</head>
	<body class="is-preload">

		<!-- Wrapper -->
			<div id="wrapper" class="fade-in">

				<!-- Intro -->
					<div id="intro">
						<h1>MA_HANG<br />
						</h1>
						<p>"����� ���� �Ϸ�� �����?"<br/></p>
						
						<ul class="actions">
							
							<li><form action ="/project2/test.html"><button type="submit" >
							<span id="result"><%=score%></span>
							</button></form></li>
								</ul>
						<ul class="actions">
							<li><a href="#header" class="button icon solid solo fa-arrow-down scrolly">Continue</a></li>
						</ul>
					</div>

				<!-- Header -->
					<header id="header">
						<a href="home.html" class="logo">MA_HANG</a>
					</header>

				<!-- Nav -->
					<nav id="nav">
						<ul class="links">
							<li class="active"><a href="home.html">HOME</a></li>
							<li><a href="mypage.jsp">MY PAGE</a></li>
							<li><a href="plan.jsp">�ൿ PLAN</a></li>
							<li><a href="board.jsp">�׾Ƹ� BOARD</a></li>
							<li><a href="page.jsp">���� PAGE</a></li>
						</ul>
					</nav>

				<!-- Main -->
					<div id="main">

						<!-- Featured Post -->
							<article class="post featured">
								<header class="major">
									<h2>OUR MENU<br/>
								</header>
							</article>

						<!-- Posts -->
							<section class="posts">
								<article>
									<ul class="actions special">
										<li><a href="mypage.jsp" class="button">MY PAGE</a></li>
									</ul>
								</article>
								<article>
									<ul class="actions special">
										<li><a href="plan.jsp" class="button">�ൿ PLAN</a></li>
									</ul>
								</article>
								<article>
									<ul class="actions special">
										<li><a href="board.jsp" class="button">�׾Ƹ� BOARD</a></li>
									</ul>
								</article>
								<article>
									<ul class="actions special">
										<li><a href="page.jsp" class="button" >���� PAGE</a></li>
									</ul>
								
							</section>

						<!-- Footer -->

					</div>
				<!-- Footer -->
					<footer id="footer">
						<section>
							<form method="get" action="/project2/mmemlogin">
								<div class="fields">
									<div class="field">
										<label for="name">���̵�</label>
										<input type="text" name="id" id="id" />
									</div>
									<div class="field"> 
										<label for="password">��й�ȣ</label>
										<input type="text" name="pwd" id="pwd" />
									</div>
									<div class="field">
									</div>
								</div>
								<ul class="actions">

									<li><input type="submit" value="SIGN IN"/></li>
									<li><input type="button" value="SIGN UP" onclick ="location.href='/project2/webdesign/mypage.jsp'"//></li>


								</ul>
							</form>
						</section>
						</section>
					</footer>

				<!-- Copyright -->
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