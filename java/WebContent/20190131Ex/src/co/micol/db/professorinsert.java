package co.micol.db;

import java.sql.SQLException;
import java.util.Scanner;

public class professorinsert {
	private dbDto dto;
	
	private dbDto professorinput() { 
		dto = new dbDto();
		Scanner sc = new Scanner(System.in);

		System.out.println("교수코드를 입력하세요.(10자)");
		dto.setP_code(sc.nextLine());
		System.out.println("교수이름을 입력하세요.(20자)");
		dto.setP_name(sc.nextLine());
		System.out.println("교수전화번호를 입력하세요.(13자)");
		dto.setP_tel(sc.nextLine());
		return dto;
	}
	private int dbInput(dbDto dto) throws SQLException {
		int n;
		dbDao dao = new dbDao();
		n = dao.professorinput(dto);
		return n;
	}
	public void inputprofessor() throws SQLException {
		int n;
		dbDao dao = new dbDao();
		dto = professorinput();
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
