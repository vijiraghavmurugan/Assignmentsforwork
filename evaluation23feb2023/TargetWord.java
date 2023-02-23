package evaluation23feb2023;

import java.util.Arrays;
import java.util.Scanner;

public class TargetWord {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		getInput();

	}

	private static void getInput() {
		/*
		 * System.out.println("Enter the size of the row "); int row = scan.nextInt();
		 * 
		 * System.out.println("Enter the size of the columns"); int column =
		 * scan.nextInt();
		 * 
		 * String[][] inputValues = new String[row][column];
		 * 
		 * System.out.println("Enter the values "); for (int i = 0; i < row; i++) { for
		 * (int j = 0; j < column; j++) { inputValues[i][j] = scan.next(); } }
		 * 
		 * System.out.println("Enter the word to be searched"); String wordSearch =
		 * scan.next();
		 */

		int row = 4, column = 4;
		String[][] inputValues = { { "F", "A", "C", "I" }, { "O", "B", "Q", "P" }, { "A", "N", "O", "B" },
				{ "M", "A", "S", "S" } };
		String wordSearch = "Fa";
		boolean isPresent = toSearchInArray(inputValues, wordSearch, row, column);

		System.out.println(isPresent);

	}

	public static boolean toSearchInArray(String[][] inputValues, String wordSearch, int row, int column) {
		boolean isPresent = false;
		int lengthOfWordSearch = wordSearch.length() - 1;
		int left = 0, top = 0, right = column - 1, bottom = row - 1;
		String toCompareLeft = "", toCompareTop = "", toCompareDiagonal = "";

		// left to right
		while (left < right) {
			for (int i = 0; i < right; i++) {
				toCompareLeft += inputValues[left][i];
				System.out.println(toCompareLeft);
				if (toCompareLeft.equalsIgnoreCase(wordSearch)) {
					return true;
				}
			}
			left++;

		}

// top to bottom

// diagonal
// while(top<=())

		return isPresent;
	}

}
