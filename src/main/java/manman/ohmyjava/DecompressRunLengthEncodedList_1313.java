package manman.ohmyjava;

import java.util.Arrays;
import java.util.stream.IntStream;

public class DecompressRunLengthEncodedList_1313 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3};
        int[] result = decompressRLElist(nums);
        Arrays.stream(result).forEach(item -> System.out.println(item));
    }

    public static int[] decompressRLElist(int[] nums) {
        int[] result = {};
        for (int i = 0; i < nums.length; i = i + 2) {
            int[] tempArray = new int[nums[i]];
            for (int j = 0; j < nums[i]; j++)
                tempArray[j] = nums[i + 1];
            result = IntStream.concat(Arrays.stream(result), Arrays.stream(tempArray)).toArray();
        }
        return result;
    }
}
