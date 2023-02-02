package arraysPractice;

import java.util.Scanner;

public class SortingArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int sizeOfArray = scan.nextInt();
		int[] OriginalArray = new int[sizeOfArray];
		System.out.println("Enter the values of the array");
		for (int i = 0; i < sizeOfArray; i++) {
			OriginalArray[i] = scan.nextInt();
		}
		scan.close();

		int[] sortedArray = arraySorting(OriginalArray);
		System.out.println("The Sorted Array");
		for (int eachValueDisplay : sortedArray) {
			System.out.print(eachValueDisplay + " ");
		}
	}

	private static int[] arraySorting(int[] originalArray) {
		for (int EachElement : originalArray) {
			for (int j = 0; j < originalArray.length - 1; j++) {
				if (originalArray[j] > originalArray[j + 1]) {
					int temp = originalArray[j];
					originalArray[j] = originalArray[j + 1];
					originalArray[j + 1] = temp;
				}
			}
		}
		return originalArray;
	}

}
