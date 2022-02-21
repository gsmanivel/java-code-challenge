package manman.ohmyjava.algoExpert.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ValidateSequence_2 {
    public static void main(String[] args) {
        Integer[] arrayElements = {1, 1, 1, 1, 1};
        List<Integer> array = new ArrayList<>(Arrays.asList(arrayElements));
        Integer[] sequenceElements = {1, 1, 1};
        List<Integer> sequence = new ArrayList<>(Arrays.asList(sequenceElements));
        System.out.println(isValidSubsequence(array, sequence));
        System.out.println(isValidSubsequence2(array, sequence));
    }

    //Solution # 1
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int position = 0;
        for (int num : array) {
            if (sequence.size() == position)
                break;
            if (sequence.get(position).equals(num))
                position += 1;
        }
        return (position == sequence.size());
    }

    //Solution # 2
    public static boolean isValidSubsequence2(List<Integer> array, List<Integer> sequence) {
        int arrayIndex = 0;
        int sequenceIndex = 0;
        while (arrayIndex < array.size() && sequenceIndex < sequence.size()) {
            if (array.get(arrayIndex).equals(sequence.get(sequenceIndex)))
                sequenceIndex += 1;
            arrayIndex += 1;
        }
        return sequenceIndex == sequence.size();
    }


}
