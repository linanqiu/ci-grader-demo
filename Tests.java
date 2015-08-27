import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class Tests {

	public static String CLASS_NAME = "cs3134";
	public static String HOMEWORK_NAME = "hw1";
	public static int STUDENT_MAX = 100;
	public static int TIME_LIMIT_SECONDS = 5;

	public static ScoreSheet runTests(ScoreSheet scoreSheet) {
		scoreSheet.className = CLASS_NAME;
		scoreSheet.homeworkName = HOMEWORK_NAME;
		scoreSheet.studentMax = STUDENT_MAX;
		int timeLimitSeconds = TIME_LIMIT_SECONDS;

		Callable<ScoreSheet> tests = new Callable<ScoreSheet>() {
			@Override
			public ScoreSheet call() throws Exception {
				return tests(scoreSheet);
			}
		};

		ExecutorService executor = Executors.newSingleThreadExecutor();
		Future<ScoreSheet> future = executor.submit(tests);
		executor.shutdown();

		try {
			future.get(timeLimitSeconds, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			scoreSheet.errorMessage = "Timed out";
			System.out.println(scoreSheet.toJSONString());
			System.exit(1);
		} catch (ExecutionException e) {
			scoreSheet.errorMessage = "Timed out";
			System.out.println(scoreSheet.toJSONString());
			System.exit(1);
		} catch (TimeoutException e) {
			scoreSheet.errorMessage = "Timed out";
			System.out.println(scoreSheet.toJSONString());
			System.exit(1);
		}

		if (!executor.isTerminated()) {
			executor.shutdownNow();
		}

		System.out.println(scoreSheet.toJSONString());

		return scoreSheet;
	}

	/**
	 * Graders, you should only edit this. No more.
	 * 
	 * @param scoreSheet
	 * @return
	 */
	private static ScoreSheet tests(ScoreSheet scoreSheet) {
		// FibonacciRecursive
		String sectionFibonacci0 = "Fibonacci: fibonacci(0)";
		try {
			if (FibonacciRecursive.fibonacci(0) == 0) {
				scoreSheet.addSection(sectionFibonacci0, 10, 10, "");
			} else {
				scoreSheet.addSection(sectionFibonacci0, 0, 10,
						"Incorrect output");
			}
		} catch (Exception e) {
			scoreSheet.addSection(sectionFibonacci0, 0, 10,
					"Exception encountered");
		}

		String sectionFibonacci1 = "Fibonacci: fibonacci(1)";
		try {
			if (FibonacciRecursive.fibonacci(1) == 1) {
				scoreSheet.addSection(sectionFibonacci1, 10, 10, "");
			} else {
				scoreSheet.addSection(sectionFibonacci1, 0, 10,
						"Incorrect output");
			}
		} catch (Exception e) {
			scoreSheet.addSection(sectionFibonacci1, 0, 10,
					"Exception encountered");
		}

		String sectionFibonacci5 = "Fibonacci: fibonacci(5)";
		try {
			if (FibonacciRecursive.fibonacci(5) == 5) {
				scoreSheet.addSection(sectionFibonacci5, 10, 10, "");
			} else {
				scoreSheet.addSection(sectionFibonacci5, 0, 10,
						"Incorrect output");
			}
		} catch (Exception e) {
			scoreSheet.addSection(sectionFibonacci5, 0, 10,
					"Exception encountered");
		}

		String sectionFibonacci10 = "Fibonacci: fibonacci(10)";
		try {
			if (FibonacciRecursive.fibonacci(10) == 55) {
				scoreSheet.addSection(sectionFibonacci10, 10, 10, "");
			} else {
				scoreSheet.addSection(sectionFibonacci10, 0, 10,
						"Incorrect output");
			}
		} catch (Exception e) {
			scoreSheet.addSection(sectionFibonacci10, 0, 10,
					"Exception encountered");
		}

		String sectionFibonacciN1 = "Fibonacci: fibonacci(-1)";
		try {
			if (FibonacciRecursive.fibonacci(-1) == 0) {
				scoreSheet.addSection(sectionFibonacciN1, 10, 10, "");
			} else {
				scoreSheet.addSection(sectionFibonacciN1, 0, 10,
						"Incorrect output");
			}
		} catch (Exception e) {
			scoreSheet.addSection(sectionFibonacciN1, 0, 10,
					"Exception encountered");
		}

		String sectionInteger1234 = "IntegerSum: integerSum(1234)";
		try {
			if (IntegerSumIterative.integerSum(1234) == 10) {
				scoreSheet.addSection(sectionInteger1234, 10, 10, "");
			} else {
				scoreSheet.addSection(sectionInteger1234, 0, 10,
						"Incorrect output");
			}
		} catch (Exception e) {
			scoreSheet.addSection(sectionInteger1234, 0, 10,
					"Exception encountered");
		}

		String sectionInteger123456789 = "IntegerSum: integerSum(123456789)";
		try {
			if (IntegerSumIterative.integerSum(123456789) == 45) {
				scoreSheet.addSection(sectionInteger123456789, 10, 10, "");
			} else {
				scoreSheet.addSection(sectionInteger123456789, 0, 10,
						"Incorrect output");
			}
		} catch (Exception e) {
			scoreSheet.addSection(sectionInteger123456789, 0, 10,
					"Exception encountered");
		}

		String sectionInteger5748 = "IntegerSum: integerSum(5748)";
		try {
			if (IntegerSumIterative.integerSum(5748) == 24) {
				scoreSheet.addSection(sectionInteger5748, 10, 10, "");
			} else {
				scoreSheet.addSection(sectionInteger5748, 0, 10,
						"Incorrect output");
			}
		} catch (Exception e) {
			scoreSheet.addSection(sectionInteger5748, 0, 10,
					"Exception encountered");
		}

		String sectionInteger1 = "IntegerSum: integerSum(1)";
		try {
			if (IntegerSumIterative.integerSum(1) == 1) {
				scoreSheet.addSection(sectionInteger1, 10, 10, "");
			} else {
				scoreSheet.addSection(sectionInteger1, 0, 10,
						"Incorrect output");
			}
		} catch (Exception e) {
			scoreSheet.addSection(sectionInteger1, 0, 10,
					"Exception encountered");
		}

		String sectionInteger0 = "IntegerSum: integerSum(0)";
		try {
			if (IntegerSumIterative.integerSum(0) == 0) {
				scoreSheet.addSection(sectionInteger0, 10, 10, "");
			} else {
				scoreSheet.addSection(sectionInteger0, 0, 10,
						"Incorrect output");
			}
		} catch (Exception e) {
			scoreSheet.addSection(sectionInteger0, 0, 10,
					"Exception encountered");
		}

		return scoreSheet;
	}
}
