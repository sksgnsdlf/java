package co.micol.db;

import java.sql.SQLException;
import java.util.Scanner;

public class attendenceMasterinsert {
	private dbDto dto;
	
	private dbDto attendenceMaster() { 
		dto = new dbDto();
		Scanner sc = new Scanner(System.in);

		System.out.println("강의코드를 입력하세요.(5자)");
		dto.setL_code(sc.nextLine());
		System.out.println("학생번호을 입력하세요.(10자)");
		dto.setStudent_id(sc.nextLine());
		System.out.println("재수강번호를 입력하세요.(3자)");
		dto.setL_sub_recode(sc.nextLine());
		return dto;
	}
	private int dbInput(dbDto dto) throws SQLException {
		int n;
		dbDao dao = new dbDao();
		n = dao.attendenceMasterinput(dto);
		return n;
	}
	public void attendenceMasterdence() throws SQLException {
		int n;
		dbDao dao = new dbDao();
		dto = attendenceMaster();
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
