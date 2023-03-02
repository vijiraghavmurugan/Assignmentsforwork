package javahundread;

import java.util.Scanner;

public class OddorEven {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the number");

		int ip = scan.nextInt();

		scan.close();

		if(ip%2==0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
	}

}
