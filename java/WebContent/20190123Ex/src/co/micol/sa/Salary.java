package co.micol.sa;

public class Salary {
	public int nomal;
	public int extraPay;
	private int num;
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int pay() {
		return nomal + extraPay;
	}
}
