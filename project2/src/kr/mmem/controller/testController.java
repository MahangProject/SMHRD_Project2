
package kr.mmem.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.naming.ldap.Rdn;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.startup.SetAllPropertiesRule;

import kr.mmem.model.MMemberDAO;
import kr.mmem.model.MMemberVO;

@WebServlet("/testScore")
public class testController extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
			PrintWriter out = response.getWriter();
			
			int score1= Integer.parseInt(request.getParameter("test_Rses1"));
			int score2= Integer.parseInt(request.getParameter("test_Rses2"));
			int score3= Integer.parseInt(request.getParameter("test_Rses3"));
			int score4= Integer.parseInt(request.getParameter("test_Rses4"));
			int score5= Integer.parseInt(request.getParameter("test_Rses5"));
			int score6= Integer.parseInt(request.getParameter("test_Rses6"));
			int score7= Integer.parseInt(request.getParameter("test_Rses7"));
			int score8= Integer.parseInt(request.getParameter("test_Rses8"));
			int score9= Integer.parseInt(request.getParameter("test_Rses9"));
			int score10= Integer.parseInt(request.getParameter("test_Rses10"));
			int sum =score1+score2+score3+score4+score5+score6+score7+score8+score9+score10; //사용자총점.
			
			
		
			//=========================================================================================test 값
	
			
			
			out.print(sum);
			System.out.println(sum);
//			request.setAttribute("sum", sum);
//			RequestDispatcher rd = request.getRequestDispatcher("mmember.jsp"); //어디로 보낼까? 이 점수를 .
//			rd.forward(request, response);
			
			
			MMemberDAO dao = new MMemberDAO();
		
			
			//dao.testScoreUpdate(score); >> test Score
			
			
			int cnt = dao.testScoreUpdate(sum, "test1");
			
			if(cnt>0) {
				System.out.println("입력 성공");
				out.print("변경성공");
				
//				response.sendRedirect("main.html");
			}else {
				out.print("실패");
			}


			
		
		
	}

}
