package co.miclo.attendence;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AttendeceDao extends Dao {

	private PreparedStatement psmt;
	private ResultSet rs;
	
	public AttendeceDao() throws ClassNotFoundException, FileNotFoundException, IOException, SQLException {
		super(); //Dao dao = new Dao(); 상위클래스로 초기화
	}

	@Override
	public ResultSet select(String sql) {
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
		}catch(SQLException e) {
			
		}
		return rs;
	}

	@Override
	public int insert(String sql) {
		int n=0;
		try {
			psmt = conn.prepareStatement(sql);
			n = psmt.executeUpdate();
		}catch(SQLException e) {
			
		}
		return n;
	}

	@Override
	public int delete(String sql) {
		int n=0;
		try {
			psmt = conn.prepareStatement(sql);
			n = psmt.executeUpdate();
		}catch(SQLException e) {
			
		}
		return n;
	}

	@Override
	public int update(String sql) {
		int n=0;
		try {
			psmt = conn.prepareStatement(sql);
			n = psmt.executeUpdate();
		}catch(SQLException e) {
			
		}
		return n;
	}
	
	@Override
	public void close() {
		try {
			if(rs != null) rs.close();
			if(psmt != null) psmt.close();
			if(conn != null) conn.close();
		}catch (SQLException e) {
			
		}
	}

}
