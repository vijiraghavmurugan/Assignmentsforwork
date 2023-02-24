package evaluation23feb2023;

import java.util.Scanner;

public class TargetWord {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		getInput();

	}

	private static void getInput() {

		System.out.println("Enter the size of the row ");
		int row = scan.nextInt();

		System.out.println("Enter the size of the columns");
		int column = scan.nextInt();

		String[][] inputValues = new String[row][column];

		System.out.println("Enter the values ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				inputValues[i][j] = scan.next();
			}
		}

		System.out.println("Enter the word to be searched");
		String wordSearch = scan.next();

		/*
		 * int row = 4, column = 4; char[][] inputValues = { { 'F', 'A', 'C', 'I' }, {
		 * 'O', 'B', 'Q', 'P' }, { 'A', 'N', 'O', 'B' }, { 'M', 'A', 'S', 'S' } };
		 * String wordSearch = "ASS";
		 */

		boolean isPresent = false;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if (inputValues[i][j] == String.valueOf(wordSearch.charAt(0))) {
					if ((findInRow(inputValues, wordSearch, i, j)) || (findInColumn(inputValues, wordSearch, i, j))
							|| (findDiagonal(inputValues, wordSearch, i, j))) {
						isPresent = true;
					}
				}

			}
		}

		System.out.println(isPresent);
	}

	private static boolean findDiagonal(String[][] inputValues, String wordSearch, int i, int j) {

		int count = 0;

		for (int row = i, col = j; row < inputValues.length && col < inputValues[0].length; row++, col++) {
			if (!String.valueOf(wordSearch.charAt(count)).equalsIgnoreCase(inputValues[row][col])) {
				return false;
			}
			count++;
		}

		return count == wordSearch.length() ? true : false;
	}

	private static boolean findInRow(String[][] inputValues, String wordSearch, int i, int j) {
		int count = 0;

		for (int col = j; col < inputValues.length; col++) {
			if (!String.valueOf(wordSearch.charAt(count)).equalsIgnoreCase(inputValues[i][col])) {
				return false;
			}
			count++;
		}
		return count == wordSearch.length() ? true : false;
	}

	private static boolean findInColumn(String[][] inputValues, String wordSearch, int i, int j) {
		int count = 0;
		for (int row = i; row < inputValues[0].length; row++) {
			if (!String.valueOf(wordSearch.charAt(count)).equalsIgnoreCase(inputValues[row][j])) {
				return false;
			}
			count++;
		}
		return count == wordSearch.length() ? true : false;
	}

}
