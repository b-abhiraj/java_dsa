package Day1_Arr_Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class moveZeros {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arrLen = Integer.parseInt(br.readLine());
		String[] arrIn = br.readLine().trim().split("\\s");
		int[] arr = new int[arrIn.length];
		int count = 0;
		for (int i = 0; i < arrLen; i++) {
			int val = Integer.parseInt(arrIn[i]);
			if (val != 0) {
				arr[i - count] = val;
			} else {
				count++;
			}
		}
		for (int i = arrLen - count; i < arrLen; i++) {
			arr[i] = 0;
		}
		StringBuilder sb = new StringBuilder();
		for (int m : arr) {
			sb.append(m).append(" ");
		}
		System.out.println(sb.toString().trim());
	}

}
