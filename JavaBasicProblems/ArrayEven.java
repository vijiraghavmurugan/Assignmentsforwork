package javahundread;

import java.util.Scanner;

public class ArrayEven {

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
		
		System.out.println("Elements in even position in the array");
		for (int j = 0; j < arr.length; j++) {
			if (j % 2 != 0) {
				System.out.println(arr[j]);
			}
		}
	}

}
