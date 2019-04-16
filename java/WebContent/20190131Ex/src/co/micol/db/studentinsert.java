package co.micol.db;

import java.sql.SQLException;
import java.util.Scanner;

import co.micol.db.dbDto;
import co.micol.db.dbDao;

public class studentinsert {
	private dbDto dto;
	
	
	private dbDto studentinput() { 
		dto = new dbDto();
		Scanner sc = new Scanner(System.in);

		System.out.println("학생번호를 입력하세요.(숫자10자)");
		dto.setStudent_id(sc.nextLine());
		System.out.println("성명을 입력하세요.(한글6자)");
		dto.setStudent_name(sc.nextLine());
		System.out.println("전화번호를 입력하세요.(숫자,- 13자)");
		dto.setStudent_tel(sc.nextLine());
		System.out.println("학과코드를 입력하세요.(숫자3자)");
		dto.setDept_code(sc.nextLine());
		return dto;
	}
	private int dbInput(dbDto dto) throws SQLException {
		int n;
		dbDao dao = new dbDao();
		n = dao.Studentinput(dto);
		return n;
	}
	public void inputStudent() throws SQLException {
		int n;
		dbDao dao = new dbDao();
		dto = studentinput();
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
