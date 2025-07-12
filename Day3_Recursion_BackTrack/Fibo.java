package Day3_Recursion_BackTrack;

import java.util.Scanner;

public class Fibo {

	public static int nthFibo(int n) {
		if (n <= 1) {
			return n;
		}
		return nthFibo(n - 2) + nthFibo(n - 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = nthFibo(n);
		System.out.println(result);
	}

}
