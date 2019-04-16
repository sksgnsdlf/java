package co.micol.dept;

import java.util.Scanner;

public class DeptDelete implements DeptInterface {
	private String deptcode;
	private DeptDao dao;
	
	public DeptDelete() {
		dao = new DeptDao();
	}
	
	@Override
	public String inputData() {
		String sql;
		Scanner sc = new Scanner(System.in);
		dao.selectAll();
		System.out.println("============");
		System.out.println("삭제할 학과코드를 입력하세요.");
		deptcode = sc.next();
		sql = "delete from s_dept where dept_code = '"
				+ deptcode + "'";		
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
