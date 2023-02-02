package datatypesVarMethods;

import java.util.Scanner;

public class Sqroot {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		float num = scan.nextFloat();
		float res=sqrt(num);
		System.out.println(res);
		scan.close();
	}

	public static int sqrt(float num) {
		int odd = 1, i;

		for (i = 0; num >= 0; i++) {
			num -= odd;
			odd += 2;
		}
		return i-1;
	}
}
