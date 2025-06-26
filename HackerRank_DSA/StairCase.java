package HackerRank_DSA;

public class StairCase {

	public static void main(String[] args) {
		int m = 6;
		for (int i = 1; i <= m; i++) {
			for (int j = i; j < m; j++) {
				System.out.print(" ");
			}
			for (int n = 1; n <= i; n++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
