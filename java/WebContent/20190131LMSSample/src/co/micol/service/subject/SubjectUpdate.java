package co.micol.service.subject;

import java.util.Scanner;

public class SubjectUpdate implements SubjectInterface {
	private String sCode;
	private String sName;
	private SubjectDao dao;
	
	public SubjectUpdate() {
		dao = new SubjectDao();
	}
	@Override
	public String inputData() {
		String sql;
		Scanner sc = new Scanner(System.in);
		dao.selectAll();
		System.out.println("============");
		System.out.println("참조할 코드번호를 적어주세요.");		 
		sCode = sc.next();
		System.out.println("변경할 학과이름을 입력하세요.");
		sName = sc.next();
		sql = "update s_subject set s_Name = '" + sName + "' where s_code = '"
				+ sCode + "'";		
		return sql;
	}

	@Override
	public void excuteQuery(String sql) {
		if(dao.update(sql) != 0) System.out.println("정상변경");
		else System.out.println("변경실패");
		dao.selectAll();
	}

	@Override
	public void serviceRun() {
		String sql = inputData();
		excuteQuery(sql);
		dao.close();
	}
}
