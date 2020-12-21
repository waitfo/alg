package alg21_30;

import java.util.Scanner;

/**
 * 【程序21】   题目：求1+2!+3!+...+20!的和。
 */
public class MultSUM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        Integer sum = 0;
        for (int i = 1; i <= a; i++) {
            sum = sum+mult(i);
        }
        System.out.println(sum);
    }

    public static Integer mult(int n){
        if(n==1||n==0){
            return 1;
        }
        return mult(n-1)*n;
    }
}
