package manman.ohmyjava;

import java.util.ArrayList;
import java.util.Arrays;

public class SumofAllOddLengthSubarrays_1558 {
    public static void main(String[] args) {
        SumofAllOddLengthSubarrays_1558 obj = new SumofAllOddLengthSubarrays_1558();
        int[] arr = {10, 11, 12};
        int result = obj.sumOddLengthSubarrays(arr);
        System.out.println(result);
    }


    public int sumOddLengthSubarrays(int[] arr) {
        int result = 0;
        ArrayList<Integer> oddNumList = new ArrayList<>();
        for (int oddNumLoop = 3; oddNumLoop <= arr.length; oddNumLoop++) {
            if (!(oddNumLoop % 2 == 0))
                oddNumList.add(oddNumLoop);
        }

        for (int oddNum : oddNumList) {
            for (int outerLoop = 0; outerLoop < arr.length; outerLoop++) {
                if ((outerLoop + oddNum) - 1 < arr.length) {
                    for (int finalLoop = 0; finalLoop < oddNum; finalLoop++) {
                        result += arr[finalLoop + outerLoop];
                    }
                } else
                    break;
            }
        }
        return result + Arrays.stream(arr).sum();
    }
}
