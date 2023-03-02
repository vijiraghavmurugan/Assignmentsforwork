package javahundread;

import java.util.Scanner;

public class naturalNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the number of natural numbers");
		int count = scan.nextInt();
		scan.close();
		int sum = 0;
		for (int i = 1; i <= count; i++) {
			sum = sum + i;
		}
		System.out.println("The sum of " + count + " numbers is : " + sum);

		String str = Integer.toString(sum);
		int len = 0,dig;
		
		for (int j = 0; j < str.length(); j++) {
			dig=sum%10;
			if(dig>len) {
				len=dig;
				sum=sum/10;
			}
		}

		System.out.println("The largest digit is : " + len);
	}

}
