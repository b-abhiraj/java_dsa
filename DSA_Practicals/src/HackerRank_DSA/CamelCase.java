package HackerRank_DSA;

import java.lang.Character;

public class CamelCase {

	public static void main(String[] args) {
		String s = "saveChangesInTheEditor";
		int count = 1;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isUpperCase(s.charAt(i))) {
				count += 1;
			}
		}
		System.out.println(count);
	}

}
