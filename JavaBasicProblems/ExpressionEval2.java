package javahundread;

public class ExpressionEval2 {

	public static void main(String[] args) {
		int a = 28;

		System.out.println("a+=a++ + ++a + -–a + a–-");
		a += a++ + ++a + -a + a--;
		System.out.println(a);
	}

}
