package javahundread;

public class AlphabetRepeat {

	public static void main(String[] args) {
		System.out.println("Input");
		String ip = "b3c6d15";

		String num = ip.replaceAll("[^0-9]", " ").trim(); // not number
		String alp = ip.replaceAll("[^A-Za-z]", " ").trim();// not alphabets

		String[] arrN = num.split(" ");
		String[] arrS = alp.split(" ");
		int a;
		String s;

		for (int i = 0; i < arrS.length; i++) {
			a = Integer.valueOf(arrN[i]); // changing int to char
			s = arrS[i];
			// print till the count=0
			while (a > 0) {
				System.out.print(s);
				a--;
			}
		}
	}

}
