package HackerEarth_DSA;

import java.util.ArrayList;
import java.util.HashMap;

public class TwoPairs {

	public static void main(String[] args) {
		int n = 4;//this was given
		int[] num = { 51, 71, 17, 42 };//this was given
		ArrayList<Integer> num_list = new ArrayList<Integer>();
		ArrayList<Integer> sum_list = new ArrayList<Integer>();
		int sum = 0;
		for (int m = 0; m < n; m++) {
			String s = String.valueOf(num[m]);
			for (int i = 0; i < s.length(); i++) {
				num_list.add(Integer.parseInt(String.valueOf(s.charAt(i))));

			}
			for (int i = 0; i < num_list.size(); i++) {
				sum += num_list.get(i);
			}
			num_list.clear();
			sum_list.add(sum);
			sum = 0;
		}
		HashMap<Integer, Integer> freqMap = new HashMap<>();

		for (int num1 : sum_list) {
			freqMap.put(num1, freqMap.getOrDefault(num1, 0) + 1);
		}

		long totalPairs = 0;
		for (int freq : freqMap.values()) {
			if (freq > 1) {
				totalPairs += (long)(freq * (freq - 1)) / 2; // Combination formula C(n, 2)
			}
		}

		System.out.println(totalPairs);
	}

}
