package co.micol.service.subject;

import java.util.Scanner;

public class SubjectDelete implements SubjectInterface {
	private String sCode;
	private SubjectDao dao;
	
	public SubjectDelete() {
		dao = new SubjectDao();
	}
	
	@Override
	public String inputData() {
		String sql;
		Scanner sc = new Scanner(System.in);
		dao.selectAll();
		System.out.println("============");
		System.out.println("삭제할 코드를 입력하세요.");
		sCode = sc.next();
		sql = "delete from s_subject where s_code = '"
				+ sCode + "'";		
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
