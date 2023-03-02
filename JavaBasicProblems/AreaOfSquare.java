package javahundread;

import java.util.Scanner;

public class AreaOfSquare {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the length of the side of a Square :");
		
		int a=scan.nextInt();
		
		scan.close();
		
		System.out.println("The Area of the Square : "+(a*2));
	}

}
