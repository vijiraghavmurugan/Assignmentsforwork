package javahundread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AscDescNum {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] reArr = new int[arr.length];

		List<Integer> lsOdd = new ArrayList<Integer>();
		List<Integer> lsEven = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				lsOdd.add(arr[i]);
			} else {
				lsEven.add(arr[i]);
			}
		}

		Collections.sort(lsOdd, Collections.reverseOrder());

		int j=0,k=0;
		
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				reArr[i]=lsOdd.get(j++);
			} else {
				reArr[i]=lsEven.get(k++);
			}
		}
		
		for(int c:reArr) {
			System.out.print(c);
		}
	}

}
