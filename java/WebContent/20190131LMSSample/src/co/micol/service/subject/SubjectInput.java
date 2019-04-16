package co.micol.service.subject;

import java.util.Scanner;

public class SubjectInput implements SubjectInterface {
	private String sCode;
	private String sName;
	private SubjectDao dao;
	
	public SubjectInput() {
		dao = new SubjectDao();
	}
	@Override
	public String inputData() {
		Scanner sc = new Scanner(System.in); //키보드로 부터 입력을 받는다.
		String sql;
		dao.selectAll(); //테이블 전체내용보기
		System.out.println("과목코드를 입력하세요.");
		sCode = sc.next();
		System.out.println("과목명을 입력하세요.");
		sName = sc.next();
		sql = "insert into s_subject values('" + sCode + "','" + sName + "')";
		return sql;
	}

	@Override
	public void excuteQuery(String sql) {
		if(dao.insert(sql) != 0) System.out.println("정상입력");
		else System.out.println("입력실패");
		dao.selectAll();

	}

	@Override
	public void serviceRun() {
		String sql = inputData();
		excuteQuery(sql);
		dao.close();
	}
}
