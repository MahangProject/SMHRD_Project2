package kr.mmem.pojo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.mmem.model.MMemberDAO;

public class MMemberDeleteController implements Controller{

	@Override
	public String requestHandle(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String cpath = request.getContextPath();
		int num = Integer.parseInt(request.getParameter("num"));
		
		MMemberDAO dao = new MMemberDAO();
		int cnt = dao.mmemberDelete(num);
		String page = null;
		if (cnt > 0) {
			page = "redirect:"+cpath+"/list.do";  // redirect:/ <= 포워딩 하는 놈이기 때문
		} else {
			throw new ServletException("error");
		}
		return page;
	}

}
