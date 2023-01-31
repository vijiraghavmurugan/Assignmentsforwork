package datatypesVarMethods;

import java.util.Scanner;

public class DayoftheYear {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the date(DD-Mon-YYYY)");
		String dates = scan.next();
		int days = cal(dates);
		System.out.println(days);
		scan.close();
	}

	public static int cal(String dates) {

		String[] dateSplit = dates.split("-");
		int dd = Integer.parseInt(dateSplit[0]);
		String mon = dateSplit[1];
		int year = Integer.parseInt(dateSplit[2]);
		int mm = 0;
		if (dateSplit[2].length() == 4 && dd < 32) {
			mm = monthCal(mon);
		}
		int days = dd;
		if (mm != 0) {
			for (int i = mm - 1; i > 0; i--) {
				if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
					days += 31;
				} else if ((i == 4 || i == 6 || i == 9 || i == 11) && dd<31){
					days += 30;

				} else if (i == 2) {
					if ((year / 100 != 0) && (year / 4 == 0) && (year / 400 == 0)) {
						days += 29;

					} else {
						days += 28;
					}
				}
				else {
					System.out.println("Invalid date : Day");
				}
			}
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
