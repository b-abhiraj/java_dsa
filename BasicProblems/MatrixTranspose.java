package BasicProblems;

public class MatrixTranspose {

	public static void main(String[] args) {
		int[][] arr1= new int[3][3];
		int temp = 1;
		for(int i =0;i<arr1.length;i++) {
			for(int j = 0;j<arr1[0].length;j++) {
				arr1[i][j] = temp;
				temp++;
			}
		}
		for(int i =0;i<arr1.length;i++) {
			for(int j = 0;j<arr1[0].length;j++) {
				System.out.print(arr1[j][i]+" ");
			}
			System.out.println();
		}
	}

}
