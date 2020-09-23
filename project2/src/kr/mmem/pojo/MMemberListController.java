package kr.mmem.pojo;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.mmem.model.MMemberDAO;
import kr.mmem.model.MMemberVO;

public class MMemberListController implements Controller {

	@Override
	public String requestHandle(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 1. ��ü����Ʈ�� ��������
		MMemberDAO dao = new MMemberDAO();
		ArrayList<MMemberVO> list = dao.memberAllList();

		// 2.��ü���ε�
		request.setAttribute("list", list);
		// View -> member/memberList.jsp
		return "member/memberList.jsp"; // "/WEB-INF/member/memberList.jsp" =>�տ� ��θ� ����� �����̸��� ����ϴ� ��� : 
																		// WEB-INF���� �ȿ� views���� ���� �� member������ �׾ȿ� �־��� 
																		//   => �̶� �󼼰�� "/WEB-INF/views/member/memberList.jsp"
																		//    => ������ "/WEB-INF/views/" : ����Ʈ���� ���� �������ֱ�

	}

}
