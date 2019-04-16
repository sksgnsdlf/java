package co.micol.control;

import co.micol.service.professor.ProfessorDelete;
import co.micol.service.professor.ProfessorInput;

public class ProfessorMain { //5.Main 실행

	public static void main(String[] args) {
//		ProfessorInput PI = new ProfessorInput();
//		PI.serviceRun();
		ProfessorDelete PD = new ProfessorDelete();
		PD.serviceRun();
	}

}
