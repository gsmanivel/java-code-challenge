package manman.ohmyjava;

public class RunningSumof1dArray_1480 {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4 };
		int len = nums.length;
		int[] rest = new int[len];

//		for (int i = 0; i < len; i++) {
//			int val = 0;
//			for (int j = 0; j <= i; j++) {
//				val = val + nums[j];
//				rest[i] = val;
//			}
//		}
		
		
		//Best Solution		
		int sum =0;
		for(int i=0;i<nums.length;i++) {
			sum = sum + nums[i];
			rest[i] = sum;
		}

		for (int i = 0; i < rest.length; i++) {
			System.out.println(rest[i]);
		}
	}
}
