package javahundread;

public class LeftRotate {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		// Printing the original array
		for (int[] row : arr) {
			for (int col : row) {
				System.out.print(col + " ");
			}
			System.out.println();
		}

		int n = 1, first, j, rep = 1;
		System.out.println("==========================================================");

		// Left Rotation
		while (rep <= n) {
			for (int i = 0; i <= arr.length - 1; i++) {
				first = arr[i][0];
				for (j = 0; j < arr.length - 1; j++) {
					arr[i][j] = arr[i][j + 1];
				}
				arr[i][j] = first;
			}
			rep++;
		}

		// printing the resultant array
		for (int[] row : arr) {
			for (int col : row) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}

}
