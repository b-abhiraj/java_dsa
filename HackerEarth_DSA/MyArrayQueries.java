package HackerEarth_DSA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyArrayQueries {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCaseNum = Integer.parseInt(br.readLine());
		for (int o = 0; o < testCaseNum; o++) {
			String[] arr1 = br.readLine().trim().split("\\s+");
			String[] arr2 = br.readLine().trim().split("\\s+");
			int test_queries = Integer.parseInt(br.readLine());
			String[] test1 = br.readLine().trim().split("\\s+");
			int[] arrA = new int[arr1.length];
			int[] arrB = new int[arr1.length];
			int[] test_nums = new int[test_queries];
			for (int i = 0; i < arrA.length; i++) {
				arrA[i] = Integer.parseInt(arr1[i]);
			}
			for (int i = 0; i < arrB.length; i++) {
				arrB[i] = Integer.parseInt(arr2[i]);
			}
			for (int i = 0; i < test_queries; i++) {
				test_nums[i] = Integer.parseInt(test1[i]);
			}
		}
	}
}