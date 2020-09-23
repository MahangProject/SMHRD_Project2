package kr.mmem.pojo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.mmem.model.MMemberDAO;
import kr.mmem.model.MMemberVO;

public class MMemberInsertController implements Controller {
	@Override
	public String requestHandle(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String cpath = request.getContextPath();
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		int age = Integer.parseInt(request.getParameter("age"));
		String gender = request.getParameter("gender");
		int rses = Integer.parseInt(request.getParameter("rses"));
		MMemberVO vo = new MMemberVO();
		vo.setName(name);

		MMemberDAO dao = new MMemberDAO();
		int cnt = dao.mmemberInsert(vo);
		String page = null;
		if (cnt > 0) {
			// (list페이지로 가셔요..)하는 경로만 전달
			page = "redirect:"+cpath+"/list.do";     // redirect: --> 배움의 마지막인가.... 책에 잘안나 
		} else {
			throw new ServletException("error");
		}
		return page;
	}

}
