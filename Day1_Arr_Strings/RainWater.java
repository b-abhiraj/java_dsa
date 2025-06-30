package Day1_Arr_Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RainWater {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(br.readLine());
		String[] input = br.readLine().trim().split("\\s+");
		int[] arr = new int[m];
		for (int i = 0; i < m; i++) {
			arr[i] = Integer.parseInt(input[i]);
		}
		int left = 0, right = m - 1;
		int leftMax = 0, rightMax = 0;
		int water = 0;

		while (left < right) {
			if (arr[left] < arr[right]) {
				if (arr[left] >= leftMax) {
					leftMax = arr[left];
				} else {
					water += leftMax - arr[left];
				}
				left++;
			} else {
				if (arr[right] >= rightMax) {
					rightMax = arr[right];
				} else {
					water += rightMax - arr[right];
				}
				right--;
			}
		}
		System.out.println(water);
	}

}
