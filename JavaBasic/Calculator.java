package datatypesVarMethods;

import java.util.Scanner;

public class Calculator {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Do you want to perform operation:");
		System.out.println("Type Y or N");

		while (scan.hasNext()) {

			String ans = scan.nextLine();

			if (ans.equalsIgnoreCase("Y")) {
				System.out.println("Enter the 1st number");
				float firstNumber = scan.nextFloat();
				float resultNumber = calc(firstNumber);
				if (resultNumber != 0) { // to check whether firstNumbe
					String resultNumberAsString = Float.toString(resultNumber);
					String[] decimalString = resultNumberAsString.split("\\.");
					int afterDecimal = Integer.parseInt(decimalString[1]);
					if (afterDecimal > 0) {
						System.out.println(resultNumber);
					} else {
						System.out.println((int) resultNumber);

					}

				}
				System.out.println("\nDo you want to perform operation:");
				System.out.println("Type Y or N");

			} else if (ans.equalsIgnoreCase("N")) {
				System.out.println("Program stopped");
				System.exit(0);
			}
		}
	}

	public static float calc(float first) {

		System.out.println("Enter the operator");
		System.out.println(
				"+ for Addition ; - for Subtraction ; * for Multiplication ; / for Division ; % for Remainder ; pow for Power ; per for Percentage ; = for equals");
		String oper = scan.next();
		if (oper.equals("=")) {
			return first;
		}
		System.out.println("Enter the number");
		float second = scan.nextFloat();
		float res = 0;
		switch (oper) {
		case "+":
			res = add(first, second);
			calc(res);
			break;
		case "-":
			res = sub(first, second);
			calc(res);
			break;
		case "*":
			res = mul(first, second);
			calc(res);
			break;
		case "/":
			res = div(first, second);
			calc(res);
			break;
		case "%":
			res = rem(first, second);
			calc(res);
			break;
		case "pow":
			res = pow(first, second);
			calc(res);
			break;
		case "per":
			res = per(first, second);
			calc(res);
			break;
		default:
			System.out.println("\nEnter a valid operator");
			res = 0;
		}
		return res;

	}

	public static float per(float first, float second) {
		return (first / second) * 100;
	}

	public static float pow(float first, float second) {
		float res = 1;
		while (second != 0) {
			res = res * first;
			second--;
		}
		return res;
	}

	public static float rem(float first, float second) {
		return first % second;
	}

	public static float div(float first, float second) {
		return first / second;
	}

	public static float mul(float first, float second) {
		return first * second;
	}

	public static float add(float first, float second) {

		return first + second;
	}

	public static float sub(float first, float second) {
		return first - second;
	}
}
