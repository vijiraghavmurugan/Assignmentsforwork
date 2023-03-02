package javahundread;

import java.util.Scanner;

public class FrequencyInArray {

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

		int[] dupe = new int[len];
		int visited = -1;
		for (int j = 0; j < len; j++) {
			int count = 1;
			for (int k = j + 1; k < len; k++) {
				if (arr[j] == arr[k]) {
					count++;
					dupe[k] = visited;
				}
			}
			if (dupe[j] != visited) {
				dupe[j] = count;
			}
		}
		System.out.println("The Frequency of elements are");
		for (int l = 0; l < dupe.length; l++) {
			if (dupe[l] != visited)
				System.out.println(arr[l] + " : " + dupe[l]);
		}
	}

}
