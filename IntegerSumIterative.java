public class IntegerSumIterative {

	public static void main(String[] args) {
		System.out.println(integerSum(4323));
	}

	public static int integerSum(int n) {
		int sum = 0;

		while (n > 0) {
			int add = n - (n / 10) * 10;
			sum += add;
			n /= 10;
		}
		return sum;
	}
}
