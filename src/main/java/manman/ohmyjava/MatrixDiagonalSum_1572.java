package manman.ohmyjava;

public class MatrixDiagonalSum_1572 {
    public static void main(String[] args) {
        MatrixDiagonalSum_1572 obj = new MatrixDiagonalSum_1572();
        int[][] mat = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        System.out.println(obj.diagonalSum(mat));
    }


    public int diagonalSum(int[][] mat) {
        int result = 0;
        int len = mat.length - 1;
        for (int i = 0; i < mat.length; i++) {
            if (!(i == len))
                result = result + mat[i][i] + mat[i][len];
            else
                result = result + mat[i][i];
            len = len - 1;
        }
        return result;
    }
}
