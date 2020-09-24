package mmem.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mmem.model.MMemberDAO;
import mmem.model.MMemberVO;

@WebServlet("/list")
public class MMemberListController extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		MMemberDAO dao = new MMemberDAO();
		ArrayList<MMemberVO> list = dao.memberAllList();
		
		request.setAttribute("list", list);
		RequestDispatcher rd = request.getRequestDispatcher("mmemberList");
		rd.forward(request, response);
		
		
		
		
	}

}
