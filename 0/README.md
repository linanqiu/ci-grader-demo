# Homework 0

The purpose of this homework is to make sure that you're cool with Xavier (the homework submission system) and to clean the rust on your Java chops.

## Problem 1: Fibonacci

Submit: `FibonacciRecursive.java`

In this repository, you'll find `FibonacciIterative.java`. This program finds the n-th number in the Fibonacci sequence. To recap, the Fibonacci sequence is

```
1 1 2 3 5 8 13 21 ...
```

(Note that we start with 1, not 0). `FibonacciIterative.java` is an iterative implementation -- it uses a for loop.

Your job is to write a **recursive** implementation by rewriting the contents of `public static int fibonacci(int n)` in `FibonacciRecursive.java`. In other words, your solution (in `FibonacciRecursive.java`) should look like

```java
public class FibonacciRecursive {

    public static void main(String[] args) {
        System.out.println(fibonacci(5));
    }

    public static int fibonacci(int n) {
        // answer goes here
    }
}
```

## Problem 2: Integer Sum

Submit: `IntegerSumIterative.java`

An integer sum is the sum of each of the integers in a number. For example, the integer sum of `4323` is `4 + 3 + 2 + 3 = 12`. `IntegerRecursive.java` contains a recursive implementation of this solution.

You should write a **iterative** implementation by rewriting the contents of `public static int integerSum(int n)` in `IntegerSumRecursive.java`. Your solution in `IntegerSumIterative.java` should look like

```java
public class IntegerSumIterative {

    public static void main(String[] args) {
        System.out.println(integerSum(4323));
    }

    public static int integerSum(int n) {
        // answer goes here
    }
}
```

**In a comment in your code, explain why the iterative solution is better than the recursive solution**
