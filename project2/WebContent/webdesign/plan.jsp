<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:if test = "${id == null}">
	<c:redirect url = "home.jsp"/>
</c:if>	
<%
	String userId = request.getParameter("id");
	String imgfile = "";
	int score = (Integer)session.getAttribute("score"); // 실천점수 가져오기
	if (score >= 40){ // 점수별로 나무 이미지 바꿔서 출력
		imgfile = "tree5.png";
	}else if (score >= 30){
		imgfile = "tree4.png";
	}else if (score >= 30){
		imgfile = "tree3.png";
	}else if (score >= 10){
		imgfile = "tree2.png";
	}else{
		imgfile = "tree1.png";
	}
%>  

<!DOCTYPE HTML>
<html>
<head>
	<title>plan</title>
	<meta charset="utf-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
	<link rel="stylesheet" href="assets/css/main.css"/>
	<noscript>
		<link rel="stylesheet" href="assets/css/noscript.css" /></noscript>
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
#myUL li {
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
#myUL li:nth-child(odd) {
  background: #f9f9f9;
}

/* Darker background-color on hover */
#myUL li:hover {
  background: #ddd;
}

/* When clicked on, add a background color and strike out text */
#myUL li.checked {
  background: #888;
  color: #fff;
  text-decoration: line-through;
}

/* Add a "checked" mark when clicked on */
#myUL li.checked::before {
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
  font-weight:700;
  font-family: "고딕";
}

.close:hover {
  background-color: #f44336;
  color: white;
}

/* Style the header */
.header {
  padding: 30px 40px;
  color: black;
  text-align: center;
}

/* Clear floats after the header */
.header:after {
  content: "";
  display: table;
  clear: both;
}

/* Style the input */
#myinput.input {
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
							<li ><a href="home.jsp">HOME</a></li>
							<li><a href="mypage.jsp">MY PAGE</a></li>
							<li class="active"><a href="plan.jsp">행동 PLAN</a></li>
							<li><a href="board.jsp">항아리 BOARD</a></li>
							<li><a href="../booklist">도서 PAGE</a></li>
						</ul>
					</nav>
					
		<!-- Main -->
		<div id="main">

			<!-- Post -->
			<section class="post">
				<header class="major">
					<h1>행동<br />
						PLAN</h1>
				<img src="../views/img/<%=imgfile%>" width="150px" height="200px"/><!-- 실천점수에 해당하는 나무 이미지 -->
				<h3>실천점수 <%=score%>점</h3>
				</header>
				<body>
				
					<div id="myDIV" class="header"><!-- 오늘 실천할 행동 계획 -->
						<h2 style="margin:5px">To Do List</h2>
						<input type="text" id="myInput" placeholder="오늘의 계획을 세워보세요"> 
						<span onclick="newElement()" class="addBtn" style=" font-weight: 700;">ADD</span>
					</div>

					<ul id="myUL">						
					</ul>

					<script>
					
						// Create a "close" button and append it to each list item(이미 만들어진 목록에 O버튼 만들기, 사용 안 함)
						var myNodelist = document.querySelectorAll("#myUL li");
						var i;
						for (i = 0; i < myNodelist.length; i++) {
							var span = document.createElement("SPAN");
							var txt = document.createTextNode("O");
							span.className = "close";
							span.appendChild(txt);
							myNodelist[i].appendChild(span);
						}

						// Click on a close button to hide the current list item
						// (이미 만들어진 목록에서 O버튼 누르면 홈페이지에서 그 행동 없애기, db에 저장, 사용 안 함)
						var close = document.getElementsByClassName("close");
						var i;
						for (i = 0; i < close.length; i++) {
							close[i].onclick = function () {
								var div = this.parentElement;
								$.ajax({
									url: '/project2/myplanmake',
									type: 'post',
									data: {
										do_list1: div.innerHTML.replace('<span class="close">O</span>',''),
										success1: 1
									},
									success : function(t){ 
			                             alert('성공!');
			               } ,
			               error : function(){
			                         alert('실패 ㅠㅠ');
			               }
			               });
								div.style.display = "none";
							}
						}

						// Add a "checked" symbol when clicking on a list item
						// 클릭시 체크 표시(안해도 DB에 잘 저장 됨.....)
						var list = document.querySelector('ul#myUL');
						list.addEventListener('click', function(ev) {
						  if (ev.target.tagName === 'LI') {
						    ev.target.classList.toggle('checked');
						  }
						},false);

						// Create a new list item when clicking on the "Add" button
						// Add버튼으로 새로운 행동 생성(O버튼까지 구현)
						function newElement() {
						  var li = document.createElement("li"); // li만들기
						  var inputValue = document.getElementById("myInput").value; // 입력한 내용
						  var t = document.createTextNode(inputValue);	// 을 저장
						  li.appendChild(t); // li에 입력한 내용 삽입
						  if (inputValue === '') { // 입력한 내용이 없을 때
						    alert("You must write something!");
						  } else {
						    document.getElementById("myUL").appendChild(li); // myUL에 li 추가
						  }
						  document.getElementById("myInput").value = ""; // input 비우기(이미 입력값을 저장했으므로)

						  var span = document.createElement("SPAN"); //span태그
						  var txt = document.createTextNode("O");
						  span.className = "close"; //클래스를 close로
						  span.appendChild(txt); //O를 span태그 내용에 삽입
						  li.appendChild(span); //li에 스팬태그 삽입

						  for (i = 0; i < close.length; i++) {
						    close[i].onclick = function() { // O버튼 클릭시 기능
						      var div = this.parentElement;
						      // ajax로 행동계획표를 저장할 수 있게 데이터 전송
						      $.ajax({
									url: '/project2/myplanmake',
									type: 'post',
									data: {
										do_list1: div.innerHTML.replace('<span class="close">O</span>',''),
										success1: 1
									},
									success : function(t){ 
			                            /*  alert('성공!'); */
			                             /* location.reload(); */
			               } ,
			               error : function(){
			                         alert('실패 ㅠㅠ');
			               }
			               });
						      div.style.display = "none";
						    }
						  }
						}
					</script>
				</body>
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