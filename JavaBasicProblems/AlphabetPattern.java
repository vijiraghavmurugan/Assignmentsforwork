package javahundread;

import java.util.Scanner;

public class AlphabetPattern {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the char");
		char ch = scan.next().charAt(0);
		
		//performing AND operator with the char and number 31 to find the position of the letter in the alphabet
		int lp = (ch & 31);

		int i, j;
		for (i = lp; i >= 1; i--) {
			for (j = 1; j <= i; j++) {
				System.out.printf("%c ", 'A' - 1 + i);
			}
			System.out.printf("\n");
		}

	}
}
