package co.micol.professor;

import java.util.Scanner;

import co.micol.dept.DeptDao;

public class ProfessorDelete implements ProfessorInterface {
	private String Pcode;
	private ProfessorDao dao;
	
	public ProfessorDelete() {
		dao = new ProfessorDao();
	}
	
	@Override
	public String inputData() {
		String sql;
		Scanner sc = new Scanner(System.in);
		dao.selectAll();
		System.out.println("============");
		System.out.println("삭제할 교수코드를 입력하세요.");
		Pcode = sc.next();
		sql = "delete from s_professor where P_code = '"
				+ Pcode + "'";		
		return sql;
	}

	@Override
	public void excuteQuery(String sql) {
		if(dao.delete(sql) != 0) System.out.println("정상삭제");
		else System.out.println("삭제실패");
		dao.selectAll();
	}

	@Override
	public void serviceRun() {
		String sql = inputData();
		excuteQuery(sql);
		dao.close();
	}
}

