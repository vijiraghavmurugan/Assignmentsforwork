package javahundread;

import java.util.Scanner;

public class AsciiValue {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the char");
		char ch = scan.next().charAt(0);
		scan.close();
		// performing AND operator with the char and number 31 to find the position of
		// the letter in the alphabet
		int lp = ch;

		System.out.println(lp);
	}

}
