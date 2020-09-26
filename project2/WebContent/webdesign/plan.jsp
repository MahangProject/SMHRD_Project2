<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<c:if test = "${id == null}">
	<c:redirect url = "home.html"/>
</c:if>	
<!DOCTYPE HTML>
<html>

<head>
	
	<title>plan</title>
	<meta charset="utf-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
	<link rel="stylesheet" href="assets/css/main.css"/>
	<noscript>
		<link rel="stylesheet" href="assets/css/noscript.css" /></noscript>
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
							<li><a href="home.html">HOME</a></li>
							<li><a href="mypage.jsp">MY PAGE</a></li>
							<li class="active"><a href="plan.jsp">행동 PLAN</a></li>
							<li><a href="board.jsp">항아리 BOARD</a></li>
							<li><a href="page.jsp">도서 PAGE</a></li>
						</ul>
		</nav>

		<!-- Main -->
		<div id="main">

			<!-- Post -->
			<section class="post">
				<header class="major">
					<h1>행동<br />
						PLAN</h1>
				</header>

				<body>

					<div id="myDIV" class="header">

						<h2 style="margin:5px">To Do List</h2>
						<input type="text" id="myInput" placeholder="Title..."> 

						<span onclick="newElement()" class="addBtn">Add</span>
					</div>

					<ul id="myUL">						
						<li class ="checked">my book</li> 
					</ul>

					<script>
					
					
						// Create a "close" button and append it to each list item
						var myNodelist = document.getElementsByTagName("LI");
						var i;
						for (i = 0; i < myNodelist.length; i++) {
							var span = document.createElement("SPAN");
							var txt = document.createTextNode("\u00D7");
							span.className = "close";
							span.appendChild(txt);
							myNodelist[i].appendChild(span);
						}

						// Click on a close button to hide the current list item
						var close = document.getElementsByClassName("close");
						var i;
						for (i = 0; i < close.length; i++) {
							close[i].onclick = function () {
								var div = this.parentElement;
								div.style.display = "none";
							}
						}

					
						
						// Add a "checked" symbol when clicking on a list item
						var list = document.querySelector('li');
						list.addEventListener('click', function (ev) {
							if (ev.target.tagName === 'LI') {
								ev.target.classList.addClass("checked");
								
							}
						}, false);

						console.log(list);
						
		
						
						
						
						// Create a new list item when clicking on the "Add" button
						function newElement() {
							var li = document.createElement("li");
							var inputValue = document.getElementById("myInput").value;
							var t = document.createTextNode(inputValue);
							li.appendChild(t);
							if (inputValue === '') {//add button í´ë¦­ì ìë¡ ìì±.
								alert("You must write something!"); 
							} else {
								document.getElementById("myUL").appendChild(li);
							}
							document.getElementById("myInput").value = ""; //reset

							var span = document.createElement("SPAN");
							var txt = document.createTextNode("\u00D7");
							span.className = "close";
							span.appendChild(txt);
							li.appendChild(span);

							for (i = 0; i < close.length; i++) {
								close[i].onclick = function () {
									var div = this.parentElement;
									div.style.display = "none";
								}
							}
						}
					</script>

				</body>

</html>



							</section>

					</div>

				<!-- Footer -->
					<footer id="footer">
						<section>
							<section>
							</section>
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