package evaluation23feb2023;

import java.util.Scanner;

public class NonDescending {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter the size of the array");
		int sizeOfArray = scan.nextInt();

		int[] arrayInput = new int[sizeOfArray];
		arrayInput = addArray(sizeOfArray, arrayInput);
		toFindNonDescendingArray(arrayInput);
	}

	public static int[] addArray(int sizeOfArray, int[] arrayInput) {
		System.out.println("Enter the values of the array");

		for (int i = 0; i < sizeOfArray; i++) {
			arrayInput[i] = scan.nextInt();
		}

		return arrayInput;
	}

	private static void toFindNonDescendingArray(int[] arrayInput) {
		int count = 0, valueToBeChanged = 0;

		for (int i = 0; i < arrayInput.length - 1; i++) {
			if (arrayInput[i] > arrayInput[i + 1]) {
				count++;
				valueToBeChanged = arrayInput[i];
			}
		}
		if (count == 0) {
			System.out.println("Given array is in Non-descending order. No need to change any value");
		} else if (count == 1) {
			System.out.println(
					"One value to be changed to get the Non-descending order for the given array. The value is "
							+ valueToBeChanged);
		} else {
			System.out.println("The given array cannot be changed to non-descending order");
		}
	}

}
