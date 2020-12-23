package alg21_30;

/**
 * 【程序29】   题目：求一个3*3矩阵主对角线元素之和。
 */
public class MatrixSUM {
    public static void main(String[] args) {
        int [][] arr = new int[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum+arr[i][i];
        }
        System.out.println(sum);
    }
}
