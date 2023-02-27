package miniLogical;

import java.util.Scanner;

public class ProblemTwo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int lengthOfArray = scan.nextInt();

		int[] coins = new int[lengthOfArray];
		System.out.println("Enter the array values");

		for (int i = 0; i < lengthOfArray; i++) {
			coins[i] = scan.nextInt();
		}

		System.out.println("Enter the total amount");
		int amount = scan.nextInt();

		scan.close();
		int ways = findWays(coins, amount);

		System.out.println(ways);
	}

	private static int findWays(int[] coins, int amount) {
		int count = 0;
		for (int i = 0; i < coins.length; i++) {
			if (coins[i] > amount) {
				coins[i] = 0;
			} else if (coins[i] != 0) {
				boolean isEqual = findSum(coins[i], amount);
				if (isEqual) {
					count++;
				}
			}
		}
		return count;
	}

	private static boolean findSum(int coin, int amount) {
		int sum = 0;
		while (sum < amount) {
			sum += coin;
		}
		if (sum == amount) {
			return true;
		}
		return false;
	}

}
