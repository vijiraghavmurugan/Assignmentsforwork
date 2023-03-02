package javahundread;

public class ExpEval2 {

	public static void main(String[] args) {
		int x = 28;
		
		System.out.println("x = x++ * 2 + 3 * –x;");
		x = x++ * 2 + 3 * -x;
		System.out.println(x);
	}

}
