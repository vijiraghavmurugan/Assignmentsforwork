package javahundread;

import java.util.Scanner;

public class StartAndUnderscorePattern {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		scan.close();

		int size = num * 2;

		for (int i = 1; i < size; i++) {
			for (int j = 1; j <= size; j++) {
				 
				System.out.print("*");
				

				System.out.println();
			}
		}
	}

}
