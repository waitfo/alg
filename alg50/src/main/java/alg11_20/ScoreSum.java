package alg11_20;

import java.util.Scanner;

/**
 * 【程序20】   题目：有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和。
 */
public class ScoreSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        //System.out.println(sum(1,2,1,3)[0]+" "+sum(1,2,1,3)[1]);
        //构造数列
        int[][] fenshu = new int[n][2];
        fenshu[0][0] = 2;   //第一个数的分子
        fenshu[0][1] = 1;   //第一个数的分母

        fenshu[1][0] = 3;
        fenshu[1][1] = 2;

        for (int i = 2; i < n; i++) {
            fenshu[i][0]=fenshu[i-1][0]+fenshu[i-2][0];
            fenshu[i][1]=fenshu[i-1][1]+fenshu[i-2][1];
        }

        int [] re = new int[2];
        re[0] = fenshu[0][0];
        re[1] = fenshu[0][1];

        for (int i = 1; i < n; i++) {
            re=sum(re[0],re[1],fenshu[i][0],fenshu[i][1]);
        }

        System.out.println(re[0]+" "+re[1]);

    }

    //求两个分数的和  a1第一个分数的分子，a2第一个分数的分母
    public static int [] sum(int a1,int a2,int b1,int b2){
        int [] re = new int[2];
        //先求分子分母的最小公倍数
        int mul = mul(a2,b2);
        re[0]=(a1*mul/a2+b1*mul/b2);
        re[1]=mul;
        return re;
    }
    public static int mul(int a,int b){
        int t1 = a;
        int t2 = b;
        if (t1<t2){
            int t = t1;
            t1 = t2;
            t2 = t;
        }
        while (t1%t2!=0){
            int tw = t1%t2;
            t1=t2;
            t2=tw;
        }
        return a*b/t2;
    }
}
