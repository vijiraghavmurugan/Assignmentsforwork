package javahundread;


public class RevString {

	public static void main(String[] args) {
		
		System.out.println("String");
		String str = "I Love India";
		String[] arrS = str.split(" ");

		String rev = "";

		for (String s : arrS) {
			rev += s+" ";
			System.out.println(s);
		}

		System.out.println("The Reversed String is : " + rev);
	}

}
