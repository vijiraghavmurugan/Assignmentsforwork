package javahundread;

import java.util.Scanner;

public class AlphabetOrNot {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the char");
		char ch=scan.next().charAt(0);
		scan.close();
		
		if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')) {
			System.out.println(ch+" is an alphabet");
		}else{
			System.out.println(ch+" is not an alphabet");
		}
	}

}
