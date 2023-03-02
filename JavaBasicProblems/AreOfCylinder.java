package javahundread;

import java.util.Scanner;

public class AreOfCylinder {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the Radius of the Cylinder");
		float rad=scan.nextFloat();
		
		System.out.println("Enter the Height of the Cylinder");
		float h=scan.nextFloat();
		
		scan.close();
		
		System.out.println("The Surface Area of the Cylinder is : "+(22*rad*(rad+h)/7));
	}

}
