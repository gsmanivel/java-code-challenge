package manman.ohmyjava.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortEmployeeObject {
    public static void main(String[] args) {

        List<Employee> mylist = new ArrayList<Employee>();

        Employee mani = new Employee(100,"mani");
        Employee sin2 = new Employee(300,"sin2");
        Employee ayush = new Employee(200,"ayush");
        Employee soma = new Employee(400,"soma");

        Employee[] employees = new Employee[]{mani, sin2, ayush, soma};
         mylist = Arrays.asList(employees);
        System.out.println(mylist);

        Collections.sort(mylist,(obj1,obj2)-> (obj1.getEno()>obj2.getEno())?-1:(obj1.getEno()<obj2.getEno())?1:0);
        System.out.println(mylist);
    }
}
