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
				ArrayList<BookVO> list = dao.bookAllList(); //책 전체 리스트 저장
				//String id = request.getParameter("ID");
				double[] list2 = dao.scoreAllList("whizzerscowl"); // 사용자가 평가한 전체 평점 목록 저장
				ArrayList<MMemberVO> list3 = dao2.memberAllList(); // 전체 사용자 목록 저장

				request.setAttribute("list", list); // 책 전체 리스트 객체바인딩
				request.setAttribute("list2", list2); // 사용자가 평가한 전체 평점 목록 객체바인딩
				request.setAttribute("list3", list3); // 전체 사용자 목록 객체 바인딩
				RequestDispatcher rd = request.getRequestDispatcher("/webdesign/page.jsp"); // 책 목록 파일로 포워딩
				rd.forward(request, response);
		
	}

}
