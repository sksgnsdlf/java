package co.micol.arraylist;

import java.util.Date;

public class MemberDto {
	private int memberNum;
	private String memberId;
	private String memberPw;
	private String memberName;
	private String memberTel;
	private String memberAddr;
	private Date registerDay;
	private Date secessionDay;
	
	public int getMemberNum() {
		return memberNum;
	}
	public void setMemberNum(int memberNum) {
		this.memberNum = memberNum;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberPw() {
		return memberPw;
	}
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberTel() {
		return memberTel;
	}
	public void setMemberTel(String memberTel) {
		this.memberTel = memberTel;
	}
	public String getMemberAddr() {
		return memberAddr;
	}
	public void setMemberAddr(String memberAddr) {
		this.memberAddr = memberAddr;
	}
	public Date getRegisterDay() {
		return registerDay;
	}
	public void setRegisterDay(Date registerDay) {
		this.registerDay = registerDay;
	}
	public Date getSecessionDay() {
		return secessionDay;
	}
	public void setSecessionDay(Date secessionDay) {
		this.secessionDay = secessionDay;
	}
	
	public String toString() {
		System.out.println(memberNum + " " + memberId + " " +
				memberName + " " + memberTel + " " + memberAddr + " " + 
				registerDay + " " + secessionDay + " " + memberPw);
		return null;
	}
}
