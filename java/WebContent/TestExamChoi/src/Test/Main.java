package Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args){

//		UpdateServiceImpl ui = new UpdateServiceImpl();
//		ui.run();
		
		InputServiceImpl ii = new InputServiceImpl(); //문제2번
		ii.run();
		
//		DeleteServiceImpl ui = new DeleteServiceImpl(); //문제4번
//		ui.run();
		SelectServiceImpl si = new SelectServiceImpl(); //문제3번
		si.run();
	}

}
