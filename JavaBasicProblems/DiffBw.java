package javahundread;

import java.util.Scanner;

public class DiffBw {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		
		int ip=scan.nextInt();
		
		scan.close();
		
		int temp=ip,sum=0;
		
		//reverse the number
		while(ip>0) {
			sum=(sum*10)+ip%10;
			ip=ip/10;
		}
		
		System.out.println(temp+"-"+sum+"="+(temp-sum));
	}

}
