package grade;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class stModel extends stDao{
	private PreparedStatement psmt;
	private ResultSet rs;
	private String sql="select * from data";
	private stDao dao;
	private stBean dto;
	
	public stModel() throws ClassNotFoundException, FileNotFoundException, IOException, SQLException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public ResultSet select() {
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
		}catch(SQLException e) {
			
		}
		return rs;
	}
	
	public void run() {
		dto = new stBean();
		rs = select();
		try {
			System.out.println("학번 \t 성명  국어 수학 영어 역사 총점 평균");
			while (rs.next()) {
				dto.setId(rs.getInt("id"));
				dto.setName(rs.getString("name"));
				dto.setKor(rs.getInt("kor"));
				dto.setEng(rs.getInt("eng"));
				dto.setMath(rs.getInt("math"));
				dto.setHis(rs.getInt("his"));
					dto.toString();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}