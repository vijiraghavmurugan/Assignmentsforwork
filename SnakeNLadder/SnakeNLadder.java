package snakenladder;

import java.util.HashMap;

public class SnakeNLadder {
	private int win = 100;
	private HashMap<Integer, Integer> snake = new HashMap<Integer, Integer>();
	private HashMap<Integer, Integer> ladder = new HashMap<Integer, Integer>();

	public int getWin() {
		return win;
	}

	public void setWin(int win) {
		this.win = win;
	}

	public HashMap<Integer, Integer> getSnake() {
		return snake;
	}

	public void setSnake(HashMap<Integer, Integer> snake) {
		this.snake = snake;
	}

	public HashMap<Integer, Integer> getLadder() {
		return ladder;
	}

	public void setLadder(HashMap<Integer, Integer> ladder) {
		this.ladder = ladder;
	}

}
