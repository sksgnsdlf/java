package co.miclo.attendence;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AttendenceDatainput implements ServiceInterface {
	private String sql;
	private Dao dao;

	@Override
	public String input() {
		int rownum = 1;
		String date = "2019-03-23";
		char att = 'N';
		sql = "insert into s_attendence values(" + rownum + ",'" + date + "','" + att + "')";
		return sql;
	}

	@Override
	public void processDao() {
		try {
			dao = new AttendeceDao();
			int n = dao.insert(sql);
			if (n != 0)
				System.out.println("정상 입력");
			else
				System.out.println("입력 실패");
		} catch (ClassNotFoundException | IOException | SQLException e) {

		}
	}

	@Override
	public void run() {
		ResultSet rs;
		input();
		processDao();
		rs = dao.select("select * from s_attendence order by l_sub_recode asc");
		try {
			while (rs.next()) {
				System.out.print(rs.getInt("l_sub_recode") + "  ");
				System.out.print(rs.getDate("a_date")+ "  ");
				System.out.print(rs.getString("a_check"));
				System.out.println();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
