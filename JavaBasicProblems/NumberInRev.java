package javahundread;

import java.util.Scanner;

public class NumberInRev {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		scan.close();
		
		int rev=0;
		while(num>0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println("Reversed Number is : "+rev);
	}

}
