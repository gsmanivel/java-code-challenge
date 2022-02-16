package manman.ohmyjava.leetcode;

import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCodeWords_804 {
    public static void main(String[] args) {
        UniqueMorseCodeWords_804 obj = new UniqueMorseCodeWords_804();
        String[] words = {"gin","zen","gig","msg"};
        System.out.println(obj.uniqueMorseRepresentations(words));
    }
    public int uniqueMorseRepresentations(String[] words) {
        String[] encoding = { ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String charString = "abcdefghijklmnopqrstuvwxyz";
        Set<String> resultSet = new HashSet<>();
        for (String word : words) {
            String tempString = "";
            for (int ch = 0; ch < word.length(); ch++) {
                char c = word.charAt(ch);
                int index = charString.indexOf(c);
                tempString = tempString.concat(encoding[index]);
            }
            resultSet.add(tempString);
        }
        return resultSet.size();
    }
}
