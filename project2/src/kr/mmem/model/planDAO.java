package kr.mmem.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



public class planDAO {

	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;

	private void getConnection() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String db_url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
			String db_id = "hr";
			String db_pw = "hr";

			conn = DriverManager.getConnection(db_url, db_id, db_pw);

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void close() {

		try {
			if (rs != null) {
				rs.close();
			}
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public int makePlan(planVO dto) { // 계획 세우는 메소드
		int cnt = 0;
		
		getConnection();

			try {
				String sql = "insert into plan values("
						+ "'whizzerscowl'," // id
						+ "sysdate,"// do_date
						+ "'2100'," // alarm 근데 알람이 필요한가? 
						+ "?," 		// do_list1
						+ "?," 		// success1
						+ "?)";		//misson_score 누적할지 말지 결정.
				
				System.out.println(dto.getDo_list1());
				System.out.println(dto.getSuccess1());
				System.out.println("미션점수에오"+dto.getMission_score());
				
				psmt = conn.prepareStatement(sql);
				
				psmt.setString(1, dto.getDo_list1());
				psmt.setInt(2, dto.getSuccess1());
				psmt.setInt(3, (dto.getMission_score()+dto.getSuccess1()));
				
				cnt = psmt.executeUpdate();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				close();
			}
			
	
		
		return cnt;
	}
	

	public ArrayList<planVO> planAllList() { //리스트를 만들때는 그에 맞는 값들을 여러개 뽑아와야하니깐 ArrayList가 적당함 
		//과거내역 볼때 필요한 메소드
		getConnection();
		
		ArrayList<planVO> list = new ArrayList<planVO>(); //새로 생성해서.
		String sql = "SELECT * from plan order by do_date desc"; //DB에 있는 값들을 불러온다. 
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery(); // cursor

			while (rs.next()) {
				String id = rs.getString(1);
				String do_date = rs.getString(2);
				String alarm = rs.getString(3);
				String do_list1 = rs.getString(4);
				int success1 = rs.getInt(5);
				int mission_score = rs.getInt(6);
				
				planVO dto = new planVO(id, do_date, alarm, do_list1, success1, mission_score);
				//반복문을 통해서 가져옴.
				list.add(dto); //list에 memberVO생성자 형식으로 넣어주기 
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}finally { //에러가 있건 없건 무조건 한번 실행. 
			close();
		}

		return list;
	}
	
	//=================================< 미션 달성시 점수 추가해 주는 메소드>===============================================
	
	
	public int success1Update(planVO dto) { 								//success1 
	      getConnection();
	      String SQL="update plan set success1 =? where id=? and do_date=?";
	      int cnt= 0;
	      try {
	      psmt=conn.prepareStatement(SQL);
	      psmt.setInt(1, 1);
	      psmt.setString(2, dto.getId());
	      psmt.setString(3, dto.getDo_date());
	      cnt=psmt.executeUpdate();
	   } catch (Exception e) {
	      e.printStackTrace();
	   }finally {
	      close();
	   }
	     return cnt; 
	   }
	
	public int success2Update(planVO dto) { 								//success2 
	      getConnection();
	      String SQL="update plan set success2 =? where id=? and do_date=?";
	      int cnt= 0;
	      try {
	      psmt=conn.prepareStatement(SQL);
	      psmt.setInt(1, 1);
	      psmt.setString(2, dto.getId());
	      psmt.setString(3, dto.getDo_date());
	      cnt=psmt.executeUpdate();
	   } catch (Exception e) {
	      e.printStackTrace();
	   }finally {
	      close();
	   }
	     return cnt; 
	   }
	
	public int success3Update(planVO dto) { 								//success3
	      getConnection();
	      String SQL="update plan set success3 =? where id=? and do_date=?";
	      int cnt= 0;
	      try {
	      psmt=conn.prepareStatement(SQL);
	      psmt.setInt(1, 1);
	      psmt.setString(2, dto.getId());
	      psmt.setString(3, dto.getDo_date());
	      cnt=psmt.executeUpdate();
	   } catch (Exception e) {
	      e.printStackTrace();
	   }finally {
	      close();
	   }
	     return cnt; 
	   }
	
	public int successUpdate(planVO dto) { 									//success book업데이트.
	      getConnection();
	      String SQL="update plan set success =? where id=? and do_date=?";
	      int cnt= 0;
	      try {
	      psmt=conn.prepareStatement(SQL);
	      psmt.setInt(1, 1);
	      psmt.setString(2, dto.getId());
	      psmt.setString(3, dto.getDo_date());
	      cnt=psmt.executeUpdate();
	   } catch (Exception e) {
	      e.printStackTrace();
	   }finally {
	      close();
	   }
	     return cnt; 
	   }
	//====================================================================================================
	
	//========================================<plan수정>===================================================
	
	public int planUpdate(planVO dto) { 									//do_list1 업데이트.
	      getConnection();
	      String SQL="update plan set do_list1 =? where id=? and do_date=?";
	      int cnt= 0;
	      try {
	      psmt=conn.prepareStatement(SQL);
	      psmt.setString(1, dto.getDo_list1());
	      psmt.setString(2, dto.getId());
	      psmt.setString(3, dto.getDo_date());
	      cnt=psmt.executeUpdate();
	   } catch (Exception e) {
	      e.printStackTrace();
	   }finally {
	      close();
	   }
	     return cnt; 
	   }
	
}
