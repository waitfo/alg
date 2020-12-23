package alg21_30;

/**
 * 【程序27】   题目：求100之内的素数
 */
public class PrimeNumbers {
    public static void main(String[] args) {
        int num = 100;
        boolean flag = true;
        for(int i=2;i<num;i++){
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if(i%j==0){
                    flag = false;
                }
            }
            if(flag == true){
                System.out.println(i);
            }
            flag = true;
        }
    }
}
