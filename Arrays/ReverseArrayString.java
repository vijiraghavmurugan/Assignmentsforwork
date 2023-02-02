package arraysPractice;

import java.util.Scanner;

public class ReverseArrayString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int sizeOfArray = scan.nextInt();
		String[] OriginalArray = new String[sizeOfArray];
		System.out.println("Enter the values of the array");
		for (int i = 0; i < sizeOfArray; i++) {
			OriginalArray[i] = scan.next();
		}
		scan.close();

		String[] ReversedArray = arrayReversal(OriginalArray);
		System.out.println("The Reversed Array");
		for (String eachValueDisplay : ReversedArray) {
			System.out.print(eachValueDisplay + " ");
		}

	}

	public static String[] arrayReversal(String[] originalArray) {
		int j = 0, lengthOfArray = originalArray.length;
		for (int i = lengthOfArray - 1; i >= (lengthOfArray / 2); i--) {
			String num = originalArray[j];
			originalArray[j] = originalArray[i];
			originalArray[i] = num;
			j++;
		}
		return originalArray;
	}

}
