package arraysPractice;

import java.util.Scanner;

public class ZPattern {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number n for n*n matrix");
		int rowAndColumn = scan.nextInt();
		scan.close();
		
		String[][] patternArray = printPattern(rowAndColumn);
		for (int i = 0; i < rowAndColumn; i++) {
			for (int j = 0; j < rowAndColumn; j++) {
				System.out.print(patternArray[i][j]);
			}
			System.out.println();
		}
	}

	private static String[][] printPattern(int rowAndColumn) {
		String[][] patternArray = new String[rowAndColumn][rowAndColumn];
		int indexNumber = rowAndColumn - 2;
		for (int i = 0; i < rowAndColumn; i++) {
			if (i == 0 || i == rowAndColumn - 1) {
				for (int j = 0; j < rowAndColumn; j++) {
					patternArray[i][j] = "*";
				}
			} else {
				for (int j = 0; j < rowAndColumn; j++) {
					if (j == indexNumber) {
						patternArray[i][j] = "*";
						indexNumber--;
					}else {
						patternArray[i][j]=" ";
					}
				}
			}
		}
		return patternArray;
	}

}
