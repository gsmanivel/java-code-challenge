package manman.ohmyjava.general;

public class LoopDemo {

    public static void printMe(){
        System.out.println("Hi Hello");
    }

    public static void main(String[] args) {

        int[] marks =  {10,20,30,40,50,60};
        String[] names  = { "mani", "ravi", "saro"};
        int total = 0;

        // for(starting pont ; conditional validation ; increment)
        for(int i=0; i<marks.length;i++) {
            if(marks[i]>40){
                System.out.println(marks[i]);
            }
            else {
                System.out.println("This mark is less than 40 " + marks[i]);
            }
        }
    }
}

