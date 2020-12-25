package alg31_40;

/**
 * 【程序33】   题目：打印出杨辉三角形（要求打印出10行如下图）
 * 1
 * 1   1
 * 1   2   1
 * 1   3   3   1
 * 1   4   6   4   1
 * 1   5   10   10   5   1
 */
public class YangHuiTriangle {
    public static void main(String[] args) {
        int [] arr = new int[10];
        int [] arr2 = new int[10];
        for (int i = 1; i < 11; i++) {
            for (int j = 0; j < i; j++) {
                if(j==0||j==i-1){
                    arr[j]=1;
                    arr2[j]=1;
                }else if(i%2==0){
                    arr[j]=arr2[j]+arr2[j-1];
                }else if(i%2!=0){
                    arr2[j]=arr[j]+arr[j-1];
                }
            }
            for (int j = 0; j < i && i%2==0; j++) {
                System.out.print(" "+arr[j]);
            }
            for (int j = 0; j < i && i%2!=0; j++) {
                System.out.print(" "+arr2[j]);
            }
            System.out.println();
        }
    }
}
