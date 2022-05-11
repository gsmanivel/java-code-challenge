package manman.ohmyjava.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListComparatorLambdaDemo {

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(100);
        myList.add(80);
        myList.add(90);
        myList.add(50);
        myList.add(70);

        System.out.println("Before Sorting::"+ myList);
        Collections.sort(myList);
        System.out.println("Default Sorting ::" +myList);

        Collections.sort(myList, (num1,num2)-> (num1>num2)? -1 :(num1<num2)? 1 :0);
        System.out.println("Custom  Sorting using Lambda::" +myList);
    }
}
