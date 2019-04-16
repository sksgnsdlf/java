package Test;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.spi.DirStateFactory.Result;

public class SelectServiceImpl implements TestExamInterface {
	private String sql;
	private Dao dao;

	@Override
	public String createSql() {
		sql = "select * from testexam";
		return sql;
	}

	@Override
	public void daoCall() {
		try {
			dao = new TestExamDAO();
			ResultSet n = dao.select(sql);
			if (n != null)
				System.out.println("testexam 정보 오픈");
			else
				System.out.println("testexam 정보 실패");
		} catch (ClassNotFoundException | IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		ResultSet rs;
		createSql();
		daoCall();
		rs = dao.select("select * from testexam");
		try {
			while (rs.next()) {
				System.out.print(rs.getInt("rowno") + "  ");
				System.out.print(rs.getString("registerid")+ "  ");
				System.out.print(rs.getString("name")+ "  ");
				System.out.print(rs.getString("dept")+ "  ");
				System.out.print(rs.getString("position"));
				System.out.println();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
