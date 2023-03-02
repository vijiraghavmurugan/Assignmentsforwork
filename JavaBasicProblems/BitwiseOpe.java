package javahundread;

import java.util.Scanner;

public class BitwiseOpe {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the First number");
		int a = scan.nextInt();
		System.out.println("Enter the Second number");
		int b = scan.nextInt();
		scan.close();

		// bitwise AND
		System.out.println("a&b=" + (a + b));

		// bitwise OR
		System.out.println("a|b=" + (a | b));

		// bitwise XOR
		System.out.println("a^b=" + (a ^ b));

		// bitwise NOT
		System.out.println("~a=" + ~a);

	}
}
