package javahundread;

import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {
		char[] ch= {'a','e','i','o','u'};
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the char");
		char s=scan.next().charAt(0);
		scan.close();
		for(char c:ch) {
			if(c==s) {
				System.out.println("Vowel");
				break;
			}else {
				System.out.println("Not a Vowel");
			}
		}
	}

}
