<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  



<!DOCTYPE HTML>
<html>
	<head>
		<title>${id }</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
		<link rel="stylesheet" href="assets/css/main.css" />
		<noscript><link rel="stylesheet" href="assets/css/noscript.css" /></noscript>
	</head>
	<body class="is-preload">

		<!-- Wrapper -->
			<div id="wrapper">

				<!-- Header -->
					<header id="header">
						<a href="home.jsp" class="logo">${id}</a>
					</header>

				<!-- Nav -->
					<nav id="nav">
						<ul class="links">
							<li ><a href="home.jsp">HOME</a></li>
							<li class="active"><a href="mypage.jsp">MY PAGE</a></li>
							<li><a href="plan.jsp">행동 PLAN</a></li>
							<li><a href="board.jsp">항아리 BOARD</a></li>
							<li><a href="../booklist">도서 PAGE</a></li>
						</ul>
					</nav>

				<!-- Main -->
					<div id="main">

						<!-- Post -->
							<section class="post">
								<header class="major">
									<h1>MY<br />
									PAGE</h1>
										<!doctype html>
										<html lang="en">
										<head>
											<meta charset="EUC-KR">
											<title>회원가입</title>
										</head>
										<body>
											<form name="write_form_member" method="post">
												<table width="800" style="padding:5px 0 5px 0; ">
													<tr height="10" bgcolor="#1B5E20">
														<td colspan="4"></td>
													</tr>
													<tr>
														<th>
															<p style="color:gray;">NAME</p>
														</th>
														<td>
															<input type="text" name="name">
															<a href='#' style='cursor:help'> </a>
														</td>
													</tr>
										
													<tr>
														<th>
															<p style="color:gray;">AGE</p>
														</th>
														<td>
															<input type="text" name="age">
															<a href='#' style='cursor:help'> </a>
														</td>
													</tr>

													<tr>
														<th>
															<p style="color:gray;">GENDER</p>
														</th>
														<td class="s">
															<div class="col-4 col-12-small">
												<input type="radio" id="male" name="gender" value ='m' checked>
												<label for="male">남</label>
												<input type="radio" id="female" name="gender" value='f'>
												<label for="female">여</label>
															</div>
											
												
														</td>
													</tr>

													<tr>
														<th>
															<p style="color:gray;">ID</p>
														</th>
														<td>
															<input type="text" name="id">
															<a href='#' style='cursor:help'> </a>
														</td>
													</tr>
													<tr>
														<th>
															<p style="color:gray;">PASSWORD</p>
														</th>
														<td><input type="password" name="pw"> </td>
													</tr>
													<tr>
														<th>
															<p style="color:gray;">PW확인</p>
														</th>
														<td><input type="password" name="pw_re"></td>
													</tr>
													<tr>
														<th>
															<p style="color:gray;">E-MAIL</p>
														</th>
														<td>
															<input type='text' name="email">
															<select name="emailaddr">
																<option value="">직접입력</option>
																<option value="daum.net">@daum.net</option>
																<option value="gmail.com">@gmail.com</option>
																<option value="naver.com">@naver.com</option>
															</select>
														</td>
													</tr>
													<tr>
														<th>
															<p style="color:gray;">알람수신</p>
														</th>
														<td class="s">
															<div class="col-4 col-12-small">
												<input type="radio" id="demo-priority-low" name="demo-priority" checked>
												<label for="demo-priority-low">YES</label>
											</div>
											<div class="col-4 col-12-small">
												<input type="radio" id="demo-priority-normal" name="demo-priority">
												<label for="demo-priority-normal">NO</label>
														</td>
													</tr>
													<tr>
														<th>
															<p style="color:gray;">알람설정</p>
														</th>
														<td>
															<input type="text" name="timeset">
														</td>
													</tr>
													<tr>
														<th>
															<p style="color:gray;">MY RSES</p>
															<a href="#" class="button primary icon solid fa-search">SEE</a>
															</ul>	
															<tr>
														<th>
																
														</th>
													</tr>
														</th>
										
													</tr><br>
													<tr>
													<tr>
														<th>
															<p style="color:gray;">MY POINT</p>
															<td>
															<input type="text" name="timeset">
														</td>
														</th>
													</tr><br>
													<tr>
														<th>
															<p style="color:gray;">관심분야</p>
															
														</th>
														<td>
														
												<div class="col-6 col-12-small">
												<input type="checkbox" id="demo-human1" name="demo-human1">
												<label for="demo-human1">외모관리</label>
												</div>
												<div class="col-6 col-12-small">
												<input type="checkbox" id="demo-human2" name="demo-human2" >
												<label for="demo-human2">운동&다이어트</label>
												</div>
												<div class="col-6 col-12-small">
												<input type="checkbox" id="demo-human3" name="demo-human3">
												<label for="demo-human3">친구관계</label>
												</div><div class="col-6 col-12-small">
												<input type="checkbox" id="demo-human4" name="demo-human4">
												<label for="demo-human4">이성교제</label>
												</div>
												<div class="col-6 col-12-small">
												<input type="checkbox" id="demo-human5" name="demo-human5">
												<label for="demo-human5">여행</label>
												</div>
												<div class="col-6 col-12-small">
												<input type="checkbox" id="demo-human6" name="demo-human6">
												<label for="demo-human6">연예인&아이돌 덕질하기</label>
												</div>
												<div class="col-6 col-12-small">
												<input type="checkbox" id="demo-human7" name="demo-human7">
												<label for="demo-human7">아르바이트</label>
												</div><div class="col-6 col-12-small">
												<input type="checkbox" id="demo-human8" name="demo-human8">
												<label for="demo-human8">악기</label>
												</div>
											<div class="col-12">
												<textarea name="demo-message" id="demo-message" placeholder="기타" rows="6"></textarea>
											</div>
														</td>
													</tr>
										
													</tr>
													<tr>
														<td colspan="2" align="center">
														</td>
													</tr>
												</table>
												</td>
												</tr>
											</form>
										</body>
										</html>
								</header>
							</section>

					</div>

				<!-- Footer -->
					<footer id="footer">
						<section>
								<ul class="actions">
									
									<li><input type="button" value = "signup" onClick="location.href='/project2/webdesign/home.jsp'"></li>

								</ul>
							</form>
						</section>
							</section>
							<section>
							</section>
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