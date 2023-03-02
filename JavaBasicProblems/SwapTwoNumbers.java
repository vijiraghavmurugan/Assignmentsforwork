package javahundread;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		int x, y, temp;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the numbers");
		x = scan.nextInt();
		y = scan.nextInt();

		scan.close();
		System.out.println("Before Swap : " + x + " " + y);
		
		temp = x;
		x = y;
		y = temp;

		System.out.println("Swapped : " + x + " " + y);
	}

}
