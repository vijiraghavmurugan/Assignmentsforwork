package javahundread;

public class CollegeStatic {

	//static variable
	static String colgName = colName();

	//static block
	static {
		System.out.println("Inside the static block");
	}

	//Static Method
	static String colName() {
		System.out.println("Inside the static method");
		String clg = "XYZ";
		return clg;
	}

	public static void main(String[] args) {
		System.out.println("Inside main");
		CollegeStatic.NestedStatic ns=new CollegeStatic.NestedStatic();
		ns.show();
	}
	
	static class NestedStatic{
		public void show() {
			System.out.println("Inside the static class");
			System.out.println(colgName);
		}
	}
}
