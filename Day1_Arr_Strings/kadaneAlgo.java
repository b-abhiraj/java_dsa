package Day1_Arr_Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class kadaneAlgo {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(br.readLine());
		String[] input = br.readLine().trim().split("\\s+");
		int[] arr = new int[m];
		int maxSoFar = Integer.MIN_VALUE;
		int maxEndingHere = 0;
		for (int i = 0; i < input.length; i++) {
			arr[i] = Integer.parseInt(input[i]);
		}
		for (int i = 0; i < input.length; i++) {
			maxEndingHere += arr[i];
			if (maxSoFar < maxEndingHere) {
				maxSoFar = maxEndingHere;
			}
			if (maxEndingHere < 0) {
				maxEndingHere = 0;
			}
		}
	}

}
