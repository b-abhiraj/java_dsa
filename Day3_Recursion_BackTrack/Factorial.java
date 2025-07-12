package Day3_Recursion_BackTrack;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
	public static BigInteger fact(int n) {
		if (n <= 1) {
			return BigInteger.ONE;
		}
		return BigInteger.valueOf(n).multiply(fact(n - 1));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(fact(sc.nextInt()));
	}
}