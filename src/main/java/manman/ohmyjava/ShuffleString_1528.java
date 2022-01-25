package manman.ohmyjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ShuffleString_1528 {
    public static void main(String[] args) {
        System.out.println(getVal());

    }

    public static char[] getVal() {
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};
        String input = "codeleet";

        char[] result = new char[input.length()];
        ArrayList<Integer> mylist = (ArrayList<Integer>) Arrays.stream(indices).boxed().collect(Collectors.toList());
        for (int i = 0; i < input.length(); i++) {
            result[i] = input.charAt(mylist.indexOf(i));
        }
        return result;
    }
}


// https://leetcode.com/problems/shuffle-string/