package HackerRank_DSA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LoopingPart2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test_cases = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < test_cases; i++) {
			String[] arr = br.readLine().trim().split("\\s+");
			int a = Integer.parseInt(arr[0]);
			int b = Integer.parseInt(arr[1]);
			int n = Integer.parseInt(arr[2]);
			int sum = a;
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < n; j++) {
				sum += (int) Math.pow(2, j) * b;
				sb.append(sum).append(" ");
			}
			System.out.println(sb.toString().trim());
		}
	}
}