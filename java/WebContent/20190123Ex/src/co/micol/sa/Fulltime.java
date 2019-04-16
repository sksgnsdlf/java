package co.micol.sa;

public class Fulltime extends Salary{
	public String name;
	public int bonus;

	public int pay() {
		return nomal + extraPay + bonus;
	}
}
