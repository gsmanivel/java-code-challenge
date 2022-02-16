package manman.ohmyjava.leetcode;

public class RichestCustomerWealth_1672 {
	public static void main(String[] args) {
		System.out.println(getVal());

	}

	public static int getVal() {
		int[][] accounts = { { 1, 5 }, { 7, 3 }, { 3, 5 } };
		int val = 0;
		for (int[] account : accounts) {
			int sum = 0;
			for (int num : account) {
				sum = sum + num;
			}
			val = Math.max(val, sum);
		}
		return val;

	}

	/*
	 * 
	 * https://leetcode.com/problems/richest-customer-wealth/
	 */
}
