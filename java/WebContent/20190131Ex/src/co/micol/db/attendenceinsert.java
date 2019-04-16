package co.micol.db;

import java.sql.SQLException;
import java.util.Scanner;

public class attendenceinsert {
	private dbDto dto;
	
	private dbDto attendenceinput() { 
		dto = new dbDto();
		Scanner sc = new Scanner(System.in);

		System.out.println("재수강번호를 입력하세요.(3자)");
		dto.setL_sub_recode(sc.nextLine());
		System.out.println("출석일자을 입력하세요.(8자)");
		dto.setA_date(sc.nextLine());
		System.out.println("출석여부를 입력하세요.(1자)");
		dto.setA_check(sc.nextLine());
		return dto;
	}
	private int dbInput(dbDto dto) throws SQLException {
		int n;
		dbDao dao = new dbDao();
		n = dao.attendenceinput(dto);
		return n;
	}
	public void inputattendence() throws SQLException {
		int n;
		dbDao dao = new dbDao();
		dto = attendenceinput();
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
