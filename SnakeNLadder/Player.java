package snakenladder;

import java.util.Scanner;

public class Player {
	Dice dice = new Dice();
	SnakeNLadder position = new SnakeNLadder();

	public void startPlaying() {
		Scanner scan = new Scanner(System.in);
		int player1 = 0, player2 = 0, diceValue;
		String roll = null;
		boolean player1OrNot = true;

		do {
			System.out.println(player1OrNot ? "\nPlayer 1 : Enter \"roll\" to roll the dice"
					: "\nPlayer 2 : Enter \"roll\" to roll the dice");
			roll = scan.next();
			diceValue = dice.rollDice();

			if (player1OrNot) {
				player1 = positionCalculation(player1, diceValue);
				System.out.println("\nDice Value : " + diceValue);
				System.out.println("Player1 position is : " + player1);
				if (player1 == position.getWin()) {
					System.out.println("Player 1 is the Winner");
					System.exit(0);
				} else {
					player1OrNot = false;
				}

			} else {
				player2 = positionCalculation(player2, diceValue);
				System.out.println("\nDice Value : " + diceValue);
				System.out.println("Player2 position is : " + player2);
				if (player2 == position.getWin()) {
					System.out.println("Player 2 is the Winner");
					System.exit(0);
				} else {
					player1OrNot = true;
				}
			}

		} while (roll.equalsIgnoreCase("roll"));
		scan.close();
	}

	public int positionCalculation(int playerPosition, int diceValue) {
		int newPosition = playerPosition + diceValue;

		if (newPosition > position.getWin()) {
			newPosition = playerPosition;
		} else if (position.getSnake().get(newPosition) != null) {
			System.out.println("\nSnake has bitten you!");
			newPosition = position.getSnake().get(newPosition);
		} else if (position.getLadder().get(newPosition) != null) {
			System.out.println("\nLadder!. Climb up");
			newPosition = position.getLadder().get(newPosition);
		}

		return newPosition;
	}
}
