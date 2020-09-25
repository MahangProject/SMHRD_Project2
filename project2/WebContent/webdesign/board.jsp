<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  

<c:if test = "${id == null}">
	<c:redirect url = "home.html"/>
</c:if>
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
						<a href="home.html" class="logo">MA_HANG</a>
					</header>

					
				<!-- Nav -->
					<nav id="nav">
						<ul class="links">
							<li class="active"><a href="home.html">HOME</a></li>
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

									<h3>WRITE</h3>
									<div class="table-wrapper">
											<div id = "board">
				<form>
  					<input type='date' id='currentDate'/>
				</form>
				
				<form action="WriterBoard" method="post" enctype="multipart/form-data">
				<table id="list">
					<tr>
						 
						
						<div class="col-12">
												<select name="demo-category" id="demo-category">
													<option value="">- Choose Today's WEATHER -</option>
													<option value="1"><span style='font-size:100px;'>&#9748;</span></option>
													<option value="1"><span style='font-size:100px;'>&#127774;</span></option>
													<option value="1"><span style='font-size:100px;'>&#10052;</span></option>
													<option value="1"><span style='font-size:100px;'>&#127781;</span></option>
												</select>
											</div>
						
						<td>TITLE</td> 
						<td><input type="text" name="title"> </td>
					</tr>
					<tr>
						
                <td colspan="3"><textarea  name="content" class="form-control"></textarea></td>
						
					</tr>
					<tr>
						<div class="col-12">
												<select name="demo-category" id="demo-category">
													<option value="">- Choose Today's MOOD-</option>
													<option value="1"><span style='font-size:100px;'>&#128522;</span></option>
													<option value="1"><span style='font-size:100px;'>&#128532;</span></option>
													<option value="1"><span style='font-size:100px;'>&#128544;</span></option>
													<option value="1"><span style='font-size:100px;'>&#128549;</span></option>
												</select>
											</div>
					</tr>
				
				</table>
				</form>
			</div>
			<!-- Scripts -->
			<script>
  				document.getElementById('currentDate').value = new Date().toISOString().substring(0, 10);;
			</script>
										<table>
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
										<a href="board_write.jsp" class="button fit">UPDATE</a>
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
