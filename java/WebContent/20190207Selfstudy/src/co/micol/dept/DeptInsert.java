package co.micol.dept;

import java.util.Scanner;

public class DeptInsert implements DeptInterface {
	private String DeptCode;
	private String DeptName;
	private DeptDao dao;

	public DeptInsert() {
		dao = new DeptDao();
	}

	@Override
	public String inputData() {
		Scanner sc = new Scanner(System.in);
		String sql;
		System.out.println("학과번호를 입력하세요.");
		DeptCode = sc.next();
		System.out.println("학과이름을 입력하세요.");
		DeptName = sc.next();
		sql = "insert into s_dept values('" + DeptCode + "','" + DeptName + "')";
		return sql;
	}

	@Override
	public void excuteQuery(String sql) {
		if (dao.insert(sql) != 0)
			System.out.println("정상입력");
		else
			System.out.println("입력실패");

	}

	@Override
	public void serviceRun() {
		String sql = inputData();
		excuteQuery(sql);
		dao.close();
	}
}
