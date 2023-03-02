package javahundread;

import java.util.Scanner;

public class XPatternNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the number");
		int num = scan.nextInt();
		scan.close();

		String str = Integer.toString(num);
		int size = str.length();

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (j == i || j == size - i - 1) {
					System.out.print(str.charAt(i));
				}
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}
