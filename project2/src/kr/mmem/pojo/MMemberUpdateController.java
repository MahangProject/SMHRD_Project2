package kr.mmem.pojo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.mmem.model.MMemberDAO;
import kr.mmem.model.MMemberVO;

public class MMemberUpdateController implements Controller {

	@Override
	public String requestHandle(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String cpath = request.getContextPath();
		int num = Integer.parseInt(request.getParameter("num"));
		String pw = request.getParameter("pw");
		String email = request.getParameter("email");
		MMemberVO vo = new MMemberVO();
		vo.setNum(num);
		vo.setPw(pw);
		vo.setEmail(email);

		MMemberDAO dao = new MMemberDAO();
		int cnt = dao.mmemverUpdate(vo);
		String page = null;
		if (cnt > 0) {
			page = "redirect:"+cpath+"/list.do";
		} else {
			throw new ServletException("error");
		}

		return page;
	}

}
