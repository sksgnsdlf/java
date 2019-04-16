package co.micol.student;

public class Student {
	private String name;
	private String studentID;
	private String cellPhone;
	private String grade;
	
	public String getName() { //getter 외부에서 데이터를 가지고 갈때
		return name;// 외부에서 getName을 부르면 name을 올려줌
	}
	
	public void setName(String name) { //setter 외부로 데이터 입력받을때
		this.name = name; 
	}

	public String getStudentID() { //java오른쪽 클릭후 Source - 
								   //Generate Getters and Setter를 선택해서 만들어도댐 
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public String getCellPhone() {
		return cellPhone;
	}

	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}
	
	public String toString() {
		System.out.println("성명 : " + name);
		System.out.println("학번 : " + studentID);
		System.out.println("전화번호 : " + cellPhone);
		System.out.println(studentGrade());
		return null;
	}
	private String studentGrade() {
		grade = "A";
		return grade;
	}
}
