package Day3_Recursion_BackTrack;

import java.math.BigInteger;
import java.util.Scanner;

public class Sum_Of_Digit {
	public static BigInteger digitSum(BigInteger n) {
		if (n.compareTo(BigInteger.ZERO) <= 0) {
			return BigInteger.ZERO;
		}
		BigInteger m = n.mod(BigInteger.TEN);
		BigInteger o = n.divide(BigInteger.TEN);
		return m.add(digitSum(o));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(digitSum(sc.nextBigInteger()));
		sc.close();
	}
}