package co.micol.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDao {
	Connection conn;
	PreparedStatement psmt;
	ResultSet rs;
	
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "micol";
	String pw = "1234";
	
	public StudentDao() throws SQLException {
		try {
			Class.forName(driver); //드라이버를 로드 합니다.
			conn = DriverManager.getConnection(url, user, pw);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void select() {
//		String sql = "select * from student";
//		String sql = "select * from student where studentid = '201901001'";
		String sql = "select studentname, studentaddr from student where studentid = '201901001'";
		try {		//부분적으로 select를 했을때는 출력문도 select에 찾게 맞춰야함		
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while(rs.next()) {
//				System.out.println(rs.getString("studentid")); 
												//DB에서 테이블의 컬럼이름
				System.out.println(rs.getString("studentname"));
				System.out.println(rs.getString("studentaddr"));
//				System.out.println(rs.getString("studenttel"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close(); //순서대로 닫아줘야함
				if(psmt != null) psmt.close();
//				if(conn != null) conn.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void insert() {
		String sql="insert into student values(?,?,?,?)";
		int i;
		try {
			 psmt = conn.prepareStatement(sql);
			 psmt.setString(1, "201901005"); //학번
			 psmt.setString(2, "심청이"); //성명
			 psmt.setString(3, "서울시 강남구 강남동"); //주소
			 psmt.setString(4, "010-1235-1235"); //성명
			 i = psmt.executeUpdate();
			 if(i !=0) System.out.println("정상적으로 입력이 되었습니다.");
			 else System.out.println("입력 실패");
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(psmt != null) psmt.close();
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void update() {
		String sql = "update student set studentname = ? where studentid= ? ";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, "박기자");
			psmt.setString(2, "201901001");
			int i = psmt.executeUpdate();
			if (i != 0 ) System.out.println("정상 갱신 되었음");
			else System.out.println("갱신 실패");
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			try {
				if(psmt!=null)psmt.close();
			} catch(SQLException e) {
				
			}
		}
	}
	
	public void delete() throws SQLException{
		String sql = "delete from student where studentid=?";
		psmt = conn.prepareStatement(sql);
		psmt.setString(1, "201901005");
		int i=psmt.executeUpdate();
		if(i != 0) System.out.println("정상 삭제 되었음");
		else System.out.println("삭제 실패");
		if(psmt != null) psmt.close();
	}
	
	public void close() throws SQLException {
		if(conn != null) conn.close();
	}
}
