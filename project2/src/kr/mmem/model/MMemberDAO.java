package kr.mmem.model;

import java.sql.*;
import java.util.ArrayList;
// JDBC --> MyBatis 
public class MMemberDAO {

	private Connection conn; // Connection 연결객체
	private PreparedStatement ps;
	private ResultSet rs;

	// 초기화 블럭
	static {
		try { // DriverManager와 내부적으로 연결됨
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	// 연결객체 만드는 작업
	public Connection getConnect() {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String user = "hr";
		String password = "hr";

		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	public int mmemberInsert(MMemberVO vo) {
		conn = getConnect();
		// MyBatis : SQL Mapping Framework for Java   
		String SQL = "insert into mmember values(?,?,?,?,?,?,0)"; //0으로 넣고. 나중에 테스트에서 추가하는걸로.
		int cnt = -1; // -1(실패)
		try {
			ps = conn.prepareStatement(SQL);
			ps.setString(1, vo.getId());
			ps.setString(2, vo.getPw());
			ps.setString(3, vo.getName());
			ps.setString(4, vo.getEmail());
			ps.setInt(5, vo.getAge());
			ps.setString(6, vo.getGender());
			cnt = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dbClose();
		}
		return cnt;
	}

	public ArrayList<MMemberVO> memberAllList() {

		ArrayList<MMemberVO> list = new ArrayList<MMemberVO>();
		conn = getConnect();
		String SQL = "select * from mmember";

		try {
			ps = conn.prepareStatement(SQL);
			rs = ps.executeQuery();
			while (rs.next()) {


				String id = rs.getString("id");
				String pw = rs.getString("pw");
				String name = rs.getString("name");
				String email = rs.getString("email");
				int age = rs.getInt("age");
				String gender = rs.getString("gender");
				int rses = rs.getInt("rses");

				MMemberVO vo = new MMemberVO(id, pw, name, email, age, gender, rses);

				list.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dbClose();
		}
		return list;
	}

	public int mmemberDelete(int num) {
		conn = getConnect();
		String SQL = "delete from mmember where num=?";
		int cnt = -1;
		try {
			ps = conn.prepareStatement(SQL);
			ps.setInt(1, num);
			cnt = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dbClose();
		}
		return cnt;
	}

	public void dbClose() {

		try {
			if (rs != null)
				rs.close();
			if (ps != null)
				ps.close();
			if (conn != null)
				conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public MMemberVO mmemberContent(int num) {
		MMemberVO vo = null;
		conn = getConnect();
		String SQL = "select * from mmember where num=?";
		try {
			ps = conn.prepareStatement(SQL);
			ps.setInt(1, num);
			rs = ps.executeQuery();
			if (rs.next()) {


				String id = rs.getString("id");
				String pw = rs.getString("pw");
				String name = rs.getString("name");
				String email = rs.getString("email");
				int age = rs.getInt("age");
				String gender = rs.getString("gender");
				int rses = rs.getInt("rses");
				vo = new MMemberVO(id, pw, name, email, age, gender, rses);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			dbClose();
		}
		return vo;
	}

	public int mmemverUpdate(MMemberVO vo) {
		conn = getConnect();
		String SQL = "update mmember set pw=?,email=?";
		int cnt = -1;
		try {
			ps = conn.prepareStatement(SQL);
			ps.setString(1, vo.getPw());
			ps.setString(2, vo.getEmail());
			
			cnt = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dbClose();
		}
		return cnt;
	}
	
	public int testScoreUpdate(int score, String id) {
		conn = getConnect();
		String SQL = "update mmember set RSES=? where id = ?"; //이거 고쳐야한다.
		int cnt = -1;
		try {
			ps = conn.prepareStatement(SQL);
			ps.setInt(1,score);
			ps.setString(2,id);
			
			cnt = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dbClose();
		}
		return cnt;
	}
	
	public int testScoreLoad(String id) {
		conn = getConnect();
		String SQL = "select RSES from mmember where id=?"; //이거 고쳐야한다.
		int cnt = -1;
		int rses = 0;
		try {
			ps = conn.prepareStatement(SQL);
			ps.setString(1,id);
			rs = ps.executeQuery();
			if (rs.next()) {
				rses = rs.getInt("rses");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dbClose();
		}
		return rses;
	}
}
