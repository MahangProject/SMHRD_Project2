package kr.mmem.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.mmem.model.planDAO;
import kr.mmem.model.planVO;

@WebServlet("/planlist")
public class myPlanListController extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		planDAO dao = new planDAO();
		ArrayList<planVO> list = dao.planAllList(); // 행동계획표 전체 목록
		
		request.setAttribute("list", list); // 행동계획표 전체 목록 객체 바인딩
		RequestDispatcher rd = request.getRequestDispatcher("plan.jsp"); // 행동계획표 페이지로 포워딩
		rd.forward(request, response);
	}
}
