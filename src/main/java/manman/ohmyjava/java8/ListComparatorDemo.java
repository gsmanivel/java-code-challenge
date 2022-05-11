package manman.ohmyjava.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListComparatorDemo implements Comparator<Integer> {

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(100);
        myList.add(80);
        myList.add(90);
        myList.add(50);
        myList.add(70);

        System.out.println("Before Sorting::"+ myList);
        Collections.sort(myList,new ListComparatorDemo());
        System.out.println("After Sorting::" + myList);

    }

    public int compare(Integer num1, Integer num2) {
        return (num1 > num2) ? -1 : (num1 < num2) ? 1 : 0;
    }

}
