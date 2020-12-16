package alg1_10;

/**
 * 【程序10】 题目：一球从100米高度自由落下，每次落地后反跳回原高度的一半；
 * 再落下，求它在第10次落地时，共经过多少米？第10次反弹多高？
 */
public class FreeFall {
    public static void main(String[] args) {
        int h = 100;
        double s = 0;
        double h1 = h;
        for (int i = 0; i < 2; i++) {
            s = s+h1;
            h1 = h1/2;
            s = s+h1;
        }
        System.out.println("共经过"+s+";第10次反弹"+h1);
    }
}
