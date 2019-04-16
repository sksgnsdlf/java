package co.micol.mvcTestDAO; //3번

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MvcDao3 {
	private String drive = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String user = "micol";
	private String pw = "1234";
	
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;
	
	public MvcDao3() {// 생성자		
		try {
			Class.forName(drive); //DB와 연결
			conn = DriverManager.getConnection(url, user, pw); //DB와 연결
		} catch (ClassNotFoundException e) { //exception 발생시 코드나옴
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("실패닷");
		}
	}

	public void close() {
		try {
			if(rs != null) rs.close();
			if(psmt != null) psmt.close();
			if(conn != null) conn.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}		
	}
	
	public ResultSet select(String sql) {
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
	
	public int insertUpdateDelete(String sql) {
		int n=0;
		try {
			psmt = conn.prepareStatement(sql);
			n = psmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return n;
	}
}