package co.micol.professor;

import java.util.Scanner;

import co.micol.dept.DeptDao;

public class ProfessorInsert implements ProfessorInterface {
	private String PCode;
	private String PName;
	private String PTel;
	private DeptDao dao;

	public ProfessorInsert() {
		dao = new DeptDao();
	}

	@Override
	public String inputData() {
		Scanner sc = new Scanner(System.in);
		String sql;
		System.out.println("교수코드를 입력하세요.");
		PCode = sc.next();
		System.out.println("교수이름을 입력하세요.");
		PName = sc.next();
		System.out.println("교수전화번호을 입력하세요.");
		PTel = sc.next();
		sql = "insert into s_professor values('" + PCode + "','" + PName + "','" + PTel + "')";
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
