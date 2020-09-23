package kr.mmem.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.mmem.model.MMemberDAO;
import kr.mmem.model.MMemberVO;
import kr.mmem.pojo.Controller;
import kr.mmem.pojo.MMemberDeleteController;
import kr.mmem.pojo.MMemberInsertController;
import kr.mmem.pojo.MMemberInsertFormController;
import kr.mmem.pojo.MMemberListController;

public class MMemberFrontController extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("euc-kr");
		// 1.���û���� �ľ��ϴ� �۾� -> .do
		String reqUri = request.getRequestURI();
		// System.out.println(reqUri);
		String ctxPath = request.getContextPath();
		// System.out.println(ctxPath);
		// Ŭ���̾�Ʈ�� ��û�� ���
		String command = reqUri.substring(ctxPath.length());
		System.out.println(command);
		
		// �� ��û�� ���� ó���ϱ�(�б��۾�)
		Controller controller = null;
		MMemberDAO dao = new MMemberDAO();
		String nextView = null;
		HandlerMapping mappings = new HandlerMapping();
		controller=mappings.getController(command);
		nextView = controller.requestHandle(request, response);
		
		
		// �ڵ鷯����(HandlerMapping) : POJO�� ������ ã�� �������ִ� ����(�����˹ٻ�)
		//    key   -->   value        : Ű�� ��� ���·� �� �� ���� 
		// /list.do --> MemberListController
		// /insert.do --> MemberInsertController
		// /insertForm.do --> MemberInsertFormController
		// /delete.do --> MemberDeleteController
		/*
		if (command.equals("/list.do")) {
			//��ü����(�˹ٻ�pojo ��ȯ�ϱ� ����)
			controller =new MemberListController();
			nextView = controller.requestHandle(request,response); //�˹� ��ȯ �Ͻ�Ű��
			
		} else if (command.equals("/insert.do")) {
			controller = new MemberInsertController();
			nextView = controller.requestHandle(request, response);
			
		} else if (command.equals("/insertForm.do")) {
			controller = new MemberInsertFormController();
			nextView = controller.requestHandle(request, response);
			
		} else if (command.equals("/delete.do")) {
			controller = new MemberDeleteController();
			nextView = controller.requestHandle(request, response);
		}*/
		
		// -----------------------------------------------------------------------------------
		// View �������� �����ϴ� �κ�
		if(nextView!=null) {
			if(nextView.indexOf("redirect") != -1) {
				String[] sp = nextView.split(":");  //sp[0]:sp[1]
				response.sendRedirect(sp[1]); // :o
				
			}else {
				RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/"+nextView);  // "/WEB-INF/views/"�� ������
				rd.forward(request, response);

			}
		}
		
		
	}

}
