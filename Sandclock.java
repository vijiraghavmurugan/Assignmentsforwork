package automationPract;

import java.util.Scanner;

public class Sandclock {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the no of rows");
		int rowLength = scan.nextInt();

		System.out.println("Enter the no of columns");
		int columnLength = scan.nextInt();

		int[][] array2D = new int[rowLength][columnLength];
		for (int i = 0; i < rowLength; i++) {
			for (int j = 0; j < columnLength; j++) {
				array2D[i][j] = scan.nextInt();
			}
		}

		scan.close();
		int largeSum = largest(array2D, rowLength, columnLength);
		System.out.println("Largest sum is : " + largeSum);

	}

	public static int largest(int[][] array2D, int rowLength, int columnLength) {
		int maximum = Integer.MIN_VALUE;
		for (int i = 0; i < rowLength - 2; i++) {
			for (int j = 0; j < columnLength - 2; j++) {
				int sum = 0;
				sum += array2D[i][j] + array2D[i][j + 1] + array2D[i][j + 2] + array2D[i + 1][j + 1] + array2D[i + 2][j]
						+ array2D[i + 2][j + 1] + array2D[i + 2][j + 2];
				if (sum > maximum) {
					maximum = sum;
				}
			}
		}
		return maximum;
	}

}
