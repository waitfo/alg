package alg41_50;

/**
 * 【程序44】   题目：一个偶数总能表示为两个素数之和。
 * （注：哥德巴赫猜想是想证明对任何大于6的自然数n之内的所有偶数可以表示为两个素数之和）
 */

public class PrimeNumbersAdd {
    public static void main(String[] args) {
        int a = 100;
        for (int i = 2; i < a/2+1; i++) {
            if(isPrimeNumbers(i)&&isPrimeNumbers(a-i)){
                System.out.println(i+"+"+(a-i)+"="+a);
            }
        }
    }

    public static boolean isPrimeNumbers(int a){
        for (int i = 2; i < Math.sqrt(a); i++) {
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
}
