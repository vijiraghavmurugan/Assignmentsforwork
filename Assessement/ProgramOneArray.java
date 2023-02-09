package evaluation;

import java.util.Scanner;

public class ProgramOneArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] inputArray = getInput(scan);
		displayArray(inputArray);

		orderArray(inputArray);
		displayArray(inputArray);
	}

	private static void displayArray(int[] inputArray) {
		for (int eachValue : inputArray) {
			System.out.print(eachValue + " ");
		}
		System.out.println();
	}

	private static int[] getInput(Scanner scan) {
		System.out.println("Enter the number");
		String input = scan.next();
		char[] charArray = input.toCharArray();
		int[] inputArray = new int[charArray.length];
		try {
			for (int i = 0; i < input.length(); i++) {
				inputArray[i] = Character.getNumericValue(charArray[i]);
			}
		} catch (NumberFormatException e) {
			System.out.println("Incorrect format. Please enter a numerical value");
			getInput(scan);
		}
		return inputArray;
	}

	private static void orderArray(int[] inputArray) {
		
		for (int i = 0; i < inputArray.length - 1; i++) {
			boolean flag=false;
			if (inputArray[i] == 0 && inputArray[i + 1] > 0) {
				int temp = inputArray[i];
				inputArray[i] = inputArray[i + 1];
				inputArray[i + 1] = temp;
				flag=true;
			}
			if(flag) {
				i=i-2;
			}
		}
	}
}
