package javahundread;

public class ExpEval3 {

	public static void main(String[] args) {
		int y=10;
		
		System.out.println("z = (++y * (y++ + 5))");
		int z = (++y * (y++ + 5));
		System.out.println(z);
	}

}
