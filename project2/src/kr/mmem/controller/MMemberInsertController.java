package kr.mmem.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.mmem.model.MMemberDAO;
import kr.mmem.model.MMemberVO;

@WebServlet("/insert")
public class MMemberInsertController extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("euc-kr");
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		int age = Integer.parseInt(request.getParameter("age"));
		String gender = request.getParameter("gender");
		
		MMemberVO vo = new MMemberVO(id, pw, name, email, age, gender);
		MMemberDAO dao = new MMemberDAO();
		int cnt = dao.mmemberInsert(vo);
		
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter out = response.getWriter();
		if (cnt>0) {
			//성공
			out.print("회원가입 성공");
			// 리스트페이지로 다시 보내기(응답을 리스트페이지로 다시 보내기: /list)
			//sendRedirect
			response.sendRedirect("/project2/main.html");
			
		}else {
			//실패
			out.print("회원가입 실패");
		}
	}

}
