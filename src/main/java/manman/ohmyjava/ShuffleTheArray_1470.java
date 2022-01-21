package manman.ohmyjava;

public class ShuffleTheArray_1470 {

	public static void main(String[] args) {
		int[] result = getVal();
		for(int i=0 ; i<result.length; i++) {
			System.out.println(result[i]);			
		}

	}

	public static int[] getVal() {
		int[] nums = { 2, 5, 1, 3, 4, 7 };
		int n = 3;

		int[] result = new int[nums.length];
		int j = 0;
		for (int i = 0; i < (nums.length)/2; i++) {
			result[j] = nums[i];
			result[j+1] = nums[i + n];
			j = j + 2;
		}
		return result;
	}
}


// https://leetcode.com/problems/shuffle-the-array/submissions/
