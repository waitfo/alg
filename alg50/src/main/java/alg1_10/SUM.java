package alg1_10;

import java.util.Scanner;

/**
 * 【程序8】   题目：求s = a + aa + aaa + aaaa + aa...a的值，其中a是一个数字。
 * 例如2 + 22 + 222 + 2222 + 22222(此时共有5个数相加)，几个数相加有键盘控制。
 */
public class SUM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        int c = scanner.nextInt();
        int sum = 0;

        int t=d;
        for (int i = 0; i < c; i++) {
            sum=sum+t;
            t = t*10+d;
            System.out.println(t);
        }
        System.out.println(sum);

    }
}
