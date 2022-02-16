package manman.ohmyjava.leetcode;

public class FindtheHighestAltitude_1732 {
    public static void main(String[] args) {
        FindtheHighestAltitude_1732 obj = new FindtheHighestAltitude_1732();
        int[] gain = {-5, 1, 5, 0, -7};
        System.out.println(obj.largestAltitude(gain));
    }


    public int largestAltitude(int[] gain) {
        int result = 0;
        int maxi = 0;
        for (int i : gain) {
            maxi += i;
            result = Math.max(result, maxi);
        }
        return result;
    }
}
