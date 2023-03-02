package javahundread;

import java.util.HashSet;
import java.util.Set;

public class MergedArray {

	public static void main(String[] args) {
		int[] array1 = { 2, 4, 5, 6, 7, 9, 10, 13 };
		int[] array2 = { 2, 3, 4, 5, 6, 7, 8, 9, 11, 15 };

		Set<Integer> merged = new HashSet<Integer>();

		for (int ele : array1) {
			merged.add(ele);// adding the array1
		}

		for (int ele : array2) {
			merged.add(ele);// adding the array2
		}

		Object[] mergeArr = merged.toArray(); // changing to array

		for (int k = 0; k < mergeArr.length; k++) {
			System.out.print(mergeArr[k] + " "); // printing the merged array
		}
	}

}
