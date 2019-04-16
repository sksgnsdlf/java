package co.micol.dao;

import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		StudentDao dao = new StudentDao();
//		dao.select();
//		dao.insert();
//		dao.update();
		dao.delete();
		dao.close(); //connection 인스턴스를 닫아준다.
	}
}

