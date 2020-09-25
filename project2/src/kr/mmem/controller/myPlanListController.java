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
	
	
		// 전체리스트 출력
		planDAO dao = new planDAO();
		ArrayList<planVO> list = dao.planAllList();
		System.out.println(list);
		//객체 바인딩 합시당
		
		request.setAttribute("list", list);
		RequestDispatcher rd = request.getRequestDispatcher("myplan.jsp"); // 요청을 의뢰할 페이지를 얻어오기
		rd.forward(request, response);
	
	
	
	
	}

}
