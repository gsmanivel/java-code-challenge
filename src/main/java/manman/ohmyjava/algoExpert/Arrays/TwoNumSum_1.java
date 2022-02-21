package manman.ohmyjava.algoExpert.Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TwoNumSum_1 {
    public static void main(String[] args) {

        int[] array = {3, 5, -4, 8, 11, 1, -1, 6};
        int targetSum = 10;
        int[] result = twoNumberSum3(array, targetSum);
        Arrays.stream(result).forEach(item -> System.out.println(item));



    }

    //    Solution # 1
    public static int[] twoNumberSum1(int[] array, int targetSum) {
        int[] result = new int[2];
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == targetSum) {
                    result[0] = array[i];
                    result[1] = array[j];
                    return result;
                }
            }
        }
        return new int[0];
    }

    //    Solution # 2 - Potential Match
    public static int[] twoNumberSum2(int[] array, int targetSum) {
        Set<Integer> mySet = new HashSet<>();
        for (int num : array) {
            int potentionalMatch = targetSum - num;
            if (mySet.contains(potentionalMatch))
                return new int[]{num, potentionalMatch};
            else
                mySet.add(num);
        }
        return new int[0];
    }

    //    Solution # 3 - Sort the Array and navigate left and right
    public static int[] twoNumberSum3(int[] array, int targetSum) {
        Arrays.sort(array);  //array = {-1, -4, 1, 3, 5, 6, 8, 11};
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int actualSum = array[left] + array[right];
            if (actualSum == targetSum)
                return new int[]{array[left] , array[right]};
            if (actualSum > targetSum)
                right--;
            else
                left++;
        }

        return new int[0];
    }


}
