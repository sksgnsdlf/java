package co.micol.service.professor;

import java.util.Scanner;

public class ProfessorInput implements ProfessorInterface {
	//4.Scanner와 sql을 지정해주고 값이 들어갔을때는 정상으로 
	//으로 표현후 close까지 해줘야함
	private String pCode;
	private String pName;
	private String pTel;
	private ProfessorDao dao;
	
	public ProfessorInput() {
		dao = new ProfessorDao();
	}
	@Override
	public String inputData() {
		Scanner sc = new Scanner(System.in);
		String sql;
		System.out.println("교수번호를 입력하세요.");
		pCode = sc.next();
		System.out.println("교수이름을 입력하세요.");
		pName = sc.next();
		System.out.println("교수전화번호를 입력하세요.");
		pTel = sc.next();
		sql = "insert into s_professor values('" + pCode + "','" + pName +
				"','" + pTel + "')";
		return sql;
	}

	@Override
	public void excuteQuery(String sql) {
		if(dao.insert(sql) != 0) System.out.println("정상입력");
		else System.out.println("입력실패");

	}

	@Override
	public void serviceRun() {
		String sql = inputData();
		excuteQuery(sql);
		dao.close();
	}
}
