package javahundread;

import java.util.ArrayList;

public class GroupOfStudents {

	public static void main(String[] args) {

		System.out.println("Total number of Students");
		int num = 20;

		int start = 101;

		int sum = (num + start);
		ArrayList<ArrayList<Integer>> lists = new ArrayList<ArrayList<Integer>>();
		for (int i = 1; i <= num / 5; i++) {
			ArrayList<Integer> group = new ArrayList<Integer>();
			lists.add(group);
		}
		int j = 0;
		while (j < num / 5) {
			lists.get(j).add(start++);
			j++;
			if ((j == 4) && (start != sum)) {
				j = 0;
			}else if(start==sum) {
				break;
			}

		}

		for (int i = 0; i < lists.size(); i++) {
			ArrayList<Integer> ls = lists.get(i);
			System.out.println(ls);
		}

	}

}
