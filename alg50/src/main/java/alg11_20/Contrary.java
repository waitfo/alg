package alg11_20;

/**
 * 【程序13】   题目：一个整数，它加上100后是一个完全平方数，加上168又是一个完全平方数，请问该数是多少？
 */
public class Contrary {
    public static void main(String[] args) {
        for (int i = 0; true; i++) {
            int x = i+100;
            int y = i+168;

            double xd = Math.sqrt(x);
            double yd = Math.sqrt(y);
            if(xd-(int)xd==0&&yd-(int)yd==0){
                System.out.println(i);
                return;
            }
        }
    }
}
