package snakenladder;

import java.util.ArrayList;

public class SnakeNLadder {

	ArrayList<Snake> snakePositions = new ArrayList<Snake>();
	ArrayList<Ladder> ladderPositions = new ArrayList<Ladder>();

	public void loadingSnakeNLadderPositions() {
		snakePositions.add(new Snake(25, 13));
		snakePositions.add(new Snake(45, 40));
		snakePositions.add(new Snake(56, 32));
		snakePositions.add(new Snake(97, 65));

		snakePositions.add(new Snake(28, 35));
		snakePositions.add(new Snake(47, 63));
		snakePositions.add(new Snake(78, 99));

	}

}
