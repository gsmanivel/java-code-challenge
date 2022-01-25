package manman.ohmyjava;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DecodeXoredArray_1720 {
    public static void main(String[] args) {
        int[] output = decode(new int[]{1, 2, 3}, 1 );
        Arrays.stream(output).forEach(x -> System.out.println(x));
    }

    public static int[] decode(int[] encoded, int first) {
        int[] result = new int[encoded.length+1];
        result[0] = first;
        for(int i = 0 ; i < encoded.length; i++){
            int xor = encoded[i] ^ first;
            result[i+1] = xor;
            first= xor;
        }
        return result;
    }
}
