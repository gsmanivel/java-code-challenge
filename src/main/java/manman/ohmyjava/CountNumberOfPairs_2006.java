package manman.ohmyjava;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class CountNumberOfPairs_2006 {
    int result;
    public static void main(String[] args) {
        CountNumberOfPairs_2006 obj = new CountNumberOfPairs_2006();
        int[] nums = {1,3};
        int k = 3;
        int result = obj.countKDifference(nums,k);
        System.out.println(result);
    }
    public int countKDifference(int[] nums, int k) {
        Arrays.stream(nums).forEach( num -> {
            Arrays.stream(nums).forEach(j -> {
                int i = (num > j && num - j == k) ? result += 1 : result;
            });
        });
        return result;
    }
}
