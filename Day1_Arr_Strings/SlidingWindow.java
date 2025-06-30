package Day1_Arr_Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SlidingWindow {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] var = br.readLine().trim().split("\\s+");
		int len = Integer.parseInt(var[0]);
		int k = Integer.parseInt(var[1]);
		String[] input = br.readLine().trim().split("\\s+");
		int[] arr = new int[len];
		int maxNum = Integer.MIN_VALUE;
		for (int i = 0; i < len; i++) {
			arr[i] = Integer.parseInt(input[i]);
		}
		int sum = 0;
		for (int i = 0; i < k; i++) {
			sum += arr[i];
		}
		for (int i = k; i < len; i++) {
			sum += arr[i] - arr[i - k];
			maxNum = Math.max(sum, maxNum);
		}
		System.out.println(maxNum);
	}

}
