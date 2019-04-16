package co.micol.service.professor;

import java.util.Scanner;

public class professorUpdate implements ProfessorInterface {
	private String pCode;
	private String pName;
	private String pTel;
	private ProfessorDao dao;
	
	public professorUpdate() {
		dao = new ProfessorDao();
	}
	
	@Override
	public String inputData() {
		Scanner sc = new Scanner(System.in);
		String sql;
		System.out.println("교수번호를 입력하세요.");
		pCode = sc.next();
		System.out.println("변경할 교수이름을 입력하세요.");
		pName = sc.next();
		System.out.println("변경할 교수전화번호를 입력하세요.");
		pTel = sc.next();
		sql = " update s_professor set '"+pTel+"' where p_code = '" + pCode + "'";
				
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
