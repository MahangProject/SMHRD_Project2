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
		// 1. 전체리스트를 가져오기
		MMemberDAO dao = new MMemberDAO();
		ArrayList<MMemberVO> list = dao.memberAllList();

		// 2.객체바인딩
		request.setAttribute("list", list);
		// View -> member/memberList.jsp
		return "member/memberList.jsp"; // "/WEB-INF/member/memberList.jsp" =>앞에 경로를 지우고 파일이름만 사용하는 방법 : 
																		// WEB-INF폴더 안에 views폴더 생성 후 member폴더를 그안에 넣어줌 
																		//   => 이때 상세경로 "/WEB-INF/views/member/memberList.jsp"
																		//    => 공통경로 "/WEB-INF/views/" : 프론트에서 설정 변경해주기

	}

}
