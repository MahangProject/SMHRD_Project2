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

import kr.mmem.model.*;

@WebServlet("/mmemlogin")
public class MMemberLoginController extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("euc-kr");
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		if(id.equals("whizzerscowl")&&pwd.equals("1111")) { // 회원인증 성공
			HttpSession session = request.getSession(); //session ID를 만드는 메소드 //sessionID공간할당.
			System.out.println(session.getMaxInactiveInterval()); //session 지속되는 시간check
			System.out.println(session.getId());
			System.out.println(session.getLastAccessedTime());
			System.out.println(session.getCreationTime()); //세션이 만들어진 시간.
			session.setAttribute("id", id); // id 객체 바인딩(session) 
			MMemberDAO dao = new MMemberDAO();
			session.setAttribute("rses", dao.testScoreLoad(id)); // 사용자의 rses점수를 불러와 객체 바인딩
			planDAO dao2 = new planDAO();
			int score = 0; // 실천점수 초기화
			ArrayList<planVO> list = dao2.planAllList(); // 행동계획표 목록
			if (list.isEmpty()) {
			}else {//행동계획표가 비어있지 않을 시
				score = list.get(0).getMission_score(); // 실천점수 저장
			}
			session.setAttribute("score", score); // 실천점수 객체 바인딩
			response.sendRedirect("/project2/webdesign/plan.jsp"); // 행동계획표로 리다이렉트
		}else {
			response.sendRedirect("/project2/webdesign/home.jsp"); //실패했으니 다시 로그인으로 보내버림.
		}	
	}
}





