package co.micol.controller;

import java.util.Scanner;

import co.micol.service.subject.SubjectDelete;
import co.micol.service.subject.SubjectInput;
import co.micol.service.subject.SubjectUpdate;

public class SubjectMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1.삽입 2.삭제 3.변경");
		Scanner sc = new Scanner(System.in);
		int ints = sc.nextInt();
		switch(ints) {
		case 1 : 
			SubjectInput si =new SubjectInput();
			si.serviceRun();
			break;
		case 2 :
			SubjectDelete sd = new SubjectDelete();
			sd.serviceRun();
			break;
		case 3 :
			SubjectUpdate su = new SubjectUpdate();
			su.serviceRun();
			break;
		}
	}
}
