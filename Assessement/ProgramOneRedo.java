package evaluation;

import java.util.LinkedList;
import java.util.Scanner;

public class ProgramOneRedo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the Number");
		String input = scan.next();

		LinkedList<Integer> inputList = new LinkedList<Integer>();

		char[] charArray = input.toCharArray();
		for (char c : charArray) {
			inputList.add(Character.getNumericValue(c));
		}

		scan.close();

		System.out.println("Before changing " + inputList);

		for (int i = 1; i < input.length(); i++) {
			if ((inputList.get(i) > 0) && (inputList.get(i - 1) == 0)) {
				int value = inputList.get(i);
				inputList.add((i - 1), value);
				inputList.remove(i + 1);
				inputList.remove(i);
				inputList.add((inputList.size()), 0);
			}

		}
		System.out.println("Before changing " + inputList);
	}

}
