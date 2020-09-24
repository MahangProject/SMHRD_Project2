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


@WebServlet("/booklist")
public class BookListController extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 전체리스트를 출력
				BookDAO dao = new BookDAO();
				ArrayList<BookVO> list = dao.bookAllList();
				//String id = request.getParameter("ID");
				double[] list2 = dao.scoreAllList("whizzerscowl");
				// JSP(View)

				request.setAttribute("list", list); // 객체바인딩
				request.setAttribute("list2", list2);
				RequestDispatcher rd = request.getRequestDispatcher("/mahang3/nike747459.wixsite.com/mydiary/page2.jsp");
				rd.forward(request, response);
		
	}

}
