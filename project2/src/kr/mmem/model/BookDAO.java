package kr.mmem.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class BookDAO {
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	
	// �ʱ�ȭ��(������ �����)
	static {
		try {	// �����ε� �� DriverManager�� ����
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public Connection getConnect() {
		String url="jdbc:oracle:thin:@127.0.0.1:1521:XE"; // @���� ��������
		String user="hr";
		String password="hr";
		
		try {
			// ������ ����̹��Ŵ����� ����Ǿ��⿡ ���� �ʱ�ȭ �ʿ� ���� ����ƽ������� ��밡��
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	public void dbClose() {
		try {
			if (rs!=null) rs.close();
			if (ps!=null) ps.close();
			if (conn!=null) conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public ArrayList<BookVO> bookAllList() {
		ArrayList<BookVO> list = new ArrayList<BookVO>();
		conn = getConnect();
		String SQL="select * from book order by b_number";
		try {
			ps = conn.prepareStatement(SQL);
			rs = ps.executeQuery();
			while (rs.next()) {
				int b_number = rs.getInt(1);
				String b_name = rs.getString(2);
				String b_category = rs.getString(3);
				String b_url = rs.getString(4);
				BookVO vo = new BookVO(b_number,b_name,b_category,b_url);
				list.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			dbClose();
		}
		return list;
	}
	public double[] scoreAllList(String id) {
		double[] list2 = new double[165];
		conn = getConnect();
		String SQL="select * from book_rating where id = ?";
		try {
			ps = conn.prepareStatement(SQL);
			ps.setString(1, id);
			rs = ps.executeQuery();
			while (rs.next()) {
			for(int i = 1; i < 166; i++) {
				if(rs.getString("rating_"+i)==null) {
					list2[i-1] = 0.0;
				}else {
					list2[i-1] = Double.parseDouble(rs.getString("rating_"+i));
				}
			}}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			dbClose();
		}
		return list2;
	}
}
