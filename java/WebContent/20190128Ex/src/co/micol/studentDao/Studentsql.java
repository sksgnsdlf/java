package co.micol.studentDao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Studentsql {
	String sql;
	Scanner sc = new Scanner(System.in);
	
	private int sqlStatement() throws ClassNotFoundException, SQLException {
		System.out.println("작업할 번호를 입력하세요.(1 ~ 4)");
		int sw = sc.nextInt();
		
		switch(sw) { //sql 생성하는 곳
			case 1:
				sql = "select * form student";
			break;
			case 2:
				sql = "select studentid, studentname from student";
			break;
			case 3:
				sql = "select * from student where studentid = '201901001'";
			break;
			case 4: 
				sql = "select studentid, studentname, studentaddr, studenttel, deptname " + 
						"from student s, dept d " + 
						"where s.deptcode = d.deptcode";
				break;	
			default :
				System.out.println("질의어가 존재하지 않습니다.");
		}	
//		daocall(sql,sw); //밑에 daocall을 불러서 사용함
		return sw;
	}
	
	private void daocall(String sql,int sw) throws ClassNotFoundException, SQLException {
		StudentDao dao = new StudentDao();
		ResultSet rs = dao.select(sql);
		
		System.out.println("학번 \t\t 성명 \t 주소 \t\t 전화번호 \t\t 학과");
		while(rs.next()) {
			System.out.print(rs.getString("studentid") + "  	 ");
			if( sw == 2 ) {
				System.out.println(rs.getString("studentname") + "  	 ");
				continue;
			}
			System.out.print(rs.getString("studentname") + "  	 ");
			System.out.print(rs.getString("studentaddr") + "  	 ");
			System.out.print(rs.getString("studenttel") + "    ");
			System.out.println(rs.getString("deptname"));
		}
		dao.close(); //dao 인스턴스를 닫아준다.
	}
	//캡슐화(위에꺼는 모조리 private으로 바꾸면 밖에서 확인불가능
	//그리고 밑에처럼 메소드하나 만들고 여기서 실행만 해주면 private정보노출없이 사용가능함
	public void sqlCabsultion() throws ClassNotFoundException, SQLException {
		int sw = sqlStatement();
		daocall(sql,sw);
	}
}
