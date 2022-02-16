package manman.ohmyjava.leetcode;

import java.util.Arrays;

public class MinimumNumberofMoves_2037 {
    public static void main(String[] args) {
        MinimumNumberofMoves_2037 obj = new MinimumNumberofMoves_2037();
        int[] seats= {4,1,5,9};             // 1 4 5 9
        int[] students = {1,3,2,6};         // 1,2,3,6
        System.out.println(obj.minMovesToSeat(seats,students));
    }

    public int minMovesToSeat(int[] seats, int[] students) {
        int result=0;
        Arrays.sort(seats);
        Arrays.sort(students);
        for(int i=0;i<students.length;i++){
            result += Math.abs(students[i] - seats[i]);
        }
        return result;
    }
}
