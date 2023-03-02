package javahundread;

import java.util.Scanner;

public class NumberPatternInvert {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		scan.close();

		for (int i = num; i>0; i--) {
			for (int j = num; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = i; k >0; k--) {
				System.out.print( i+ " ");
			}
			System.out.println();
		}
	}
}
