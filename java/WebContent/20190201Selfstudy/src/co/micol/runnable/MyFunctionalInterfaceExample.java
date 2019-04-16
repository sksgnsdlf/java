package co.micol.runnable;

public class MyFunctionalInterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFunctionalInterface fi;

		fi = () -> {
			String str = "method call1";
			System.out.println(str);
		};
		fi.method();

		fi = () -> {
			System.out.println("method call2");
		};
		fi.method();

		fi = () -> System.out.println("method call3");
		fi.method();
	}
}
