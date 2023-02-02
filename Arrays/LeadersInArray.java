package arraysPractice;

import java.util.Scanner;

public class LeadersInArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int sizeOfArray = scan.nextInt();

		System.out.println("Enter the Integer values for the array");
		int[] arrayForLeaders = new int[sizeOfArray];
		for (int i = 0; i < sizeOfArray; i++) {
			arrayForLeaders[i] = scan.nextInt();
		}
		scan.close();
		int[] resultArray = findLeader(arrayForLeaders, sizeOfArray);
		System.out.println("The Leaders are");
		for (int eachValue : resultArray) {
			if (eachValue != 0)
				System.out.print(eachValue + " ");
		}
	}

	private static int[] findLeader(int[] arrayForLeaders, int sizeOfArray) {
		int[] resultArray = new int[sizeOfArray];
		int count = 0, tempValue = 0;

		outer: for (int j = 0; j < sizeOfArray - 1; j++) {
			for (int k = j + 1; k < sizeOfArray; k++) {
				if (arrayForLeaders[j] > arrayForLeaders[k]) {
					tempValue = arrayForLeaders[j];
				} else {
					continue outer;
				}
			}
			resultArray[count++] = tempValue;
		}
		resultArray[count] = arrayForLeaders[sizeOfArray - 1];
		return resultArray;
	}

}
