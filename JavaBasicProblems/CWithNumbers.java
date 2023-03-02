package javahundread;

import java.util.Scanner;

public class CWithNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		scan.close();
		for (int j = 1; j <= num; j++) {
			if (j == 1 || j == num) {
				for (int i = 0; i < num; i++) {
					System.out.print(" *");
				}
				System.out.println();
			} else {
				System.out.println("*");
			}

		}
	}

}
