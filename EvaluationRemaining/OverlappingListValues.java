package evaluation23feb2023;

import java.util.ArrayList;
import java.util.Collections;

class Interval implements Comparable<Interval> {
	Integer startInterval;
	Integer endInterval;

	public int getStartInterval() {
		return startInterval;
	}

	public void setStartInterval(int startInterval) {
		this.startInterval = startInterval;
	}

	public int getEndInterval() {
		return endInterval;
	}

	public void setEndInterval(int endInterval) {
		this.endInterval = endInterval;
	}

	public Interval(int startInterval, int endInterval) {
		this.startInterval = startInterval;
		this.endInterval = endInterval;
	}

	public Interval() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(Interval o) {
		return (this.startInterval).compareTo(o.getStartInterval());
	}
}

public class OverlappingListValues {

	public static void main(String[] args) {

		ArrayList<Interval> intervalList = new ArrayList<Interval>();

		intervalList.add(new Interval(1, 3));
		intervalList.add(new Interval(5, 10));
		intervalList.add(new Interval(4, 10));
		intervalList.add(new Interval(13, 18));
		intervalList.add(new Interval(12, 19));
		intervalList.add(new Interval(20, 25));

		// toPrintList(intervalList);
		Collections.sort(intervalList);
		System.out.println("Unique List");
		findUniqueIntervalList(intervalList);

	}

	public static void findUniqueIntervalList(ArrayList<Interval> intervalList) {

		for (int i = 0; i < intervalList.size() - 1; i++) {
			int startValue = 0;
			int endValue = 0;

			if (intervalList.get(i).getEndInterval() > intervalList.get(i + 1).getStartInterval()) {
				startValue = intervalList.get(i).getStartInterval();
				if (intervalList.get(i).getEndInterval() >= intervalList.get(i + 1).getEndInterval()) {
					endValue = intervalList.get(i).getEndInterval();
				} else {
					endValue = intervalList.get(i + 1).getEndInterval();
				}
				Interval newValueInterval = new Interval(startValue, endValue);
				intervalList.add(i, newValueInterval);

				intervalList.remove(i + 2);
				intervalList.remove(i + 1);
			}
		}
		toPrintList(intervalList);

	}

	public static void toPrintList(ArrayList<Interval> uniqueList) {
		for (Interval eachValue : uniqueList) {
			System.out.println(eachValue.getStartInterval() + " , " + eachValue.getEndInterval());
		}
	}

}
