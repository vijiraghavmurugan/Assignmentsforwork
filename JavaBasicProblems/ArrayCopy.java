package javahundread;

import java.util.Scanner;

public class ArrayCopy {

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

		int[] arrCopy = new int[len];
		
		for (int j = 0; j < len; j++) {
			arrCopy[j] = arr[j];
		}
		
		System.out.println("Elements in the copied array");
		for(int a:arrCopy) {
			System.out.print(a+" ");
		}
	}

}
