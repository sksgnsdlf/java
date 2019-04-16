package co.micol.service.professor;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class ProfessorDao extends DaoConn { // 2.Dao하위클래스 생성(상속하면 오버라이딩이 됨)
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

		} catch(NullPointerException e) {
		
		}
	}
}
