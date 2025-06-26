package HackerEarth_DSA;

import java.util.Arrays;
import java.util.Scanner;

public class Min_Length {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test_cases = sc.nextInt();
		int start = 0;
		int end = 0;
		for (int i = 0; i < test_cases; i++) {

			int arrLength = sc.nextInt();
			int[] arr1 = new int[arrLength];
			int[] arr2 = new int[arrLength];
			for (int p = 0; p < arrLength; p++) {
				arr1[p] = sc.nextInt();
			}
			for (int p = 0; p < arrLength; p++) {
				arr2[p] = sc.nextInt();
			}
			for (int j = 0; j < arrLength; j++) {
				if (arr1[j] != arr2[j]) {
					start = j;
					break;
				}
			}
			for (int k = arrLength - 1; k > start; k--) {
				if (arr1[k] != arr2[k]) {
					end = k;
					break;
				}

			}
			int[] subA = Arrays.copyOfRange(arr1, start, end + 1);
			int[] subB = Arrays.copyOfRange(arr2, start, end + 1);
			Arrays.sort(subA);
			Arrays.sort(subB);
			boolean isSame = true;
			for (int o = 0; o < subA.length; o++) {
				if (subA[o] != subB[o]) {
					isSame = false;
					break;
				}
			}
			if (isSame) {
				System.out.println(end - start + 1);
			} else {
				System.out.println(arrLength);
			}
		}
	}
}