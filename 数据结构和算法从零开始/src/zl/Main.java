package zl;

public class Main {
	public static void main(String[] args) {
		testfib();
	}

	static void testfib() {
		Fib fib = new Fib();
		int num1 = fib.fib1(10);
		int num2 = fib.fib2(10);
		int num3 = fib.fib3(10);
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
	}
}
