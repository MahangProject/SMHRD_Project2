package kr.mmem.pojo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MMemberInsertFormController implements Controller{

	@Override
	public String requestHandle(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		// String page = "member/member.html";
		
		return "member/member.html";  //   "/WEB-INF/member/member.html"; =>�տ� ��θ� ����� �����̸��� ����ϴ� ���(WEB-INF�� ������ �ȵ�) : 
	}

}
