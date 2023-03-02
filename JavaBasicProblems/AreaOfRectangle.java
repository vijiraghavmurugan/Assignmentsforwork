package javahundread;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the Length of the Rectangle");
		int len=scan.nextInt();
		
		System.out.println("Enter the Breadth of the Rectangle");
		int bre=scan.nextInt();
		
		scan.close();
		
		System.out.println("The Area of the Rectangle is : "+len*bre);
	}

}
