package BasicProblems;

public class Rotate90 {

	public static void main(String[] args) {
		int[][] arr1 = new int[3][3];
		int[][] arr2 = new int[3][3];
		int temp = 1;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr1[i][j] = temp;
				temp++;
			}
		}
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
				arr2[i][j]= arr1[j][i];
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr2[i][2-j] + " ");
			}
			System.out.println();
		}
	}
}