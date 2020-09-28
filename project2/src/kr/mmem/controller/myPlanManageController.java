package kr.mmem.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.mmem.model.planDAO;
import kr.mmem.model.planVO;

@WebServlet("/myplanmake")
public class myPlanManageController extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setCharacterEncoding("utf-8"); //인코딩...
		HttpSession session = request.getSession(); // 세션 가져오기
		planDAO dao = new planDAO();
		String plan1 = request.getParameter("do_list1"); // 사용자가 입력한 실천한 행동
		int success1 = Integer.parseInt(request.getParameter("success1")); // 실천 성공 점수
		ArrayList<planVO> list = dao.planAllList(); // 행동계획표 전체 목록(날짜별 내림차순)
		int score = 0; // 실천점수 총점 초기화
		if (list.isEmpty()) {
		}else {
			score = list.get(0).getMission_score(); // 실천 점수 총점 가져오기
		}
		
		PrintWriter out = response.getWriter();
		planVO dto = new planVO(plan1, success1, score);
		int cnt =0;
		cnt = dao.makePlan(dto); // 행동과 점수를 db에 저장
		session.setAttribute("score", score); // 총점을 화면에 나타내기 위해 객체 바인딩
		if(cnt>0) {
			response.sendRedirect("/project2/webdesign/plan.jsp");
		}else {
			out.print("fail");
		}
	}
}
