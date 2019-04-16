package co.micol.db;

import java.sql.SQLException;
import java.util.Scanner;

public class deptinsert {
	private dbDto dto;
	
	private dbDto deptinput() { 
		dto = new dbDto();
		Scanner sc = new Scanner(System.in);

		System.out.println("학과코드를 입력하세요.(3자)");
		dto.setDept_code(sc.nextLine());
		System.out.println("학과명을 입력하세요.(20자)");
		dto.setDept_name(sc.nextLine());
		return dto;
	}
	private int dbInput(dbDto dto) throws SQLException {
		int n;
		dbDao dao = new dbDao();
		n = dao.deptinput(dto);
		return n;
	}
	public void inputdept() throws SQLException {
		int n;
		dbDao dao = new dbDao();
		dto = deptinput();
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
