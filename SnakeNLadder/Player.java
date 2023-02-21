package snakenladder;

import java.util.Random;

public class Player {
	int roll = 1;

	public int rollDice() {
		Random randomNum = new Random();
		roll = randomNum.nextInt(7);
		if (roll == 0) {
			roll = 1;
		}
		return roll;

	}

}
