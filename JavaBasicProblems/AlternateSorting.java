package javahundread;

import java.util.Arrays;

public class AlternateSorting {

	public static void main(String[] args) {
		int[] ip = { 1, 2, 3, 4, 8, 6, 7 ,5};
		
		Arrays.sort(ip);

		int[] op = new int[ip.length];

		int i = 0, j = ip.length - 1, k = 0;
		while (i < j) {
			op[k++] = ip[j--];//largest number
			op[k++] = ip[i++];//smallest number
		}

		//odd no of digits
		if (ip.length % 2 != 0) {
			op[k] = ip[i];
		}
		for (int a : op) {
			System.out.print(a+" ");
		}

	}

}
