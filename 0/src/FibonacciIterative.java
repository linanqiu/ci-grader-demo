public class FibonacciIterative {

	public static void main(String[] args) {
		System.out.println(fibonacci(5));
	}

	public static int fibonacci(int n) {
		if (n < 0) {
			return 0;
		}

		if (n == 0) {
			return 0;
		}

		if (n == 1) {
			return 1;
		}

		// first 2 fibonacci numbers
		int num1 = 1;
		int num2 = 1;

		int fibonacci = 0;

		for (int i = 0; i < n - 2; i++) {
			fibonacci = num1 + num2;
			num1 = num2;
			num2 = fibonacci;
		}

		return fibonacci;
	}
}
