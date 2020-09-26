package kr.mmem.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

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
		response.setCharacterEncoding("utf-8"); //���ڵ�...
		int cnt =0;
		planDAO dao = new planDAO();
		String plan1 = request.getParameter("do_list1");
		//int success1 = Integer.parseInt(request.getParameter("success1"));
		int success1 = Integer.parseInt(request.getParameter("success1"));
		int score = 0;
		ArrayList<planVO> list = dao.planAllList();
		if (list.isEmpty()) {
		}else {
			System.out.println("�̼ǽ��ھ�:"+list.get(0).getMission_score());
			score = list.get(0).getMission_score();
		}
		System.out.println("db������"+score);
		PrintWriter out = response.getWriter();
		
		out.print(plan1);//Ȯ��
		out.print(success1);
		
		planVO dto = new planVO(plan1, success1, score);
		cnt = dao.makePlan(dto);
		if(cnt>0) {
			System.out.println(plan1);
			System.out.println(success1);
			System.out.println("db������"+score);
			response.sendRedirect("/project2/webdesign/plan.jsp");
		}else {
			out.print("fail");
		}
		
//		response.sendRedirect("/Mahang_Project/myplan");
	}

}
