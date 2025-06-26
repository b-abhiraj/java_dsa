package HackerEarth_DSA;

import java.io.*;
import java.util.*;

public class minCost {

    static class Pair {
        int index, value;
        Pair(int i, int v) { index = i; value = v; }
    }
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        String[] mk = br.readLine().split(" ");
        int n = Integer.parseInt(mk[0]), k = Integer.parseInt(mk[1]);
        int[] nums = Arrays.stream(br.readLine().split(" "))
                           .mapToInt(Integer::parseInt)
                           .toArray();
        Queue<Pair> positives = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                positives.offer(new Pair(i, nums[i]));
            }
            else if (nums[i] < 0) {
                int deficit = -nums[i];
                while (!positives.isEmpty() && deficit > 0) {
                    Pair donor = positives.peek();
                    if (donor.index < i - k) {
                        positives.poll();
                        continue;
                    }
                    if (donor.index > i + k) {
                        break;
                    }
                    int transfer = Math.min(deficit, donor.value);
                    nums[i] += transfer;
                    nums[donor.index] -= transfer;
                    donor.value -= transfer;
                    deficit -= transfer;
                    if (donor.value == 0) {
                        positives.poll();
                    }
                }
            }
        }
        long cost = 0;
        for (int x : nums) cost += Math.abs(x);
        System.out.println(cost);
    }
}