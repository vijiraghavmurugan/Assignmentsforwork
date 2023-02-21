package snakenladder;

import java.util.Scanner;

public class Main {
	static int win = 100;

	public static void main(String[] args) {
		SnakeNLadder preloadedDate = new SnakeNLadder();
		preloadedDate.loadingSnakeNLadderPositions();
		startPlaying();
	}

	public static void startPlaying() {
		Scanner scan = new Scanner(System.in);
		int player1 = 0, player2 = 0, diceValue;
		String roll = null;
		boolean player1OrNot = true;
		Player dice = new Player();

		System.out.println("Snake N Ladder");
		do {

			System.out.println(player1OrNot ? "\nPlayer 1 : Enter \"roll\" to roll the dice"
					: "\nPlayer 2 : Enter \"roll\" to roll the dice");
			roll = scan.next();
			diceValue = dice.rollDice();

			if (player1OrNot) {
				player1 = positionCalculation(player1, diceValue);
				System.out.println("\nDice Value : " + diceValue);
				System.out.println("Player1 position is : " + player1);
				if (player1 == win) {
					System.out.println("Player 1 is the Winner");
					System.exit(0);
				} else {
					player1OrNot = false;
				}

			} else {
				player2 = positionCalculation(player2, diceValue);
				System.out.println("\nDice Value : " + diceValue);
				System.out.println("Player2 position is : " + player2);
				if (player2 == win) {
					System.out.println("Player 2 is the Winner");
					System.exit(0);
				} else {
					player1OrNot = true;
				}
			}

		} while (roll.equalsIgnoreCase("roll"));
		scan.close();
	}

	public static int positionCalculation(int playerPosition, int diceValue) {
		SnakeNLadder snakeNLadderPosition = new SnakeNLadder();
		int newPosition = playerPosition + diceValue;

		Snake checkForSnake = new Snake(newPosition);
		Ladder checkForLadder = new Ladder(newPosition);

		if (newPosition > win) {
			newPosition = playerPosition;
		}
		for (Snake snakeValue : snakeNLadderPosition.snakePositions) {
			if (snakeValue.equals(checkForSnake)) {
				System.out.println("\nSnake has bitten you!");
				newPosition = snakeValue.getEndPosition();
			}
		}
		for (Ladder ladderValue : snakeNLadderPosition.ladderPositions) {
			if (ladderValue.equals(checkForLadder)) {
				System.out.println("\nLadder!. Climb up");
				newPosition = ladderValue.getEndPosition();
			}
		}

		return newPosition;
	}

}
