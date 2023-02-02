package datatypesVarMethods;

import java.util.Scanner;

public class DayoftheYear {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the date(DD-Mon-YYYY)");
		String dates = scan.next();
		int finalResult = cal(dates);
		if (finalResult == 0) {
			System.out.println("Invalid date");
		} else {
			System.out.println(finalResult);
		}
		scan.close();
	}

	public static int cal(String dates) {

		String[] dateSplit = dates.split("-");
		int dayFromDates = Integer.parseInt(dateSplit[0]);
		int days = dayFromDates;
		String monthFromDates = dateSplit[1];
		String yearAsString = dateSplit[2];
		int year = Integer.parseInt(dateSplit[2]);
		int monthAsNumber = monthCalculation(monthFromDates);
		if (yearAsString.length() == 4 && monthAsNumber != 0 || (dayFromDates <= 29 && monthAsNumber == 2)) {

			for (int i = monthAsNumber - 1; i > 0; i--) {
				switch (i) {
				case 1, 3, 5, 7, 8, 10, 12:
					if (dayFromDates < 32)
						days += 31;
					break;
				case 4, 6, 9, 11:
					if (dayFromDates < 31)
						days += 30;
				case 2:
					if ((year % 4 == 0) && (((year % 100 == 0) && (year % 400 == 0)) || (year % 100 != 0))) {
						days += 29;

					} else {
						days += 28;
					}
				}
			}
		} else {
			days = 0;
		}

		return days;

	}

	public static int monthCalculation(String monthFromDates) {
		int monthAsNumber = 0;
		switch (monthFromDates) {
		case "Jan":
			monthAsNumber = 1;
			break;
		case "Feb":
			monthAsNumber = 2;
			break;
		case "Mar":
			monthAsNumber = 3;
			break;
		case "Apr":
			monthAsNumber = 4;
			break;
		case "May":
			monthAsNumber = 5;
			break;
		case "Jun":
			monthAsNumber = 6;
			break;
		case "Jul":
			monthAsNumber = 7;
			break;
		case "Aug":
			monthAsNumber = 8;
			break;
		case "Sep":
			monthAsNumber = 9;
			break;
		case "Oct":
			monthAsNumber = 10;
			break;
		case "Nov":
			monthAsNumber = 11;
			break;
		case "Dec":
			monthAsNumber = 12;
			break;
		default:
			System.out.println("Invalid date : month");
		}
		return monthAsNumber;
	}

}
