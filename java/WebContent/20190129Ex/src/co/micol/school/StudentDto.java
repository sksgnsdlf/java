package co.micol.school;

public class StudentDto { //Dto
	private String studentid;
	private String studentname;
	private String studentaddr;
	private String studenttel;
	private String deptcode;
	
	public String getStudentid() {
		return studentid;
	}
	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getStudentaddr() {
		return studentaddr;
	}
	public void setStudentaddr(String studentaddr) {
		this.studentaddr = studentaddr;
	}
	public String getStudenttel() {
		return studenttel;
	}
	public void setStudenttel(String studenttel) {
		this.studenttel = studenttel;
	}
	public String getDeptcode() {
		return deptcode;
	}
	public void setDeptcode(String deptcode) {
		this.deptcode = deptcode;
	}
	
	public String toSting() {
		//화면에 데이터를 출력하기 위해 구성
		return null;
	}
}
