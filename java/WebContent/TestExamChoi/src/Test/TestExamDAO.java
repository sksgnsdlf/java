package Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestExamDAO extends Dao {
	public TestExamDAO() throws ClassNotFoundException, FileNotFoundException, IOException, SQLException {
		super();
		// TODO Auto-generated constructor stub
	}

	private PreparedStatement psmt;
	private ResultSet rs;
	
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
		int n = 0;
		try {
			psmt = conn.prepareStatement(sql);
			n = psmt.executeUpdate();
		}catch(SQLException e) {
			
		}
		return n;
	}

	@Override
	public int update(String sql) {
		int n = 0;
		try {
			psmt = conn.prepareStatement(sql);
			n = psmt.executeUpdate();
		}catch(SQLException e) {
			
		}
		return n;
	}
	
	@Override
	public int delete(String sql) {
		int n = 0;
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
		}catch(SQLException e) {
			
		}	
	}
}
