package co.miclo.attendence;

public class Dto {
	public String lecture;
	public String professor;
	public String studentName;
	public String[] attendence = new String[15];
	
	public String toString() {
		System.out.print(lecture + "  " + professor + "  " + studentName + "  ");
		for(String row : attendence) {
			System.out.print(row + " ");
		}
		System.out.println();
		return null;
	}
}
