package javahundread;

import java.util.Scanner;

public class FactorialAndSum {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scan.nextInt();
		scan.close();
		
		int fact=1;
		while(num>0) {
			fact*=num;
			num--;
		}
		System.out.println("The factorial of the number is : "+fact);
		
		String str=Integer.toString(fact);
		int sum=0;
		for(int i=0;i<str.length();i++) {
			sum+=fact%10;
			fact=fact/10;
		}
		
		System.out.println("The sum of the digits : "+sum);
	}
}
