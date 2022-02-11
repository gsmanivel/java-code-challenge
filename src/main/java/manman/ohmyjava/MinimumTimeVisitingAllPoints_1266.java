package manman.ohmyjava;

public class MinimumTimeVisitingAllPoints_1266 {
    public static void main(String[] args) {
        MinimumTimeVisitingAllPoints_1266 obj = new MinimumTimeVisitingAllPoints_1266();
        int[][] points = {{3, 2}, {-2, 2}};
        int result = obj.minTimeToVisitAllPoints(points);
        System.out.println(result);
    }

    public int minTimeToVisitAllPoints(int[][] points) {
        int result = 0;
        for (int i = 0; i < points.length - 1; i++) {
            int diff1 = Math.abs(points[i + 1][0] - points[i][0]);
            int diff2 = Math.abs(points[i + 1][1] - points[i][1]);
            result += Math.max(diff1, diff2);
        }
        return result;
    }
}
