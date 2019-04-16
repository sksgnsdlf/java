package co.miclo.attendence;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AttendenceSearch implements ServiceInterface {
	private Dao dao;
	private Dto dto;
	private ResultSet rs;
	private String sql;

	@Override
	public String input() {
		sql = "select * from attendenceview"; // view table 호출
		return null;
	}

	@Override
	public void processDao() { // dto값을 어떻게?
		try {
			dao = new AttendeceDao();
			rs = dao.select(sql);
			while (rs.next()) {
				dto = new Dto();
				int i = 0;
				dto.lecture = rs.getString("s_name");
				dto.professor = rs.getString("p_name");
				dto.studentName = rs.getString("student_name");
				dto.attendence[i++] = rs.getString("a_check");
				while(rs.next()) {
					if (rs.getString("student_name").equals(dto.studentName)) {
						dto.attendence[i++] = rs.getString("a_check");
						continue;
						} else {
							break;
					}
				}
				dto.toString();
//				rs.previous(); ->
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void run() {
		input();
		processDao();
		dao.close();
	}

}
