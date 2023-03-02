package javahundread;

import java.util.Scanner;

public class PolyEquationFormula {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the Values");
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();

		scan.close();
		double root1, root2;

		double brack = b * b - (4 * a * c);

		if (brack > 0) {
			root1 = (-b + Math.sqrt(brack)) / (2 * a);
			root2 = (-b - Math.sqrt(brack)) / (2 * a);

			System.out.format("root1=%2f and root2=%2f", root1, root2);
		} else if (brack == 0) {
			root1 = root2 = -b / (2 * a);
			System.out.format("root1= root2=%2f", root1);
		} else {
			double real = -b / (2 * a);
			double imaginary = Math.sqrt(-brack) / (2 * a);
			System.out.format("root1 = %.2f+%.2fi", real, imaginary);
			System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
		}

	}
}
