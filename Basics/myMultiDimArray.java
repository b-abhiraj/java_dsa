package Basics;

import java.util.Scanner;

public class myMultiDimArray {

	public static void main(String[] args) {
		int arr[][];
		arr = new int[1][3];
		arr[0][0] = 3;
		arr[0][1] = 5;
		arr[0][2] = 7;

		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[0][2]);

		int[][] arr2 = { { 1, 2 }, { 3, 4 } };
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int rows = sc.nextInt();
		System.out.println("Enter the number of cols: ");
		int cols = sc.nextInt();
		int[][] arr3 = new int[rows][cols];
		System.out.println("Enter the elements of array: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				arr3[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(arr3[i][j] + " ");
			}
			System.out.println();
		}

		sc.close();
		int[][][] arr4 = { { { 1, 2 }, { 3, 4 } }, { { 5, 6 }, { 7, 8 } } };
		int n = arr4.length;
		int m = arr4[0].length;
		int o = arr4[0][0].length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				for (int k = 0; k < o; k++) {
					System.out.println("arr[" + i + "][" + j + "][" + k + "]" + arr4[i][j][k]);
				}
			}
		}
		System.out.println("\nAnother array");
		int[][][] arr5 = new int[2][2][2];
		n = arr5.length;
		m = arr5[0].length;
		o = arr5[0][0].length;
		int it = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				for (int k = 0; k < o; k++) {
					arr5[i][j][k] = it;
					it++;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				for (int k = 0; k < o; k++) {
					System.out.print(arr5[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}

	}
}