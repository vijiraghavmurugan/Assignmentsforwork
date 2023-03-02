package javahundread;

public class ExpressionEval {

	public static void main(String[] args) {
		int a=8,b=4;
		
		System.out.println("++a-b--");
		System.out.println(++a-b--);
		
		System.out.println("a%b++");
		System.out.println(a%b++);
				
		System.out.println("a*=b+5");
		System.out.println(a*=b+5);
		
		System.out.println("x=69>>>2");
		System.out.println(69>>>2);
	}

}
