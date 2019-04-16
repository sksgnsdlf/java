package co.micol.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import co.micol.db.dbDto;

public class dbDao {
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;

	private String drv = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String user = "micol";
	private String pw = "1234"; // 여기까지는 기본적으로 해야 할 일

	public dbDao() throws SQLException {
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

	public int Studentinput(dbDto dto) {
		int n = 0;
		String sql = "insert into s_student values(?,?,?,?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getStudent_id());
			psmt.setString(2, dto.getStudent_name());
			psmt.setString(3, dto.getStudent_tel());
			psmt.setString(4, dto.getDept_code());
			n = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return n;
	}
	
	public int deptinput(dbDto dto) {
		int n = 0;
		String sql = "insert into s_dept values(?,?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getDept_code());
			psmt.setString(2, dto.getDept_name());
			n = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return n;
	}
	
	public int scoreinput(dbDto dto) {
		int n = 0;
		String sql = "insert into s_score values(?,?,?,?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getStudent_id());
			psmt.setString(2, dto.getS_code());
			psmt.setString(3, dto.getS_score());
			psmt.setString(4, dto.getS_grade());
			n = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return n;
	}
	
	public int subjectinput(dbDto dto) {
		int n = 0;
		String sql = "insert into s_subject values(?,?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getS_code());
			psmt.setString(2, dto.getS_name());
			n = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return n;
	}
	
	public int professorinput(dbDto dto) {
		int n = 0;
		String sql = "insert into s_professor values(?,?,?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getP_code());
			psmt.setString(2, dto.getP_name());
			psmt.setString(3, dto.getP_tel());
			n = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return n;
	}
	
	public int lectureinput(dbDto dto) {
		int n = 0;
		String sql = "insert into s_lecture values(?,?,?,?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getL_code());
			psmt.setString(2, dto.getP_code());
			psmt.setString(3, dto.getS_code());
			psmt.setString(4, dto.getL_room());
			n = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return n;
	}
	
	public int attendenceinput(dbDto dto) {
		int n = 0;
		String sql = "insert into s_attendence values(?,?,?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getL_sub_recode());
			psmt.setString(2, dto.getA_date());
			psmt.setString(3, dto.getA_check());
			n = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return n;
	}
	public int attendenceMasterinput(dbDto dto) {
		int n = 0;
		String sql = "insert into s_attendence_master values(?,?,?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getL_code());
			psmt.setString(2, dto.getStudent_id());
			psmt.setString(3, dto.getL_sub_recode());
			n = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return n;
	}
}
