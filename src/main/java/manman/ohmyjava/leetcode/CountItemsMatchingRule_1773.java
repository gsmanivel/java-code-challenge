package manman.ohmyjava.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountItemsMatchingRule_1773 {
    public static void main(String[] args) {
        CountItemsMatchingRule_1773 obj = new CountItemsMatchingRule_1773();
        String[][] itemsStr = {{"r","r","r"},{"r","r","qkzzqr"}};
        List<List<String>> items = new ArrayList<>();
        Arrays.stream(itemsStr).forEach(str -> items.add(Arrays.asList(str)));
        String ruleKey = "name", ruleValue = "r";
        int result = obj.countMatches(items, ruleKey, ruleValue);
        System.out.println(result);
    }

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        List<String> itemDescList = Arrays.asList(new String[]{"type", "color", "name"});
        List<List<String>> resultList = new ArrayList<>();
        for(List<String> item: items){
           for(int i=0;i<item.size();i++) {
             if(ruleKey.equals(itemDescList.get(i)) && item.get(i).equals(ruleValue))
                 resultList.add(item);
           }
        }
        return resultList.size();
    }
}
