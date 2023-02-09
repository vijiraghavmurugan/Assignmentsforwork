package evaluation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class ContactSearch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map<String, ArrayList<String>> contact = new HashMap<String, ArrayList<String>>();

		contact.computeIfAbsent("abc", k -> new ArrayList<>()).add("123456789");
		contact.computeIfAbsent("abc", k -> new ArrayList<>()).add("123456755");
		contact.computeIfAbsent("xyz", k -> new ArrayList<>()).add("458215");
		contact.computeIfAbsent("xyz", k -> new ArrayList<>()).add("964857");
		contact.computeIfAbsent("lmn", k -> new ArrayList<>()).add("854856");
		contact.computeIfAbsent("lmn", k -> new ArrayList<>()).add("3486571");
		contact.computeIfAbsent("hijk458", k -> new ArrayList<>()).add("5943966");
		contact.computeIfAbsent("hijk", k -> new ArrayList<>()).add("45894875");

		System.out.println("Enter the Name or Number to search");

		while (scan.hasNext()) {

			String nameOrNum = scan.next();
			try {
				Integer.valueOf(nameOrNum);
				displayContactForNumber(contact, nameOrNum);

			} catch (NumberFormatException e) {

				displayContactForName(contact, nameOrNum);
			}

		}
		System.out.println("Enter the name to search");
		scan.close();

	}

	private static void displayContactForNumber(Map<String, ArrayList<String>> contact, String nameOrNum) {
		boolean flag = false;
		for (Entry<String, ArrayList<String>> entryValues : contact.entrySet()) {
			String key = entryValues.getKey();
			for (String values : contact.get(key)) {
				if ((values.contains(nameOrNum)) || (key.contains(nameOrNum))) {
					flag = true;
					System.out.print(key + " : ");
					System.out.print(values);
					System.out.println();
				}
			}
		}
		if (!flag) {
			System.out.println("No contact available");
			return;
		}
	}

	private static void displayContactForName(Map<String, ArrayList<String>> contact, String searchName) {
		boolean flag = false;
		for (String key : contact.keySet()) {
			if (key.contains(searchName)) {
				flag = true;
				for (String val : contact.get(key)) {
					System.out.print(key + " : ");
					System.out.print(val);
					System.out.println();
				}
			}
		}
		if (!flag) {
			System.out.println("No contact available");
			return;
		}
	}

}
