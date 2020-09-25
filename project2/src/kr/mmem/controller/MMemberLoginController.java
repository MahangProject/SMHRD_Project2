package kr.mmem.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/mmemlogin")
public class MMemberLoginController extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 클라이언트가 서버로 요청하면 클라이언트의 어떤 정보가 서버로 넘어온다.(패킷: 헤더(client의 IP-addr)+
		// 바디(req.getParam)로 구성)

		Enumeration<String> headerNames = request.getHeaderNames(); // enumeration

		PrintWriter out = response.getWriter();
		while (headerNames.hasMoreElements()) { // 헤더의 이름이 존재 하는지 안하는지 확인 boolean 반환

			String name = headerNames.nextElement(); //>> cursor가 element를 가져온후 이동함.
			String value = request.getHeader(name);
			out.println(name+":"+value);
			System.out.println(name+":"+value);
		}
		String ip = request.getRemoteHost(); // remote == client remotehost >> ip가져오기
		out.println("Client IP :"+ ip);
		request.setCharacterEncoding("euc-kr");
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		//id = admin / pwd = admin
		
		if(id.equals("admin")&&pwd.equals("admin")) {
			// 회원 인증에 성공 -> 서비스 되는 페이지로 이동을 시켜줘야 겠지 .무엇이든지 만들어 주면 됨(Servlet, JSP)
			//main.jsp, banking.jsp
			HttpSession session = request.getSession(); //session ID를 만드는 메소드 //sessionID공간할당.
			System.out.println(session.getMaxInactiveInterval()); //session 지속되는 시간check
			System.out.println(session.getId());
			System.out.println(session.getLastAccessedTime());
			System.out.println(session.getCreationTime()); //세션이 만들어진 시간.
			session.setAttribute("id", id); // 객체 바인딩(session) 
			response.sendRedirect("/project2/webdesign/home.html");
			
		}else {
			System.out.println("실패");
			//page를 바꾸는 기술 >> 	1. forwarding 
							  //2. response.sendredirect
			
			response.sendRedirect("/project2/webdesign/plan.html"); //실패했으니 다시 로그인으로 보내버림.
		}	
		
		
			//>>client와 server가 session으로 인식을 한다. 변하지 않아 브라우저가 닫히지 않는다면. 
		
		// 1. 세션값(sessionID= 32 )을 가져온다. 
		// 2. 세션ID값을 만든다. (JSESSIONID=100)
		// 3. 만들어진 세션ID값을 클라이언트로 보낸다. 
		
		
		
		
		
	}

}





