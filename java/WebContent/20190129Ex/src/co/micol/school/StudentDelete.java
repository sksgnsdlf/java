package co.micol.school;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentDelete {
	public void deleteMethod() {

		Scanner scan = new Scanner(System.in);

		String driver = "oracle.jdbc.driver.OracleDriver";

		String url = "jdbc:oracle:thin:@localhost:1521:xe";

		String sql = "DELETE FROM GOODSINFO WHERE CODE = ?";

		String code = "";
		
		String user = "micol";
		String pw = "1234";

		Connection con = null;

		PreparedStatement pstmt = null;

		try {

			Class.forName(driver);

			con = DriverManager.getConnection(url, user, pw);

			pstmt = con.prepareStatement(sql);

			System.out.println("삭제할 코드를 입력하시오");

			code = scan.next();

			pstmt.setString(1, code);

			int cnt = pstmt.executeUpdate();

			System.out.println(cnt);

		}

		catch (Exception e) {
			System.out.println(e.getMessage());
		}

		finally {

			try {

				pstmt.close();

				con.close();

			} catch (Exception e) {

			}

		}

	}

}
