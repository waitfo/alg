package alg1_10;

/**
 * 【程序1】   题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，
 * 假如兔子都不死，问每个月的兔子总数为多少？
 */

public class Rabbit {
    public static void main(String[] args) {
        System.out.println(rabbit(8));
    }

    public static int rabbit(int n){
        if(n==1){
            return 1;
        }
        if(n==2){
            return 1;
        }
        return rabbit(n-1)+rabbit(n-2);
    }
}
