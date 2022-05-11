package manman.ohmyjava.collectionsframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {

    public static void main(String[] args) {

        /*
        1. Declare arraylist
        2. Check virtual Capacity
        3. Increase the virtual Capacity
        4. Iterate the arraylist using classic for-loop, for-each, iterator, ListIterator, Lambda/Streams
        5. Check the exceptions
        6. Create Arraylist using Array
         */
        ArrayList<Integer> list= new ArrayList<>();
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);
        System.out.println(list);

        //Classic
        System.out.println("----------Classic----------");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        //for-each
        System.out.println("----------For Each----------");
        for(int num: list)
            System.out.println(num);

        //Iterator
        System.out.println("----------Iterator----------");
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //List Iterator
        System.out.println("----------List Iterator----------");
        ListIterator<Integer> listIterator = list.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        //Lambda
        System.out.println("----------lambda/Streams----------");
        list.stream().forEach(System.out::println);
    }


}
