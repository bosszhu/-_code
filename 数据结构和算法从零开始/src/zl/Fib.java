package zl;

public class Fib {

	public int fib1(int n) {
		if (n<=1) {
			return n;
		}
		return fib1(n - 1) + fib1(n - 2);
	}

	public int fib2(int n) {
		if (n<=1) {
			return n;
		}
		int first = 0;
		int second = 1;
		for (int i = 0; i < n - 1; i++) {
			int sum = first + second;
			first = second;
			second = sum;
		}
		return second;
	}
	
	public int fib3(int n) {
		if (n<=1) {
			return n;
		}
		int first = 0;
		int second = 1;
		while ((n--) - 1 > 0) {
			second = first + second;
			first = second -first;
		}
		return second;
	}
}
