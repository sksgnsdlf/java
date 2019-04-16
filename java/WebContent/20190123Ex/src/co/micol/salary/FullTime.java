package co.micol.salary;

public class FullTime extends Salary {
	public String name;
	public int bouns;
	
	public int payF() {
		return nomal + extraPay + bouns; 
	}
}
