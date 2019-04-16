package co.micol.professor;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import co.micol.dao.DaoConn;

public class ProfessorDao extends DaoConn {
	private PreparedStatement psmt;
	private ResultSet rs;
	
	@Override
	public ResultSet select(String sql) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(String sql) {
		int n = 0;
		try {
			psmt = conn.prepareStatement(sql);
			n = psmt.executeUpdate();
		} catch (SQLException e) {

		}
		return n;
	}

	@Override
	public int update(String sql) {
		int n = 0;
		try {
			psmt = conn.prepareStatement(sql);
			n = psmt.executeUpdate();
		} catch (SQLException e) {

		}
		return n;
	}

	@Override
	public int delete(String sql) {
		int n = 0;
		try {
			psmt = conn.prepareStatement(sql);
			n = psmt.executeUpdate();
		} catch (SQLException e) {

		}
		return n;
	}

	@Override
	public void selectAll() {
		String sql = "select * from s_professor";
		ResultSet rs;
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			System.out.println("교수코드 \t 교수이름 \t 교수번호");
			while(rs.next()) {
				if(rs.next()) 
				System.out.println(rs.getString("p_code") + "\t" + rs.getString("p_name")
				+ "\t" + rs.getString("p_tel"));
				else System.out.println("데이터가 존재하지 않는다.");
			}
			
		}catch(SQLException e) {
			
		}
	}

	@Override
	public void close() {
		try {
			if (rs != null)
				rs.close();
			if (psmt != null)
				rs.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {

		} catch (NullPointerException e) {
			
		}
	}
}
