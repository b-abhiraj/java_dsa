package HackerEarth_DSA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Permutations {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] intital_values = br.readLine().trim().split("\\s+");
		int m = Integer.parseInt(intital_values[0]);
		int n = Integer.parseInt(intital_values[1]);
		String[] arr_values = br.readLine().trim().split("\\s+");
		int[] arr = new int[m];
		for (int i = 0; i < m; i++) {
			arr[i] = Integer.parseInt(arr_values[i]);
		}
		for (int i = 0; i < n; i++) {
			String[] test_case_nums = br.readLine().trim().split("\\s+");
			int p = Integer.parseInt(test_case_nums[0]) - 1;
			int q = Integer.parseInt(test_case_nums[1]) - 1;

			int max = Integer.MIN_VALUE;
			for (int j = 0; j < p; j++) {
				if (arr[j] > max) {
					max = arr[j];
				}
			}
			for (int j = q + 1; j < m; j++) {
				if (arr[j] > max) {
					max = arr[j];
				}
			}
			System.out.println(max);
		}
	}
}