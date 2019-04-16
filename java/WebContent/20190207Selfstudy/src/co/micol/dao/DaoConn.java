package co.micol.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class DaoConn {
	public Connection conn;
	private String drive = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String user = "micol";
	private String pw = "1234";

	public DaoConn() {// 생성자		
		try {
			Class.forName(drive); //DB와 연결
			conn = DriverManager.getConnection(url, user, pw); //DB와 연결
		} catch (ClassNotFoundException e) { //exception 발생시 코드나옴
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("실패닷");
		}
	}
	
	public abstract ResultSet select(String sql);
	public abstract int insert(String sql);
	public abstract int update(String sql);
	public abstract int delete(String sql);
	public abstract void selectAll();
	public abstract void close();
}
