package co.micol.school;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SchoolDao {
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;

	private String drv = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String user = "micol";
	private String pw = "1234"; // 여기까지는 기본적으로 해야 할 일

	public SchoolDao() throws SQLException {
		try {
			Class.forName(drv);
			conn = DriverManager.getConnection(url, user, pw);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
//			System.out.println("드라이버로드 실패!!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public ResultSet nameSearch(String sql) {
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();	
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
	
	public ResultSet select() {
		String sql = "select * from student";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
	
	public int input(StudentDto dto) {
		int n = 0;
		String sql ="insert into student values(?,?,?,?,?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getStudentid());
			psmt.setString(2, dto.getStudentname());
			psmt.setString(3, dto.getStudentaddr());
			psmt.setString(4, dto.getStudenttel());
			psmt.setString(5, dto.getDeptcode());
			n= psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return n;
	}
	
	public int delete(StudentDto dto) {
		int n = 0;
		String sql ="delete from student where studentname = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getStudentid());
			n= psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return n;
	}
}
