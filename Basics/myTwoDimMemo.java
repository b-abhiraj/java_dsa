package Basics;

public class myTwoDimMemo {
//
//	static int max(int a, int b) {
//		return (a > b) ? a : b;
//	}
//
//	static int lcs(String X, String Y, int m, int n) {
//		if (m == 0 || n == 0) {
//			return 0;
//		}
//		if (X.charAt(m - 1) == Y.charAt(n - 1)) {
//			return 1 + lcs(X, Y, m - 1, n - 1);
//		} else {
//			return max(lcs(X, Y, m - 1, n), lcs(X, Y, m, n - 1));
//		}
//	}
//	public static void main(String[] args) {
//		String X = "AGGTAB";
//		String Y ="GXTXAYB";
//		int m = X.length();
//		int n = Y.length();
//		System.out.println("Length of LCS is: " + lcs(X, Y, m, n));
//	}
// After Optimization

	public static int arr[][] = new int[1000][1000];

	public static int lcs(String X, String Y, int m, int n) {
		if (m == 0 || n == 0) {
			return 0;
		}
		if (arr[m - 1][n - 1] != 0) {
			return arr[m - 1][n - 1];
		}
		if (X.charAt(m - 1) == Y.charAt(n - 1)) {
			arr[m - 1][n - 1] = 1 + lcs(X, Y, n - 1, m - 1);
			return arr[m - 1][n - 1];
		} else {
			arr[m - 1][n - 1] = max(lcs(X, Y, m, n - 1), lcs(X, Y, m - 1, n));
		}
		return arr[m - 1][n - 1];
	}

	public static int max(int a, int b) {
		return (a > b) ? a : b;
	}

	public static void main(String[] args) {
		String X  = "AGGTAB";
		String Y = "GXTXAYB";
		int m = X.length();
		int n = Y.length();
		System.out.println("Length of LCS is: " + lcs(X, Y, m, n));
	}
}