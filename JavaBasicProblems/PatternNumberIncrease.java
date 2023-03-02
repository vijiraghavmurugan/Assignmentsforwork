package javahundread;

import java.util.Scanner;

public class PatternNumberIncrease {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		scan.close();
		int j, k, l;
		for (int i = 1; i <= num; i++) {
			for (j = num - 1; j >= i; j--) {
				System.out.print(" ");
			}
			for (k = 1; k <= i; k++) {
				System.out.print(k);
			}
			--k;
			for (l = k; l >1; l--) {
				System.out.print(l-1);
			}
			System.out.println();
		}
	}

}
