package javahundread;

import java.util.Scanner;

public class AreaBwTwoCircles {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the radius of the Outer circle");
		float r=scan.nextFloat();
		
		System.out.println("Enter teh radius of the Inner circle");
		float R=scan.nextFloat();
		
		scan.close();
		
		System.out.println("The Area of the space between circles : "+(22*(r*r+R*R)/7));
		
	}

}
