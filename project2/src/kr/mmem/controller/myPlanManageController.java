package kr.mmem.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.mmem.model.planDAO;
import kr.mmem.model.planVO;

@WebServlet("/myplanmake")
public class myPlanManageController extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8"); //인코딩...
		int cnt =0;
		
		String plan1 = request.getParameter("plan1");
		//int success1 = Integer.parseInt(request.getParameter("success1"));
		int success1 = 5;
		PrintWriter out = response.getWriter();
		
		out.print(plan1);//확인
		out.print(success1);
		
		planDAO dao = new planDAO();
		planVO dto = new planVO(plan1, success1);
		cnt = dao.makePlan(dto);
		if(plan1.equals(null)) {
			
			
		}
		
		if(cnt>0) {
			
			out.print("success");
			response.sendRedirect("/project2/webdesign/plan.html");
		}else {
			out.print("fail");
		}
		
//		response.sendRedirect("/Mahang_Project/myplan");
	}

}
