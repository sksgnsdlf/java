package co.miclo.attendence;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, FileNotFoundException, IOException, SQLException {
		// TODO Auto-generated method stub
//		AttendenceDatainput AD = new AttendenceDatainput();
//		AD.run();
//		AttendenceSearch as = new AttendenceSearch();
//		as.run();
		AttendenceDataDelete ad = new AttendenceDataDelete();
		ad.run();
//		AttendenceDataUpdate au = new AttendenceDataUpdate();
//		au.run();
		
	}

}
