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
		String mon = dateSplit[1];
		String yearAsString = dateSplit[2];
		int year = Integer.parseInt(dateSplit[2]);
		int monthAsNumber = monthCal(mon);
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

	public static int monthCal(String mon) {
		int mm = 0;
		switch (mon) {
		case "Jan":
			mm = 1;
			break;
		case "Feb":
			mm = 2;
			break;
		case "Mar":
			mm = 3;
			break;
		case "Apr":
			mm = 4;
			break;
		case "May":
			mm = 5;
			break;
		case "Jun":
			mm = 6;
			break;
		case "Jul":
			mm = 7;
			break;
		case "Aug":
			mm = 8;
			break;
		case "Sep":
			mm = 9;
			break;
		case "Oct":
			mm = 10;
			break;
		case "Nov":
			mm = 11;
			break;
		case "Dec":
			mm = 12;
			break;
		default:
			System.out.println("Invalid date : month");
		}
		return mm;
	}

}
