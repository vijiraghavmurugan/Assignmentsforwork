package snakenladder;

public class Main {

	public static void main(String[] args) {
		SnakeNLadder init = new SnakeNLadder();
		init.getSnake().put(25, 13);
		init.getSnake().put(45, 40);
		init.getSnake().put(56, 32);
		init.getSnake().put(56, 32);

		init.getLadder().put(28, 35);
		init.getLadder().put(47, 63);
		init.getLadder().put(78, 99);

		Player play = new Player();
		play.startPlaying();

	}

}
