package co.micol.control;

import java.util.Scanner;

import co.micol.dept.DeptDelete;
import co.micol.dept.DeptInsert;
import co.micol.dept.DeptUpdate;
import co.micol.professor.ProfessorDelete;
import co.micol.professor.ProfessorInsert;

public class DeptMain {

	public static void main(String[] args) {
		System.out.println("dept -> 1.삽입 2.삭제 3.변경 / professor -> 4.삽입 5.삭제");
		Scanner sc = new Scanner(System.in);
		int ints = sc.nextInt();
		switch(ints) {
		case 1 : 
			DeptInsert si =new DeptInsert();
			si.serviceRun();
			break;
		case 2 :
			DeptDelete sd = new DeptDelete();
			sd.serviceRun();
			break;
		case 3 :
			DeptUpdate su = new DeptUpdate();
			su.serviceRun();
			break;
		case 4 :
			ProfessorInsert pi = new ProfessorInsert();
			pi.serviceRun();
			break;
		case 5 :
			ProfessorDelete pd = new ProfessorDelete();
			pd.serviceRun();
			break;
		}
	}
}
