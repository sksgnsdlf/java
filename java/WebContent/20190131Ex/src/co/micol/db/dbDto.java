package co.micol.db;

public class dbDto {
	private String student_id; //s_student , s_score ,s_attendence_master
	private String student_name;
	private String student_tel;
	private String dept_code; //s_dept
	private String s_code; // s_subject , s_score , s_lecture
	private String s_name;
	private String s_score; //s_score
	private String s_grade; 
	private String p_code; //s_professor , s_lecture
	private String p_name;
	private String p_tel;
	private String l_code; //s_lecture , s_attendence_master
	private String l_room;
	private String dept_name; //s_dept
	private String l_sub_recode; //s_attendence_master ,s_attendence
	private String a_date; //s_attendence
	private String a_check;
	public String getStudent_id() {
		return student_id;
	}
	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getStudent_tel() {
		return student_tel;
	}
	public void setStudent_tel(String student_tel) {
		this.student_tel = student_tel;
	}
	public String getDept_code() {
		return dept_code;
	}
	public void setDept_code(String dept_code) {
		this.dept_code = dept_code;
	}
	public String getS_code() {
		return s_code;
	}
	public void setS_code(String s_code) {
		this.s_code = s_code;
	}
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public String getS_score() {
		return s_score;
	}
	public void setS_score(String s_score) {
		this.s_score = s_score;
	}
	public String getS_grade() {
		return s_grade;
	}
	public void setS_grade(String s_grade) {
		this.s_grade = s_grade;
	}
	public String getP_code() {
		return p_code;
	}
	public void setP_code(String p_code) {
		this.p_code = p_code;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public String getP_tel() {
		return p_tel;
	}
	public void setP_tel(String p_tel) {
		this.p_tel = p_tel;
	}
	public String getL_code() {
		return l_code;
	}
	public void setL_code(String l_code) {
		this.l_code = l_code;
	}
	public String getL_room() {
		return l_room;
	}
	public void setL_room(String l_room) {
		this.l_room = l_room;
	}
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	public String getL_sub_recode() {
		return l_sub_recode;
	}
	public void setL_sub_recode(String l_sub_recode) {
		this.l_sub_recode = l_sub_recode;
	}
	public String getA_date() {
		return a_date;
	}
	public void setA_date(String a_date) {
		this.a_date = a_date;
	}
	public String getA_check() {
		return a_check;
	}
	public void setA_check(String a_check) {
		this.a_check = a_check;
	}
	
	public String toSting() {
		//화면에 데이터를 출력하기 위해 구성
		return null;
	}
}
