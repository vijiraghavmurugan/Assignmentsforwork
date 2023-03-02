package javahundread;

public class SubStringFind {

	public static void main(String[] args) {
		String str1="test123string";
		String str2="123";
		int index=-1;
		
		int len=str2.length();
		for(int i=0;i<str1.length()-3;i++) {
			String s=str1.substring(i, i+len);
			
			if(s.equalsIgnoreCase(str2)) {
				index=i;
			}
		}
		System.out.println(index);
	}

}
