package javahundread;

import java.util.Scanner;

public class ContinousNumberPattern {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		scan.close();
		int c = 1, i = 1;

		while (c <= num) {
			for (int j = num; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(c + " ");
				c++;
			}
			i++;
			System.out.println();
		}
	}

}
