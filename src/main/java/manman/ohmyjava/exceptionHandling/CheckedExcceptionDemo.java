package manman.ohmyjava.exceptionHandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CheckedExcceptionDemo {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter printWriter = new PrintWriter("abc.txt");
        printWriter.println("hello");
    }
}
