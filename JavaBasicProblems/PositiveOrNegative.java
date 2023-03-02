package javahundread;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int a=scan.nextInt();
		scan.close();
		if(a>0) {
			System.out.println("Positive Number");
		}else if(a<0) {
			System.out.println("Negative Number");
		}else {
			System.out.println("The number is 0");
		}
	}

}
