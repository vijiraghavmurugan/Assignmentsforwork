package wordle;

import java.util.ArrayList;
import java.util.Random;

public class Words {
	ArrayList<String> wordList = new ArrayList<String>();

	public void addList() {

		{
			wordList.add("MONEY");
			wordList.add("INBOX");
			wordList.add("TRAIN");
			wordList.add("WATCH");
			wordList.add("DRESS");
			wordList.add("WATER");
			wordList.add("MOUSE");

		}
	}

	public String randomWordGenerate() {

		Random random = new Random();
		String word = wordList.get(random.nextInt(wordList.size()));

		return word;
	}
}