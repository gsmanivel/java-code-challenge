package manman.ohmyjava;

import java.util.Arrays;

public class CheckIfTwoStringArraysareEquivalent_1662 {
    String w1="";
    String w2= "";
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"}, word2 = {"a", "bc"};
        CheckIfTwoStringArraysareEquivalent_1662 obj = new CheckIfTwoStringArraysareEquivalent_1662();
        System.out.println(obj.arrayStringsAreEqual(word1,word2));
    }

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        Arrays.stream(word1).forEach(str -> w1 = w1.concat(str));
        Arrays.stream(word2).forEach(str -> w2 = w2.concat(str));
        return w1.contentEquals(w2);
    }

}
