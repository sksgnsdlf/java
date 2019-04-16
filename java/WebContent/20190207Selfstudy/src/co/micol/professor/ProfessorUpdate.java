package co.micol.professor;

import java.util.Scanner;

import co.micol.dept.DeptDao;

public class ProfessorUpdate implements ProfessorInterface {
	private String deptCode;
	private String deptName;
	private DeptDao dao;
	
	public ProfessorUpdate() {
		dao = new DeptDao();
	}
	@Override
	public String inputData() {
		String sql;
		Scanner sc = new Scanner(System.in);
		dao.selectAll();
		System.out.println("============");
		System.out.println("참조할 코드번호를 적어주세요.");		 
		deptCode = sc.next();
		System.out.println("변경할 학과이름을 입력하세요.");
		deptName = sc.next();
		sql = "update s_dept set dept_Name = '" + deptName + "' where dept_code = '"
				+ deptCode + "'";		
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