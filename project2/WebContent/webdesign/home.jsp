<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	session = request.getSession(false); //세션이 없으면 null, 있으면 가져오기
	int score = 0; // rses점수값 초기화
	if(session.getAttribute("rses")==null){//rses점수 입력 안됐으면 0
	}else{//rses점수 가져오기
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
						<p>"당신의 오늘 하루는 어땠나요?"<br/></p>
						
						<ul class="actions">
							
							<li><form action ="/project2/test.html"><button type="submit" >
							<span id="result">RSES점수 : <%=score%></span><!-- rses 점수 표시 -->
							</button></form></li>
								</ul>
						<ul class="actions"><!-- 아래로 버튼(화살표) -->
							<li><a href="#header" class="button icon solid solo fa-arrow-down scrolly">Continue</a></li>
						</ul>
					</div>

				<!-- Header -->
					<header id="header">
						<a href="home.jsp" class="logo">MA_HANG</a>
					</header>

				<!-- Nav -->
					<nav id="nav">
						<ul class="links"><!-- 메뉴바 -->
							<li class="active"><a href="home.jsp">HOME</a></li>
							<li><a href="mypage.jsp">MY PAGE</a></li>
							<li><a href="plan.jsp">행동 PLAN</a></li>
							<li><a href="board.jsp">항아리 BOARD</a></li>
							<li><a href="../booklist">도서 PAGE</a></li>
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

						<!-- Posts : 각 페이지 링크 -->
							<section class="posts">
								<article>
									<ul class="actions special">
										<li><a href="mypage.jsp" class="button">MY PAGE</a></li>
									</ul>
								</article>
								<article>
									<ul class="actions special">
										<li><a href="plan.jsp" class="button">행동 PLAN</a></li>
									</ul>
								</article>
								<article>
									<ul class="actions special">
										<li><a href="board.jsp" class="button">항아리 BOARD</a></li>
									</ul>
								</article>
								<article>
									<ul class="actions special">
										<li><a href="../booklist" class="button" >도서 PAGE</a></li>
									</ul>
								
							</section>

						<!-- Footer -->

					</div>
				<!-- Footer -->
					<footer id="footer">
						<section>
							<form method="get" action="/project2/mmemlogin"><!-- 로그인 -->
								<div class="fields">
									<div class="field">
										<label for="name">아이디</label>
										<input type="text" name="id" id="id" />
									</div>
									<div class="field"> 
										<label for="password">비밀번호</label>
										<input type="password" name="pwd" id="pwd" />
									</div>
									<div class="field">
									</div>
								</div>
								<ul class="actions">

									<li><input type="submit" value="SIGN IN"/></li>
									<li><input type="button" value="SIGN UP" onclick ="location.href='/project2/webdesign/mypage.jsp'"//></li>
									<!-- 회원가입페이지로 이동 -->
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