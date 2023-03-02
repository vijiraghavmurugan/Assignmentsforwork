package javahundread;

import java.util.Scanner;

public class CharTillZ {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the char");
		char ch=scan.next().charAt(0);
		
		scan.close();
		
		for(char i=ch;i<='z';i++) {
			System.out.print(i+" "); //prints till 'z'
		}
	}

}
