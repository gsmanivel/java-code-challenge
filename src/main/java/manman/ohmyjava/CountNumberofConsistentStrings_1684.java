package manman.ohmyjava;

public class CountNumberofConsistentStrings_1684 {
    public static void main(String[] args) {
        CountNumberofConsistentStrings_1684 obj = new CountNumberofConsistentStrings_1684();
        String allowed = "ab";
        String[] words = {"ad","bd","aaab","baa","badab"};
        System.out.println(obj.countConsistentStrings(allowed,words));
    }

    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        for(String word: words){
            boolean flag=false;
            for(int i=0;i<word.length();i++) {
                flag = allowed.contains("".concat(String.valueOf(word.charAt(i))));
                if(!flag)
                    break;
            }
            if(flag)
                count+=1;
        }
        return count;
    }
}