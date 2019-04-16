package co.micol.cookie;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cake cake = new Cake();
		cake.sweet();
		
		System.out.println("----------------");
		CheeseCake ca =new CheeseCake();
		ca.sweet();
		ca.sweet();
		
		System.out.println("----------------");
		Cake ca1 = new CheeseCake();
		ca1.sweet();
		
		System.out.println("----------------");
//		Cake ca2 = new StrawberryCake();
//		ca2.sweet();
		
		
		CheeseCake ca2 = new StrawberryCake();
		ca2.milky();
		ca2.sweet();
		}
}
