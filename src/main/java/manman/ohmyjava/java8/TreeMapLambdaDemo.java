package manman.ohmyjava.java8;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapLambdaDemo {

    public static void main(String[] args) {
        Map<Integer,String> myMapDefault = new TreeMap<>();
        myMapDefault.put(100,"Mani");
        myMapDefault.put(200,"Vel");
        myMapDefault.put(100,"Asyush");
        myMapDefault.put(400,"Sin2");
        myMapDefault.put(300,"Nihal");

        System.out.println(myMapDefault);

        Map<Integer,String> myMapCustomSort = new TreeMap<>((num1,num2)->(num1>num2) ? -1:(num1<num2)?1:0);
        myMapCustomSort.put(100,"Mani");
        myMapCustomSort.put(200,"Vel");
        myMapCustomSort.put(100,"Asyush");
        myMapCustomSort.put(400,"Sin2");
        myMapCustomSort.put(300,"Nihal");

        System.out.println(myMapCustomSort);

    }
}
