package manman.ohmyjava;

public class CreateTargetArrayintheGivenOrder_1389 {
    //    https://leetcode.com/problems/create-target-array-in-the-given-order/
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};
        new CreateTargetArrayintheGivenOrder_1389().createTargetArray(nums, index);
    }

    public int[] createTargetArray(int[] nums, int[] index) {
        boolean flag = false;
        int[] result = new int[nums.length];
        int[] tempArray = new int[nums.length];
        for (int i = 0; i < index.length; i++) {
            int indexValue = index[i];
            if (indexValue == i) {
                result[i] = nums[i];
            } else {
                flag = true;
                for(int j=0;j<nums.length;j++){
                    if(j==indexValue){
                        tempArray[j] = nums[j];
                    }
                }
            }
            if (flag) {

                result = tempArray;
            }
        }
        return result;
    }

    public int[] insertArray(){

        return new int[0];
    }
}
