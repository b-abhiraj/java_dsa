package Basics;

import java.util.Scanner;

public class MyMemo2 {

	static long[] term = new long[10000];

	static long fib(int n) {
		if (n <= 1) {
			return n;
		}
		if (term[n] != 0) {
			return term[n];
		} else {
			term[n] = fib(n - 2) + fib(n - 1);
			return term[n];
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(fib(sc.nextInt()));
	}
}