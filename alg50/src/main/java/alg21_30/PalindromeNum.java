package alg21_30;

import java.util.Scanner;

/**
 * 【程序25】   题目：一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。
 */
public class PalindromeNum {
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

        if(arr[0]==arr[4]&&arr[1]==arr[3])
            System.out.println(true);
        else
            System.out.println(false);
    }
}
