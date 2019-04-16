package co.micol.db;

import java.sql.SQLException;
import java.util.Scanner;

public class scoreinsert {
	private dbDto dto;
	private dbDto scoreinput() { 
		dto = new dbDto();
		Scanner sc = new Scanner(System.in);

		System.out.println("학생번호을 입력하세요.(10자)");
		dto.setStudent_id(sc.nextLine());
		System.out.println("과목코드를 입력하세요.(3자)");
		dto.setS_code(sc.nextLine());
		System.out.println("성적을 입력하세요.(3자)");
		dto.setS_score(sc.nextLine());
		System.out.println("등급을 입력하세요.(1자)");
		dto.setS_grade(sc.nextLine());
		return dto;
	}
	private int dbInput(dbDto dto) throws SQLException {
		int n;
		dbDao dao = new dbDao();
		n = dao.scoreinput(dto);
		return n;
	}
	public void inputscore() throws SQLException {
		int n;
		dbDao dao = new dbDao();
		dto = scoreinput();
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
