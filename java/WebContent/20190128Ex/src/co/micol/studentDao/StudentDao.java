package co.micol.studentDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDao {
	Connection conn;	
	PreparedStatement psmt;
	ResultSet rs;
	
	String drv = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "micol";
	String pw = "1234";
	
	public StudentDao() throws SQLException, ClassNotFoundException{
		Class.forName(drv);
		conn = DriverManager.getConnection(url,user,pw);
	}
	
	public ResultSet select(String sql)  throws SQLException{
//		String sql = "select * from student"; 
		psmt = conn.prepareStatement(sql);
		rs = psmt.executeQuery();
		return rs;
	}
	
	public void close() throws SQLException{
		if(rs != null) rs.close();
		if(psmt != null) psmt.close();
		if(conn != null) conn.close();
	}

}
