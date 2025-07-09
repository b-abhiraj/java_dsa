package HackerEarth_DSA;

import java.util.*;

public class AsPerFrequency {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int testCount = sc.nextInt();

		int[] arr = new int[num];
		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}

		Map<Integer, Integer> freqMap = new HashMap<>();
		for (int val : arr) {
			freqMap.put(val, freqMap.getOrDefault(val, 0) + 1);
		}

		int maxFreq = num;

		long[] freqSum = new long[maxFreq + 1];
		for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
			int number = entry.getKey();
			int f = entry.getValue();
			freqSum[f] += (long) number * f;
		}

		long[] prefixSum = new long[maxFreq + 1];
		long acc = 0;
		for (int f = 1; f <= maxFreq; f++) {
			acc += freqSum[f];
			prefixSum[f] = acc;
		}

		while (testCount-- > 0) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			if (m < 1)
				m = 1;
			if (n > maxFreq)
				n = maxFreq;
			if (m > n) {
				System.out.println(0);
			} else {
				System.out.println(prefixSum[n] - prefixSum[m - 1]);
			}
		}

		sc.close();
	}
}
