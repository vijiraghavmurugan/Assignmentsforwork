package javahundread;

import java.util.Scanner;

public class XpatternRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the number");
		int num = scan.nextInt();
		scan.close();

		String str = Integer.toString(num);
		int size = str.length();

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (j == i) {
					System.out.print(str.charAt(i));
				} else if (j == size - i - 1) {
					System.out.print(str.charAt(j));
				}
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
