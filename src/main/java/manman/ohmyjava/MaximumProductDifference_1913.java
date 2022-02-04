package manman.ohmyjava;

public class MaximumProductDifference_1913 {
    public static void main(String[] args) {
        MaximumProductDifference_1913 obj = new MaximumProductDifference_1913();
        int[] nums = {5,9,4,6}; //{635,7712,3645,3270,7542,5729,5001,3729,3653,388,3165,6529,5379,4565,1138,4574,5754,8347,6549,8786,5426,453,1890,9174,6659,2533,3879,2663,2901,6756,407,2939,5443,6746,4066,4372,2609,1772,6268};
        System.out.println(obj.maxProductDifference(nums));
    }

    public int maxProductDifference(int[] nums) {
        int max = 0;
        int min = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(max < nums[i] * nums[j])
                    max= nums[i] * nums[j];
                if(i==0 && j==1)
                    min= max;

                if(min > nums[i] * nums[j])
                    min = nums[i] * nums[j];
            }
        }
        System.out.println("Max:" + max);
        System.out.println("Min:" + min);
        return max-min;
    }
}
