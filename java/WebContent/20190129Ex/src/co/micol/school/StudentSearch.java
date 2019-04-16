package co.micol.school;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentSearch {
	private String name;
	private String sql;

	public void searchname() throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 이름을 입력하세요.");
		name = sc.next();
		sql = "select studentid, studentname, studentaddr, studenttel, deptname " + 
		"from student s, dept d "+ 
		"where s.deptcode = d.deptcode AND studentname = '" + name + "'";
		// dao 호출
		SchoolDao dao = new SchoolDao();
		try {
			ResultSet rs= dao.nameSearch(sql);
			while (rs.next()) {
				System.out.print(rs.getString("studentid") + "  ");
				System.out.print(rs.getString("studentname") + "  ");
				System.out.print(rs.getString("studentaddr") + "  ");
				System.out.print(rs.getString("studenttel") + "  ");
				System.out.println(rs.getString("deptname"));
			}
		} catch (SQLException e) {

		}
	}
}
