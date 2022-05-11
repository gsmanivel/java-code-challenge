package manman.ohmyjava.general;

import java.util.Scanner;

public class ArraysDemo {
    public static void main(String[] args) {
        Student student1 = new Student();

        System.out.println(student1.name);
        System.out.println(student1.marks[0]);  // marks[0,0,0,0,0]

        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the name:");
            String name = input.next();   //coimbatore
            student1.name = name;

            System.out.println("Enter mark -1 :");
            int mark1 = input.nextInt();
            student1.marks[0] = mark1;

            System.out.println(student1.name);
            System.out.println(student1.marks[0]);
        } catch (Exception e) {
            System.out.println("Enter Valid Mark. Try again");
        }
    }
}
