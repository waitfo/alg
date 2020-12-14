package alg1_10;

/**
 * 【程序2】   题目：判断101-200之间有多少个素数，并输出所有素数。
 */

public class PrimeNumbers {
    public static void main(String[] args) {
        int start = 101;
        int end = 200;
        int sum = 0;
        for(int i=101;i<=200;i++){
            int j=2;
            for(;j<Math.sqrt(i);j++){
                if(i%j==0) break;
            }
            if(j>=Math.sqrt(i)){
                System.out.print(i+" ");
                sum++;
            }
        }
        System.out.println(sum);
    }
}
