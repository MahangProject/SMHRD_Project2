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
	
	
		// ��ü����Ʈ ���
		planDAO dao = new planDAO();
		ArrayList<planVO> list = dao.planAllList();
		System.out.println(list);
		//��ü ���ε� �սô�
		
		request.setAttribute("list", list);
		RequestDispatcher rd = request.getRequestDispatcher("myplan.jsp"); // ��û�� �Ƿ��� �������� ������
		rd.forward(request, response);
	
	
	
	
	}

}
