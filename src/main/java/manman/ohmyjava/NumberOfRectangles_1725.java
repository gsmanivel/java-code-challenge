package manman.ohmyjava;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class NumberOfRectangles_1725 {
    public static void main(String[] args) {
        int[][] rectangles = {{5, 8}, {3, 9}, {3, 12}}; // {{2, 3}, {3, 7}, {4, 3}, {3, 7}}; //  {{5, 8}, {3, 9}, {5, 12}, {16, 5}}; //
        NumberOfRectangles_1725 obj = new NumberOfRectangles_1725();
        System.out.println(obj.countGoodRectangles(rectangles));
    }

    public int countGoodRectangles(int[][] rectangles) {
        int result = 0;
        int maxNum = 0;
        for (int[] rectangle : rectangles) {
            int maxSide = Math.min(rectangle[0], rectangle[1]);
            maxNum = Math.max(maxSide, maxNum);
        }

        for (int[] num : rectangles) {
            result = (maxNum <= num[0]) && maxNum <= num[1] ? result + 1 : result;
        }
        return result;
    }
}
