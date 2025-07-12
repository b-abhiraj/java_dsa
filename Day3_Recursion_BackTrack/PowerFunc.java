package Day3_Recursion_BackTrack;

public class PowerFunc {

	public static int p = 1;

	public static int Power(int m, int n) {
		if (p >= n) {
			return 1;
		} else {
			p++;
			return m* Power(m, n);
		}
	}
	public static void main(String[] args) {
		System.out.println(Power(2, -2));
	}

}
