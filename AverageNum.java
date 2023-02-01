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
		double avg = average(sum, count);
		System.out.println("Output without roundoff and multiple decimal places = ");
		System.out.println(avg);
		System.out.println("Average is ");
		if (round.equalsIgnoreCase("yes")) {
			System.out.print((int) (avg + 0.5)); // convert double to int and rounding off
		} else if (round.equalsIgnoreCase("No")) {
			System.out.format("%." + deci + "f", avg); // convert double to float and rounding off to decimal values
		}

	}

	public static float average(float sum, int count) {
		return sum / count;
	}

	public static boolean check(String ip, int deci) {
		String[] ipSpl = ip.split("\\.");
		if (ipSpl[1].length() <= deci) {
			return true;
		}
		return false;
	}

}
