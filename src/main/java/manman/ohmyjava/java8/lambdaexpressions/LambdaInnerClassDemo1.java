package manman.ohmyjava.java8.lambdaexpressions;

public class LambdaInnerClassDemo1 {

    public int resultOfImplClass = 100;

    public void m2() {
        int resultOfMethod = 200;
        Person person = () -> {
            System.out.println(this.resultOfImplClass);
            System.out.println(resultOfMethod);
        };
        person.m1();
    }


    public static void main(String[] args) {
        LambdaInnerClassDemo1 obj = new LambdaInnerClassDemo1();
        obj.m2();
    }
}
