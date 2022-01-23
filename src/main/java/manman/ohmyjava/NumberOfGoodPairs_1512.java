package manman.ohmyjava;

import java.util.Arrays;
import java.util.List;

public class NumberOfGoodPairs_1512 {
    public static void main(String [] args) {
       System.out.println(getVal());
    }


    public static int getVal() {
        int[] nums = {1,2,3,1,1,3};
        int goodPair=0;
        for(int i =0; i< nums.length;i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j])
                    goodPair += 1;
            }
        }
        return goodPair;
    }
}
