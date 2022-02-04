package manman.ohmyjava;

public class FindFirstPalindromicString_2108 {
    public static void main(String[] args) {
        FindFirstPalindromicString_2108 obj = new FindFirstPalindromicString_2108();
        String[] words = {"abc", "car", "ada", "racecar", "cool"};
        System.out.println(obj.firstPalindrome(words));
    }

    public String firstPalindrome(String[] words) {
        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            sb.append(word);
            if (word.equals(sb.reverse().toString()))
                return word;
        }
        return null;
    }
}
