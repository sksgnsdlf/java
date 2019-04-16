package co.micol.db;

import java.sql.SQLException;
import java.util.Scanner;

public class subjecttinsert {
	private dbDto dto;
	
	private dbDto subjectinput() { 
		dto = new dbDto();
		Scanner sc = new Scanner(System.in);

		System.out.println("과목코드를 입력하세요.(3자)");
		dto.setS_code(sc.nextLine());
		System.out.println("과목명을 입력하세요.(20자)");
		dto.setS_name(sc.nextLine());
		return dto;
	}
	private int dbInput(dbDto dto) throws SQLException {
		int n;
		dbDao dao = new dbDao();
		n = dao.subjectinput(dto);
		return n;
	}
	public void inputsubject() throws SQLException {
		int n;
		dbDao dao = new dbDao();
		dto = subjectinput();
		mainstart mi = new mainstart();
		n = dbInput(dto);
		if (n != 0) {
			System.out.println("정상적으로 입력되었습니다.");
			mi.maininsert();
		} else {
			System.out.println("입력이 실패 했습니다.");
			mi.maininsert();
		}
	}
}
