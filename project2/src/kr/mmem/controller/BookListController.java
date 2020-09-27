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
		// 전체리스트를 출력
				BookDAO dao = new BookDAO();
				MMemberDAO dao2 = new MMemberDAO();
				ArrayList<BookVO> list = dao.bookAllList();
				//String id = request.getParameter("ID");
				double[] list2 = dao.scoreAllList("whizzerscowl");
				ArrayList<MMemberVO> list3 = dao2.memberAllList();
				// JSP(View)

				request.setAttribute("list", list); // 객체바인딩
				request.setAttribute("list2", list2);
				request.setAttribute("list3", list3);
				System.out.println(list.get(0));
				RequestDispatcher rd = request.getRequestDispatcher("/webdesign/page.jsp");
				rd.forward(request, response);
		
	}

}
