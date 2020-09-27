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

		// Ŭ���̾�Ʈ�� ������ ��û�ϸ� Ŭ���̾�Ʈ�� � ������ ������ �Ѿ�´�.(��Ŷ: ���(client�� IP-addr)+
		// �ٵ�(req.getParam)�� ����)

		Enumeration<String> headerNames = request.getHeaderNames(); // enumeration

		PrintWriter out = response.getWriter();
		while (headerNames.hasMoreElements()) { // ����� �̸��� ���� �ϴ��� ���ϴ��� Ȯ�� boolean ��ȯ

			String name = headerNames.nextElement(); //>> cursor�� element�� �������� �̵���.
			String value = request.getHeader(name);
			out.println(name+":"+value);
			System.out.println(name+":"+value);
		}
		String ip = request.getRemoteHost(); // remote == client remotehost >> ip��������
		out.println("Client IP :"+ ip);
		request.setCharacterEncoding("euc-kr");
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		//id = admin / pwd = admin
		
		if(id.equals("whizzerscowl")&&pwd.equals("1111")) {
			// ȸ�� ������ ���� -> ���� �Ǵ� �������� �̵��� ������� ���� .�����̵��� ����� �ָ� ��(Servlet, JSP)
			//main.jsp, banking.jsp
			HttpSession session = request.getSession(); //session ID�� ����� �޼ҵ� //sessionID�����Ҵ�.
			System.out.println(session.getMaxInactiveInterval()); //session ���ӵǴ� �ð�check
			System.out.println(session.getId());
			System.out.println(session.getLastAccessedTime());
			System.out.println(session.getCreationTime()); //������ ������� �ð�.
			session.setAttribute("id", id); // ��ü ���ε�(session) 
			MMemberDAO dao = new MMemberDAO();
			session.setAttribute("rses", dao.testScoreLoad(id));
			planDAO dao2 = new planDAO();
			int score = 0;
			ArrayList<planVO> list = dao2.planAllList();
			if (list.isEmpty()) {
			}else {
				System.out.println("�̼ǽ��ھ�:"+list.get(0).getMission_score());
				score = list.get(0).getMission_score();
			}
			session.setAttribute("score", score);
			response.sendRedirect("/project2/webdesign/plan.jsp");
			
		}else {
			System.out.println("����");
			//page�� �ٲٴ� ��� >> 	1. forwarding 
							  //2. response.sendredirect
			
			response.sendRedirect("/project2/webdesign/home.jsp"); //���������� �ٽ� �α������� ��������.
		}	
		
		
			//>>client�� server�� session���� �ν��� �Ѵ�. ������ �ʾ� �������� ������ �ʴ´ٸ�. 
		
		// 1. ���ǰ�(sessionID= 32 )�� �����´�. 
		// 2. ����ID���� �����. (JSESSIONID=100)
		// 3. ������� ����ID���� Ŭ���̾�Ʈ�� ������. 
		
		
		
		
		
	}

}





