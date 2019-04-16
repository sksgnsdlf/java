package co.micol.inheritanceEntity;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child();
		child.crun(); //순수한 자식
		System.out.println("==========");
		child.run(); //부모로 상속받은거
		child.money = 10000; //부모로 상속받은거
		System.out.println(child.money);
	}
}
