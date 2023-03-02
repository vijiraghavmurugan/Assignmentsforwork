package javahundread;

import java.util.Scanner;

public class RightRotate {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array");
		int len = scan.nextInt();

		System.out.println("Enter the element values");
		int[] arr = new int[len];
		for (int i = 0; i < len; i++) {
			arr[i] = scan.nextInt();
		}

		System.out.println("Enter the number of times to be rotated");
		int n = scan.nextInt();

		scan.close();

		System.out.println("Original Array");
		for (int a : arr) {
			System.out.print(a + " ");
		}

		int k, j;
		for (j = 0; j < n; j++) {
			int first = arr[len - 1];
			for (k = len-1; k >0; k--) {
				arr[k] = arr[k-1];
			}
			arr[k] = first;
		}

		System.out.println();
		System.out.println("After the right rotate");
		for (int a : arr) {
			System.out.print(a + " ");
		}
	}

}
