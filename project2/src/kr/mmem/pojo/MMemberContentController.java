package kr.mmem.pojo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.mmem.model.MMemberDAO;
import kr.mmem.model.MMemberVO;

public class MMemberContentController implements Controller{

	@Override
	public String requestHandle(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		int num = Integer.parseInt(request.getParameter("num"));
		MMemberDAO dao = new MMemberDAO();
		MMemberVO vo= dao.mmemberContent(num);
		// memberContent.jsp
		request.setAttribute("vo", vo);
		
		return "mmember/mmemberContent.jsp";
	}

}
