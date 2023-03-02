package javahundread;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfSeries {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		scan.close();

		String s = "";
		int sum = 0;
		ArrayList<String> output = new ArrayList<String>();

		for (int i = 0; i < num; i++) {
			s = s + "1";
			sum += Integer.parseInt(s);
			output.add(s);
			output.add("+");
		}
		output.remove(output.size()-1);
		System.out.println(output.toString().replace(",", ""));
		System.out.println(sum);
	}

}
