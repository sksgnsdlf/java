package co.micol.db;

import java.sql.SQLException;
import java.util.Scanner;

public class lectureinsert {
	private dbDto dto;
	private dbDto lectureinput() { 
		dto = new dbDto();
		Scanner sc = new Scanner(System.in);

		System.out.println("강의번호를 입력하세요.(5자)");
		dto.setL_code(sc.nextLine());
		System.out.println("교수번호를 입력하세요.(10자)");
		dto.setP_code(sc.nextLine());
		System.out.println("과목번호를 입력하세요.(3자)");
		dto.setS_code(sc.nextLine());
		System.out.println("강의장을 입력하세요.(3자)");
		dto.setL_room(sc.nextLine());
		return dto;
	}
	private int dbInput(dbDto dto) throws SQLException {
		int n;
		dbDao dao = new dbDao();
		n = dao.lectureinput(dto);
		return n;
	}
	public void inputlecture() throws SQLException {
		int n;
		dbDao dao = new dbDao();
		dto = lectureinput();
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
