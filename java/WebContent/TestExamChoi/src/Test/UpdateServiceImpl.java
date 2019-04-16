
package Test;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateServiceImpl implements TestExamInterface {
	private String sql;
	private Dao dao;
	
	@Override
	public String createSql() {
		Scanner sn = new Scanner(System.in);
		System.out.println("변경할 직급을 적으세요.");
		String position = sn.next();
		System.out.println("참조할 이름을 적으세요.");
		String name = sn.next();
		sql = "update testexam set position='" + position + "'where name='"
				+ name + "'";	
		return sql;
	}

	@Override
	public void daoCall() {
		try {
			dao = new TestExamDAO();
			int n = dao.update(sql);
			if(n != 0)
				System.out.println("이름 변경완료");
			else System.out.println("이름 변경실패");		
		} catch (ClassNotFoundException | IOException | SQLException e) {
			// TODO Auto-generated catch block
		} 
	}

	@Override
	public void run() {
		createSql();
		daoCall();
	}

}
