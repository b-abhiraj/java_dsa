package HackerEarth_DSA;

import java.util.Scanner;

public class NonEmptySet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int m = sc.nextInt();
			int[] arr = new int[m];
			for (int p = 0; p < m; p++) {
				arr[p] = sc.nextInt();
			}
			int min = Integer.MAX_VALUE;
			for (int q = 0; q < m; q++) {
				if (arr[q] < min) {
					min = arr[q];
				}
			}
			System.out.println(min);
		}
	}
}
