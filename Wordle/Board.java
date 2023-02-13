package wordle;

import java.util.Scanner;

public class Board {

	Scanner scan = new Scanner(System.in);
	String wordInput;

	void startPlay(String wordToBeChecked) {
		for (int i = 1; i <= 6; i++) {
			String correctPosition = "", correctLetter = "";
			System.out.println("Enter the 5 letter guess word for attempt number " + i);
			wordInput = scan.next();
			if (wordInput.length() == 5) {
				char[] inputArray = wordInput.toUpperCase().toCharArray();
				char[] guessArray = wordToBeChecked.toUpperCase().toCharArray();

				for (int j = 0; j < 5; j++) {
					if (inputArray[j] == guessArray[j]) {
						correctPosition += Character.toString(inputArray[j]);
					} else if (wordToBeChecked.contains(Character.toString(inputArray[j]))) {
						correctLetter += Character.toString(inputArray[j]);
					}
				}

				if (correctPosition != null && correctPosition.equalsIgnoreCase(wordToBeChecked)) {
					System.out.println("Hoot!! Hoot!! Correct Word " + wordInput.toUpperCase());
					System.exit(0);
				} else if (!correctLetter.isEmpty() || !correctPosition.isEmpty()) {
					System.out.println("Try Again!");
					System.out.println("Letters that were correct and in correct position : " + correctPosition);
					System.out.print("Letters that were correct but in wrong position : ");
					System.out.println(correctLetter.isEmpty() ? "Nil" : correctLetter);
				} else if (correctLetter.isEmpty() || correctPosition.isEmpty()) {
					System.out.println("No letters were correct. Try Again!");
				}

			}else {
				System.out.println("Enter a 5 letter word");
				i--;
			}
		}

		System.out.println("Attempts have been exhausted ");
		System.out.println("The correct word is " + wordToBeChecked);
	}
}
