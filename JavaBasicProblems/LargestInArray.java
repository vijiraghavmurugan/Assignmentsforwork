package javahundread;

import java.util.Scanner;

public class LargestInArray {

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
		
		int max=0;
		for(int j=0;j<len;j++) {
			if(arr[j]>max) {
				max=arr[j];
			}
		}
		
		System.out.println("The Largest element in the arrray is : "+max);
	}

}
