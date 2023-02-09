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
		contact.computeIfAbsent(":)", k -> new ArrayList<>()).add("45894875");
		contact.computeIfAbsent("hijk", k -> new ArrayList<>()).add(":)");
		contact.computeIfAbsent("=+15", k -> new ArrayList<>()).add("!!!!");
		contact.computeIfAbsent("1+2+3", k -> new ArrayList<>()).add("1234567");

		System.out.println("Enter the Name or Number to search");

		while (scan.hasNext()) {

			String nameOrNum = scan.next();
			try {
				Integer.valueOf(nameOrNum);
				displayContact(contact, nameOrNum);

			} catch (NumberFormatException e) {

				displayContact(contact, nameOrNum);
			}

		}
		System.out.println("Enter the name to search");
		scan.close();

	}

	private static void displayContact(Map<String, ArrayList<String>> contact, String nameOrNum) {
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

}
