package HackerEarth_DSA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class minCost {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] mk = br.readLine().trim().split("\\s+");
		String[] arr = br.readLine().trim().split("\\s+");
		int m = Integer.parseInt(mk[0]);
		int k = Integer.parseInt(mk[1]);
		int[] nums = new int[m];
		for (int i = 0; i < m; i++) {
			nums[i] = Integer.parseInt(arr[i]);
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < 0) {
				for (int j = Math.max(0, i - k); j < Math.min(m - 1, i + k); j++) {
					if (nums[j] > 0) {
						int temp = Math.min(-nums[i], nums[j]);
						temp += nums[i];
						temp -= nums[j];
					}
					if (nums[i] == 0)
						break;
				}
			}
		}
		long cost = 0;
		for (int num : nums) {
			cost += Math.abs(num);
		}
		System.out.println(cost);
	}

}
