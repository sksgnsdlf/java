package co.micol.address.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Dao {
	private String drive = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String user = "micol";
	private String pw = "1234";
	
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;
	
	public Dao() {// 생성자		
		try {
			Class.forName(drive); //DB와 연결
			conn = DriverManager.getConnection(url, user, pw); //DB와 연결
		} catch (ClassNotFoundException e) { //exception 발생시 코드나옴
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("실패닷");
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
}
