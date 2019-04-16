package co.micol.db;

import java.sql.SQLException;
import java.util.Scanner;

public class mainmenu {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		System.out.println("번호를 적어주세요. (1.insert(삽입) 2.update(수정) 3.delete(삭제) 4.select(조회))");
		int sns = sn.nextInt();
		switch(sns) {
		case 1:
			mainstart mi = new mainstart();
			mi.maininsert();
			break;
		default : 
			System.out.println("없는 번호입니다. 다시 적어주세요");
			main(args);		
			break;
		}	
	}
}
