package manman.ohmyjava.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FindTargetIndices_2089 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 2, 3};
        int target = 2;
        FindTargetIndices_2089 obj = new FindTargetIndices_2089();
        System.out.println(obj.targetIndices(nums, target));
    }

    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> result = new ArrayList<>();
        Arrays.sort(nums);
        IntStream.range(0, nums.length).forEach(i -> {
            if (nums[i] == target)
                result.add(i);
        });
        return result;
    }
}