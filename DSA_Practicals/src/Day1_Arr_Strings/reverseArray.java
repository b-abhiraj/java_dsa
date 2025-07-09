package Day1_Arr_Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class reverseArray {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arrLength = Integer.parseInt(br.readLine());
		String[] arrIn = br.readLine().trim().split("\\s+");
		int[] arr = new int[arrLength];
		for (int i = 0; i < arrLength; i++) {
			arr[arrLength - i - 1] = Integer.parseInt(arrIn[i]);
		}
		for (Integer v : arr) {
			System.out.print(v + " ");
		}
	}

}
