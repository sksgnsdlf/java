package Test;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class InputServiceImpl implements TestExamInterface {
	private String sql;
	private Dao dao;
	
	@Override
	public String createSql() {
		System.out.println("Insert할 값을 넣어라");
		Scanner sn = new Scanner(System.in);
		System.out.println("번호를 적어라");
		int number = sn.nextInt();
		System.out.println("사번을 적어라");
		String registerid = sn.next();
		System.out.println("성명을 적어라");
		String name = sn.next();
		System.out.println("부서를 적어라");
		String dept = sn.next();
		System.out.println("직위를 적어라");
		String position = sn.next();
		
		sql = "Insert into testexam values(" + number + ",'" + registerid + "','" + name + "','" + dept + "','" + position + "')";
		
		return sql;
	}

	@Override
	public void daoCall() {
		try {
			dao = new TestExamDAO();
			int n = dao.insert(sql);
			if(n != 0)
				System.out.println("정상 입력");
			else System.out.println("입력 실패");		
		} catch (ClassNotFoundException | IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	

	}

	@Override
	public void run() {
		createSql();
		daoCall();
	}
}
