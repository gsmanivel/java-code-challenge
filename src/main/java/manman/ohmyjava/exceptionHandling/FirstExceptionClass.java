package manman.ohmyjava.exceptionHandling;

public class FirstExceptionClass {
    public static void main(String[] args) {
        new FirstExceptionClass().doMoreStuff();
    }

    public void doMoreStuff(){
        System.out.println(1/0);
    }
}
