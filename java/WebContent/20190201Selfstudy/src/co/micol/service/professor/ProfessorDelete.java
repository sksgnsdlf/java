package co.micol.service.professor;

import java.util.Scanner;

public class ProfessorDelete implements ProfessorInterface { //6.Delete기능도 추가
	private String pCode;
	private ProfessorDao dao;
	
	public ProfessorDelete() {
		dao = new ProfessorDao();
	}
	
	@Override
	public String inputData() {
		Scanner sc = new Scanner(System.in);
		String sql;
		System.out.println("삭제할 교수번호를 입력하세요.");
		pCode = sc.next();
		sql = " delete from s_professor where p_code = '" + pCode + "'";
		return sql;
	}

	@Override
	public void excuteQuery(String sql) {
		if(dao.delete(sql) != 0) System.out.println("정상입력");
		else System.out.println("입력실패");

	}

	@Override
	public void serviceRun() {
		String sql = inputData();
		excuteQuery(sql);
		dao.close();
	}
}
