package javahundread;

import java.util.Scanner;

public class ArrayDupe {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array");
		int len = scan.nextInt();

		System.out.println("Enter the element values");
		int[] arr = new int[len];
		for (int i = 0; i < len; i++) {
			arr[i] = scan.nextInt();
		}

		scan.close();

		System.out.println("The duplicates are");
		for (int j = 0; j < len; j++) {
			for (int k = j + 1; k < len; k++) {
				if(arr[j]==arr[k]) {
					System.out.println(arr[k]);
				}
			}

		}
	}

}
