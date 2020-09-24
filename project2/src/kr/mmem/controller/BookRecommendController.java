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

@WebServlet("/bookrecommended")
public class BookRecommendController extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		RequestDispatcher rd = request.getRequestDispatcher("/mahang3/nike747459.wixsite.com/mydiary/bookRecommend.jsp");
		rd.forward(request, response);
		
	}
}
