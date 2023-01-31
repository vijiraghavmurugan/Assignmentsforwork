package datatypesVarMethods;

import java.util.Scanner;

public class AverageNum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no of decimals allowed = ");
		int deci = scan.nextInt();
		System.out.println("Enter number of subjects = ");
		int count = scan.nextInt();

		float sum = 0;
		for (int i = 1; i <= count; i++) {
			System.out.println("Enter the " + i + " number ");
			String ip = scan.next();
			float input = Float.parseFloat(ip);
			if (ip.contains(".")) {
				boolean ch = check(ip, deci);
				if (ch == true) {
					sum = sum + input;
				} else {
					i--;
					System.out.println("Enter again");
				}
			} else {
				sum = sum + input;
			}
		}
		System.out.println("Round off needed : Yes or No");
		String round = scan.next();
		scan.close();
		float avg = average(sum, count);
		System.out.println("Output without roundoff and multiple decimal places = ");
		System.out.format("%.7f", avg);
		System.out.println();
		if (round.equalsIgnoreCase("yes")) {
			System.out.println("Average is " + (int) avg);
		} else if (round.equalsIgnoreCase("No")) {
			System.out.println("Average is");
			System.out.format("%." + deci + "f", avg);
		}

	}

	public static float average(float sum, int count) {
		return sum / count;
	}

	public static boolean check(String ip, int deci) {
		String[] ipSpl = ip.split("[.]");
		if (ipSpl[1].length() <= deci) {
			return true;
		}
		return false;
	}

}
