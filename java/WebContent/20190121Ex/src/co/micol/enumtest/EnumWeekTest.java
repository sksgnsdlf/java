package co.micol.enumtest;

import java.util.Calendar;

public class EnumWeekTest {

	// Week today = null;
//	Calendar cal = Calendar.getInstance();
//	int week = cal.get(Calendar.DAY_OF_WEEK);
//	
	public void arraytest() {
		int array[][] = new int[5][5];
		int row, col;
		int i = 1;

		for (row = 0; row < 5; row++) {
			if (row % 2 == 0) {
				for (col = 0; col < 5; col++) {
					array[row][col] = i++;
				}
			} else {
				for (col = i-1; col >= 0; col--) {
					array[row][col] = i++;
				}	
				System.out.print(array[row][col] + " ");
			}
			
		}System.out.println();
	}
}
//		int array[][] = new int[5][5];
//		int row, col;
//		int i =1;
//		
//		for(row=0; row<5; row++) {
//			for(col=0; col<5; col++) {
//				array[row][col]=i++;
//				System.out.print(array[row][col] + " ");
//			}
//			System.out.println();
//		}
//	}
//}
//	//System.out.println(week); 오늘의 요일을 숫자로 변환
//	switch(week) {
//		case 1 : 
//			today = Week.SUNDAY;
//			break;
//		case 2 : 
//			today = Week.MONDAY;
//			break;
//		case 3 : 
//			today = Week.TUESDAY;
//			break;
//		case 4 : 
//			today = Week.WEDENSDAY;
//			break;
//		case 5 : 
//			today = Week.THURSDAY;
//			break;
//		case 6 : 
//			today = Week.FRIDAY;
//			break;
//		case 7 : 
//			today = Week.SATURDAY;
//			break;
//		}
//	System.out.println("오늘의 요일은 " + today + " 입니다.");
//	}
