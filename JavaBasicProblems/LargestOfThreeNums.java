package javahundread;

public class LargestOfThreeNums {
	public static void main(String[] args) {
		int a=10,b=20,c=40;
		
		if(a>b && a>c) {
			System.out.println(a+" is the largest");
		}else if(b>c && b>a) {
			System.out.println(b+" is the largest");
		}else {
			System.out.println(c+" is the largest");
		}
	}
}
