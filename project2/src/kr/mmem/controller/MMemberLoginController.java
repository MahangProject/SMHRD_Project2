package kr.mmem.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.mmem.model.*;

@WebServlet("/mmemlogin")
public class MMemberLoginController extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("euc-kr");
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		if(id.equals("whizzerscowl")&&pwd.equals("1111")) { // ȸ������ ����
			HttpSession session = request.getSession(); //session ID�� ����� �޼ҵ� //sessionID�����Ҵ�.
			System.out.println(session.getMaxInactiveInterval()); //session ���ӵǴ� �ð�check
			System.out.println(session.getId());
			System.out.println(session.getLastAccessedTime());
			System.out.println(session.getCreationTime()); //������ ������� �ð�.
			session.setAttribute("id", id); // id ��ü ���ε�(session) 
			MMemberDAO dao = new MMemberDAO();
			session.setAttribute("rses", dao.testScoreLoad(id)); // ������� rses������ �ҷ��� ��ü ���ε�
			planDAO dao2 = new planDAO();
			int score = 0; // ��õ���� �ʱ�ȭ
			ArrayList<planVO> list = dao2.planAllList(); // �ൿ��ȹǥ ���
			if (list.isEmpty()) {
			}else {//�ൿ��ȹǥ�� ������� ���� ��
				score = list.get(0).getMission_score(); // ��õ���� ����
			}
			session.setAttribute("score", score); // ��õ���� ��ü ���ε�
			response.sendRedirect("/project2/webdesign/plan.jsp"); // �ൿ��ȹǥ�� �����̷�Ʈ
		}else {
			response.sendRedirect("/project2/webdesign/home.jsp"); //���������� �ٽ� �α������� ��������.
		}	
	}
}





