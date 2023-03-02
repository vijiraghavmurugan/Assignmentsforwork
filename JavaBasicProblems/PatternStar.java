package javahundread;

import java.util.Scanner;

public class PatternStar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		scan.close();

		for (int i = 0; i <=num; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k=0; k <= num-1-i; k++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}

	}
}
