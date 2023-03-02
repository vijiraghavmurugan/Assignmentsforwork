package javahundread;

import java.util.Scanner;

public class PolyEquation {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the number of elements");
		int n = scan.nextInt();

		int[] ip = new int[n];

		System.out.println("Enter the Elements");
		for (int i = 0; i < n; i++) {
			ip[i] = scan.nextInt();
		}

		System.out.println("Enter the value of x");
		int x = scan.nextInt();

		scan.close();

		int result = ip[0];
		for (int j = 1; j < ip.length; j++) {
			result = result * x + ip[j];
		}
		System.out.println("Value of Polynomial " +result);
	}
}
