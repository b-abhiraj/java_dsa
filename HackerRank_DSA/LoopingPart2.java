package HackerRank_DSA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LoopingPart2 {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test_cases = Integer.parseInt(br.readLine().trim());
		StringBuilder sb = new StringBuilder();
		int num1,num2,num3,count;
		while (test_cases-- > 0) {
			String[] arr = br.readLine().trim().split("\\s+");
			num1 = Integer.parseInt(arr[0]);
			num2 = Integer.parseInt(arr[1]);
			num3 = Integer.parseInt(arr[2]);
			count = 0;
			count += num1;
			for (int i = 1; i < num3; i++) {
//				count = Math.pow(2, i);
			}
			test_cases--;
		}
		sb.delete(0, sb.capacity());

	}

}
