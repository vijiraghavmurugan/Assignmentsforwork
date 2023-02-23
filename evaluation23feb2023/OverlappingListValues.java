package evaluation23feb2023;

import java.util.ArrayList;

class Interval {
	private int startInterval;
	private int endInterval;

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

}

public class OverlappingListValues {

	public static void main(String[] args) {

		ArrayList<Interval> intervalList = new ArrayList<Interval>();

		intervalList.add(new Interval(1, 3));
		intervalList.add(new Interval(4, 10));
		intervalList.add(new Interval(12, 19));
		intervalList.add(new Interval(5, 10));
		intervalList.add(new Interval(20, 25));
		intervalList.add(new Interval(13, 18));

		findUniqueIntervalList(intervalList);
	}

	public static void findUniqueIntervalList(ArrayList<Interval> intervalList) {
		ArrayList<Interval> uniqueList = new ArrayList<Interval>();

		for (int i = 0; i < intervalList.size(); i++) {
			int startValue = intervalList.get(i).getStartInterval();
			int endValue = intervalList.get(i).getEndInterval();

			for (int j = 0; j < intervalList.size(); j++) {
				int nextStart = intervalList.get(j).getStartInterval();
				int nextEnd = intervalList.get(j).getEndInterval();

				if ((startValue <= nextStart) && (startValue < nextEnd) && (endValue > nextStart)
						&& (endValue >= nextEnd)) {
					Interval uniqueInterval = new Interval(startValue, endValue);
					uniqueList.add(uniqueInterval);
					
				}
			}
		}
		toPrintList(uniqueList);

	}

	public static void toPrintList(ArrayList<Interval> uniqueList) {
		for (Interval eachValue : uniqueList) {
			System.out.println(eachValue.getStartInterval() + " , " + eachValue.getEndInterval());
		}
	}

}
