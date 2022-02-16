package manman.ohmyjava.leetcode;

import java.util.Arrays;

public class FlippingImage_832 {

    public static void main(String[] args) {
        FlippingImage_832 obj = new FlippingImage_832();
        int[][] image = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        Arrays.stream(obj.flipAndInvertImage(image)).forEach(item ->
            Arrays.stream(item).forEach(System.out::println));
    }

    public int[][] flipAndInvertImage(int[][] image) {
        int[][] result = new int[image.length][image.length];
        int resultStart = 0;
        for (int[] innerImage : image) {
            int[] temInnerImage = new int[innerImage.length];
            int temInnerImageStart = 0;
            for (int n = innerImage.length-1; n >=0; n--) {
                int newNum = (innerImage[n] == 1) ? 0 : 1;
                temInnerImage[temInnerImageStart] = newNum;
                temInnerImageStart += 1;
            }
            result[resultStart] = temInnerImage;
            resultStart += 1;
        }
        return result;
    }
}