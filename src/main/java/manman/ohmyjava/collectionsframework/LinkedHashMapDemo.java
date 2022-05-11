package manman.ohmyjava.collectionsframework;

import java.util.*;

public class LinkedHashMapDemo {

    public static void main(String[] args) {

        Map<Integer,String> myMap = new HashMap<>();
        myMap.put(1,"manivel");
        myMap.put(2,"sin2");
        myMap.put(3,"Ayush");
        myMap.put(40,"Manman");
        myMap.put(6,"Ayush");

        Set<Map.Entry<Integer,String>> entrySet = myMap.entrySet();
        Iterator<Map.Entry<Integer,String>> iterator = entrySet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }


}
