package Day3_Recursion_BackTrack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PermutationsStrings {

	static void recurPermute(int index, StringBuilder s, List<String> ans) {
		if (index == s.length()) {
			ans.add(s.toString());
			return;
		}
		for (int i = index; i < s.length(); i++) {
			swap(s, index, i);
			recurPermute(index + 1, s, ans);
			swap(s, index, i);
		}
	}

	public static void swap(StringBuilder s, int i, int j) {
		char temp = s.charAt(i);
		s.setCharAt(i, s.charAt(j));
		s.setCharAt(j, temp);
	}

	static List<String> findPermutation(String s) {
		List<String> ans = new ArrayList<>();
		StringBuilder str = new StringBuilder(s);

		recurPermute(0, str, ans);
		Collections.sort(ans);
		return ans;
	}

	public static void main(String[] args) {
		String s = "ABC";
		List<String> res = findPermutation(s);
		for (String x : res) {
			System.out.print(x + " ");
		}
	}

}
