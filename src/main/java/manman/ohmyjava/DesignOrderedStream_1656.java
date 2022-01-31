package manman.ohmyjava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DesignOrderedStream_1656 {
    int index=0;
    int pointer=1;
    Map<Integer, String> myMap;
    String[] res;

    public static void main(String[] args) {
        DesignOrderedStream_1656 obj = new DesignOrderedStream_1656(5);

        System.out.println(obj.insert(3,"ccccc"));
        System.out.println(obj.insert(1,"aaaaa"));
        System.out.println(obj.insert(2,"bbbbb"));
        System.out.println(obj.insert(5,"eeeee"));
        System.out.println(obj.insert(4,"ddddd"));
    }

    public DesignOrderedStream_1656(int n) {
        this.myMap = new HashMap<>();

        index=0;
        res= new String[n];
    }

    public List<String> insert_(int idKey, String value) {
        List<String> ans = new ArrayList<>();
        res[idKey-1] = value;
        while(index<res.length && res[index]!=null){
            ans.add(res[index]);
            index++;
        }
        return ans;
    }

    public List<String> insert(int idKey, String value) {
        List<String> result= new ArrayList<>();
        myMap.put(idKey,value);

        while(pointer<=myMap.size() && !(myMap.get(pointer) == null)){
            result.add(myMap.get(pointer));
            pointer+=1;
        }
        return result;
    }
}

//https://leetcode.com/problems/design-an-ordered-stream/
