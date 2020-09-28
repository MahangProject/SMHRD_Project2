package kr.mmem.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.mmem.model.planDAO;
import kr.mmem.model.planVO;

@WebServlet("/myplanmake")
public class myPlanManageController extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setCharacterEncoding("utf-8"); //���ڵ�...
		HttpSession session = request.getSession(); // ���� ��������
		planDAO dao = new planDAO();
		String plan1 = request.getParameter("do_list1"); // ����ڰ� �Է��� ��õ�� �ൿ
		int success1 = Integer.parseInt(request.getParameter("success1")); // ��õ ���� ����
		ArrayList<planVO> list = dao.planAllList(); // �ൿ��ȹǥ ��ü ���(��¥�� ��������)
		int score = 0; // ��õ���� ���� �ʱ�ȭ
		if (list.isEmpty()) {
		}else {
			score = list.get(0).getMission_score(); // ��õ ���� ���� ��������
		}
		
		PrintWriter out = response.getWriter();
		planVO dto = new planVO(plan1, success1, score);
		int cnt =0;
		cnt = dao.makePlan(dto); // �ൿ�� ������ db�� ����
		session.setAttribute("score", score); // ������ ȭ�鿡 ��Ÿ���� ���� ��ü ���ε�
		if(cnt>0) {
			response.sendRedirect("/project2/webdesign/plan.jsp");
		}else {
			out.print("fail");
		}
	}
}
