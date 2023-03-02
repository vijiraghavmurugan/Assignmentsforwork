package javahundread;

import java.util.Scanner;

public class Tables {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the number");

		int n = scan.nextInt();
		scan.close();

		System.out.println("Multiplication table");
		for (int i = 1; i <= 10; i++) {

			System.out.println(n + "*" + i + "=" + n * i);
		}

		System.out.println("Subtraction table");
		for (int i = n; i <= n + 10; i++) {

			System.out.println(i + "-" + n + "=" + (i - n));
		}
	}

}
