package co.micol.student;

public class StudentProcess {
	private String studentID;
	private String name;
	private int korHistory;
	private int philosophy;
	
	public void setStduentID(String stduentID) {
		this.studentID = stduentID;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setKorHistory(int korHistory) {
		this.korHistory = korHistory;
	}
	public void setPhilosophy(int philosophy) {
		this.philosophy = philosophy;
	}
	
	private int subjectSum() {
		return korHistory+philosophy;
	}
	
	private float subjectArg() {
		float arg = (float)subjectSum() / 2;
		return arg;
	}
	
	private String subjectgrade() {
		float g = subjectArg();
		int sw = (int) g/10;
		String grade;
		
		switch(sw) {
			case 10:
			case 9: grade = "A"; break;
			case 8: grade = "B"; break;
			case 7: grade = "C"; break;
			case 6: grade = "D"; break;
			default : grade = "F";
		}
		return grade;
	}
	
	public String toString() {
		System.out.println("성명 : 학   번 : 한국사 : 철학 : 총점 : 평균 : 등급 ");
		System.out.println(name + " : " + studentID + " : " + korHistory + " : " 
		+ philosophy + " : " + subjectSum() + " : " + subjectArg() + " : " 
		+ subjectgrade() + " : " );
		return null;
	}
}
