package alg21_30;

import java.util.Scanner;

/**
 * 【程序24】   题目：给一个不多于5位的正整数，要求：一、求它是几位数，二、逆序打印出各位数字。
 */
public class ReverseNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int [] arr = new int[5];
        int count=0;
        for (int i = 0; i < 5; i++) {
            arr[i]=-1;
        }
        int t = x;
        int i = 0;
        while (t>0){
            arr[i]=t%10;
            count++;
            t = t/10;
            i++;
        }
        for (int j = 0; j < 5; j++) {
            if(arr[j]!=-1){
                System.out.print(arr[j]);
            }
        }
        System.out.println();
        System.out.println(count);
    }
}
