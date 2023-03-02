package javahundread;

import java.util.Scanner;

public class PatternNumberDecrease {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		scan.close();

		for (int i = num; i > 0; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = i; j <= num; j++) {
				System.out.print(j);
			}
			for (int j = num-1; j >= i; j--) {
				System.out.print(j);
			}

			System.out.println();
		}
	}

}
