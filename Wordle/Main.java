package wordle;

public class Main {

	public static void main(String[] args) {
		Words word=new Words();
		Board checker=new Board();
		
		
		word.addList();
		String wordToBeChecked=word.randomWordGenerate();
		//System.out.println(wordToBeChecked);
		checker.startPlay(wordToBeChecked);
	}

}
