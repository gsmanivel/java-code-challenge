package manman.ohmyjava;

import java.util.Arrays;

public class NumbersSmallerThanCurrNum_1365 {
    public static void main(String [] args) {
       Arrays.stream(getVal()).forEach(num -> System.out.println(num));
    }


    public static int[] getVal() {
        int[] nums = {8, 1, 2, 2, 3};
        int[] rest = new int[nums.length];
        for(int i=0;i<nums.length;i++){
           int maxCount = 0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]>nums[j])
                    maxCount+=1;
            }
            rest[i] = maxCount;
        }
        return rest;
    }

}
