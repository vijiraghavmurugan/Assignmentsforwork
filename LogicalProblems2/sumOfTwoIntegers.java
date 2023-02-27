package miniLogical;

import java.util.Scanner;

public class sumOfTwoIntegers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int lengthOfArray = scan.nextInt();

		int[] arrayInput = new int[lengthOfArray];
		System.out.println("Enter the array values");

		for (int i = 0; i < lengthOfArray; i++) {
			arrayInput[i] = scan.nextInt();
		}

		System.out.println("Enter the value for checking the sum");
		int checkValue = scan.nextInt();
		scan.close();
		findSum(arrayInput, checkValue);

	}

	private static void findSum(int[] arrayInput, int checkValue) {
		int counter = 0;
		for (int i = 0; i < arrayInput.length - 1; i++) {
			for (int j = i + 1; j < arrayInput.length; j++) {
				if (arrayInput[i] + arrayInput[j] == checkValue) {
					System.out.println(arrayInput[i] + " + " + arrayInput[j] + " = " + checkValue);
					counter++;
				}
			}
		}
		if (counter == 0) {
			System.out.println("No 2 values sum up to " + checkValue);
		}
	}

}
