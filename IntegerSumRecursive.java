public class IntegerSumRecursive {

	public static void main(String[] args) {
		System.out.println(integerSum(51111));
	}

	public static int integerSum(int n) {
		if (n == 0) {
			return n;
		} else {
			int add = n - (n / 10) * 10;
			return add + integerSum(n / 10);
		}
	}
}
