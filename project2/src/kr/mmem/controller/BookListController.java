package kr.mmem.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.mmem.model.BookDAO;
import kr.mmem.model.BookVO;
import kr.mmem.model.MMemberDAO;
import kr.mmem.model.MMemberVO;


@WebServlet("/booklist")
public class BookListController extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				BookDAO dao = new BookDAO();
				MMemberDAO dao2 = new MMemberDAO();
				ArrayList<BookVO> list = dao.bookAllList(); //å ��ü ����Ʈ ����
				//String id = request.getParameter("ID");
				double[] list2 = dao.scoreAllList("whizzerscowl"); // ����ڰ� ���� ��ü ���� ��� ����
				ArrayList<MMemberVO> list3 = dao2.memberAllList(); // ��ü ����� ��� ����

				request.setAttribute("list", list); // å ��ü ����Ʈ ��ü���ε�
				request.setAttribute("list2", list2); // ����ڰ� ���� ��ü ���� ��� ��ü���ε�
				request.setAttribute("list3", list3); // ��ü ����� ��� ��ü ���ε�
				RequestDispatcher rd = request.getRequestDispatcher("/webdesign/page.jsp"); // å ��� ���Ϸ� ������
				rd.forward(request, response);
		
	}

}
