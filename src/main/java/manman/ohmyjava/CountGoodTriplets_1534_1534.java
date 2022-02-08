package manman.ohmyjava;

public class CountGoodTriplets_1534_1534 {
    public static void main(String[] args) {
        CountGoodTriplets_1534_1534 obj = new CountGoodTriplets_1534_1534();
        int[] arr = {1,1,2,2,3};
        int a = 0, b = 0, c = 1;
        System.out.println(obj.countGoodTriplets(arr, a, b, c));
    }

//    |arr[i] - arr[j]| <= a
//    |arr[j] - arr[k]| <= b
//    |arr[i] - arr[k]| <= c

    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;
            for (int j = i + 1; j < arr.length; j++) {
                flag = Math.abs(arr[i] - arr[j]) <= a ? true : false;  //Condition # 1
                if (flag) {
                    for (int k = j + 1; k < arr.length; k++)
                        result = (Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[i] - arr[k]) <= c) ? result + 1 : result; //Condition # 1 & 3
                }
            }
        }
        return result;
    }
}
