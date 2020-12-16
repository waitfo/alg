package alg1_10;

/**
 * 【程序6】   题目：输入两个正整数m和n，求其最大公约数和最小公倍数
 */
public class MaximumCommonAndLeast {
    public static void main(String[] args) {
        int m=16;
        int n=12;//m=>n

        int mt = m;
        int nt = n;
        while(mt%nt!=0){
            int t = mt;
            mt = nt;
            nt = t%nt;
        }
        System.out.println("最大公约数是"+nt);
        System.out.println("最小公倍数是"+m*n/nt);
    }
}
