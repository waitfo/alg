package alg41_50;

/**
 * 【程序42】   题目：809*??=800*??+9*??+1。其中??代表的两位数,8*??的结果为两位数，
 * 9*??的结果为3位数。求??代表的两位数，及809*??后的结果。
 * （本题为无解，去掉1有解）
 */
public class CalculateNum {
    public static void main(String[] args) {
        for (int i = 10; i < 100; i++) {
            if((809*i)==(800*i+9*i)){
                if((8*i>9)&&(8*i<100)&&(9*i>99)&&(9*i<1000)){
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
