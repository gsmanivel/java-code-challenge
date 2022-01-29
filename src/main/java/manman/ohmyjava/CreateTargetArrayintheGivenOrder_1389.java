package manman.ohmyjava;

import java.util.Arrays;

public class CreateTargetArrayintheGivenOrder_1389 {
    //    https://leetcode.com/problems/create-target-array-in-the-given-order/
    public static void main(String[] args) {
        int[] nums = {2,2,7,5,7};
        int[] index = {0,1,1,0,4};
        int[] result = new CreateTargetArrayintheGivenOrder_1389().createTargetArray(nums, index);
        Arrays.stream(result).forEach(item -> System.out.println(item));
    }

    public int[] createTargetArray(int[] nums, int[] index) {
        boolean flag = false;
        boolean straightFlow = true;
        int[] regularArray = new int[nums.length];
        int[] finalResult = new int[nums.length];
        for (int i = 0; i < index.length; i++) {
            int indexValue = index[i];
            if (indexValue == i)
                regularArray[i] = nums[i];
            else {
                straightFlow= false;
                flag = true;
            }

            if (flag) {
                boolean insertFlag=false;
                for(int loop2=0; loop2<nums.length;loop2++){
                    if(!(loop2 == indexValue))
                            finalResult[loop2] = insertFlag ? regularArray[loop2-1] : regularArray[loop2];
                    else {
                        insertFlag=true;
                        finalResult[loop2] = nums[i];
                    }
                }
                flag=false;
                regularArray = Arrays.copyOf(finalResult,nums.length);
            }
        }
        return regularArray;
    }
}
