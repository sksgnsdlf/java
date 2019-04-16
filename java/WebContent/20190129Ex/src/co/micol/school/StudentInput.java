package co.micol.school;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentInput { // 입력클래스
	private StudentDto dto;

	private StudentDto studentinput() { // 생성자아님 , 메소드임(대소문자구분)
		dto = new StudentDto();
		Scanner sc = new Scanner(System.in);

		System.out.println("학번을 입력하세요.");
		dto.setStudentid(sc.nextLine());
		System.out.println("성명을 입력하세요.");
		dto.setStudentname(sc.nextLine());
		System.out.println("주소를 입력하세요.");
		dto.setStudentaddr(sc.nextLine());
		System.out.println("전화번호를 입력하세요.");
		dto.setStudenttel(sc.nextLine());
		System.out.println("학과코드를 입력하세요.");
		dto.setDeptcode(sc.nextLine());
		return dto;
	}

	private int dbInput(StudentDto dto) throws SQLException {
		int n;
		SchoolDao dao = new SchoolDao();
		n = dao.input(dto);
		return n;
	}

	private void displayStudent(ResultSet rs) {
		try {
			while (rs.next()) {
				System.out.print(rs.getString("studentid")+ "   ");
				System.out.print(rs.getString("studentname")+ "   ");
				System.out.print(rs.getString("studentaddr")+ "   ");
				System.out.print(rs.getString("studenttel")+ "   ");
				System.out.print(rs.getString("deptcode"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void inputStudent() throws SQLException {
		int n;
		SchoolDao dao = new SchoolDao();
		dto = studentinput();
		n = dbInput(dto);
		if (n != 0) {
			System.out.println("정상적으로 입력되었습니다.");
			displayStudent(dao.select());
		} else {
			System.out.println("입력이 실패 했습니다.");
		}
	}
}
