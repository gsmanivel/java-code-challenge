package manman.ohmyjava.java8;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetLambdaDemo {
    public static void main(String[] args) {
        Set<Integer> mySetDefaultSort = new TreeSet<>();

        mySetDefaultSort.add(10);
        mySetDefaultSort.add(20);
        mySetDefaultSort.add(50);
        mySetDefaultSort.add(30);
        mySetDefaultSort.add(50);
        mySetDefaultSort.add(40);
        mySetDefaultSort.add(60);

        System.out.println(mySetDefaultSort);

        Set<Integer> mySetCustomSort = new TreeSet<>((num1, num2) -> (num1 > num2) ? -1 : (num1 < num2) ? 1 : 0);
        mySetCustomSort.add(10);
        mySetCustomSort.add(20);
        mySetCustomSort.add(50);
        mySetCustomSort.add(30);
        mySetCustomSort.add(50);
        mySetCustomSort.add(40);
        mySetCustomSort.add(60);

        System.out.println(mySetCustomSort);
    }
}
