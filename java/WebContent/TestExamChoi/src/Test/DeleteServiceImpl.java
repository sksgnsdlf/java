package Test;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteServiceImpl implements TestExamInterface {
	private String sql;
	private Dao dao;
	
	@Override
	public String createSql() {
		String name = "홍길동";		
		sql = "Delete from testexam where name = '" + name +"'";
		return sql;
	}

	@Override
	public void daoCall() {
		try {
			dao = new TestExamDAO();
			int n = dao.delete(sql);
			if(n != 0)
				System.out.println("홍길동 삭제완료");
			else System.out.println("홍길동 삭제 실패");		
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
