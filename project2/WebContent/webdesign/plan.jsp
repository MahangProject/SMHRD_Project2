<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String userId = request.getParameter("id");
%>  

<!DOCTYPE HTML>
<html>

<head>
	
	<title>plan</title>
	<meta charset="utf-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
	<link rel="stylesheet" href="assets/css/main.css"/>
	<style>
body {
  margin: 0;
  min-width: 250px;
}

/* Include the padding and border in an element's total width and height */
* {
  box-sizing: border-box;
}

/* Remove margins and padding from the list */
ul {
  margin: 0;
  padding: 0;
}

/* Style the list items */
ul li {
  cursor: pointer;
  position: relative;
  padding: 12px 8px 12px 40px;
  list-style-type: none;
  background: #eee;
  font-size: 18px;
  transition: 0.2s;
  
  /* make the list items unselectable */
  -webkit-user-select: none;
  -moz-user-select: none;
  -ms-user-select: none;
  user-select: none;
}

/* Set all odd list items to a different color (zebra-stripes) */
ul li:nth-child(odd) {
  background: #f9f9f9;
}

/* Darker background-color on hover */
ul li:hover {
  background: #ddd;
}

/* When clicked on, add a background color and strike out text */
ul li.checked {
  background: #888;
  color: #fff;
  text-decoration: line-through;
}

/* Add a "checked" mark when clicked on */
ul li.checked::before {
  content: '';
  position: absolute;
  border-color: #fff;
  border-style: solid;
  border-width: 0 2px 2px 0;
  top: 10px;
  left: 16px;
  transform: rotate(45deg);
  height: 15px;
  width: 7px;
}

/* Style the close button */
.close {
  position: absolute;
  right: 0;
  top: 0;
  padding: 12px 16px 12px 16px;
}

.close:hover {
  background-color: #f44336;
  color: white;
}

/* Style the header */
.header {
  padding: 30px 40px;
  color: white;
  text-align: center;
}

/* Clear floats after the header */
.header:after {
  content: "";
  display: table;
  clear: both;
}

/* Style the input */
input {
  margin: 0;
  border: none;
  border-radius: 0;
  width: 75%;
  padding: 10px;
  float: left;
  font-size: 16px;
}

/* Style the "Add" button */
.addBtn {
  padding: 10px;
  width: 25%;
  background: #d9d9d9;
  color: #555;
  float: left;
  text-align: center;
  font-size: 16px;
  cursor: pointer;
  transition: 0.3s;
  border-radius: 0;
}

.addBtn:hover {
  background-color: #bbb;
}
</style>
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
								console.log(this);
								var div = this.parentElement;
								console.log(div);
								console.log(div.innerHTML.replace('<span class="close">×</span>',''));
								/* $ajax({
									url: 'plan2.jsp',
									type: 'post',
									data: 
								}); */
								div.style.display = "none";
							}
						}

						// Add a "checked" symbol when clicking on a list item
						var list = document.querySelector('ul');
						list.addEventListener('click', function(ev) {
						  if (ev.target.tagName === 'LI') {
						    ev.target.classList.toggle('checked');
						  }
						}, false);
						/* 
						// Add a "checked" symbol when clicking on a list item
						var list = document.querySelector('li');
						list.addEventListener('click', function (ev) {
							if (ev.target.tagName === 'LI') {
								ev.target.classList.addClass("checked");
								
							}
						}, false); */

						console.log(list);
						
					/* 	$(list).click(function(){
							if($(this).is(":checked")){
						  	$(this).parent().addClass("checked");
						    // ëë css()ë¥¼ ë°ë¡ ì ì©í  ìë ìë¤.
						    //$(this).parent().css("background","#ffff00"); 
						  }else{
						  	$(this).parent().removeClass("checked");
						  }
						});

						$(".chk_for").click(function(){
							_id = $(this).attr("id");
							if($(this).is(":checked")){
						  	$("label[for='"+_id+"']").addClass("checked");
						  }else{
						  	$("label[for='"+_id+"']").removeClass("checked");
						  }
						})	 */
						
						

						// Create a new list item when clicking on the "Add" button
						function newElement() {
						  var li = document.createElement("li");
						  var inputValue = document.getElementById("myInput").value;
						  var t = document.createTextNode(inputValue);
						  li.appendChild(t);
						  if (inputValue === '') {
						    alert("You must write something!");
						  } else {
						    document.getElementById("myUL").appendChild(li);
						  }
						  document.getElementById("myInput").value = "";

						  var span = document.createElement("SPAN");
						  var txt = document.createTextNode("\u00D7");
						  span.className = "close";
						  span.appendChild(txt);
						  li.appendChild(span);

						  for (i = 0; i < close.length; i++) {
						    close[i].onclick = function() {
						      var div = this.parentElement;
						      div.style.display = "none";
						    }
						  }
						}
						/* // Create a new list item when clicking on the "Add" button
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
						} */
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