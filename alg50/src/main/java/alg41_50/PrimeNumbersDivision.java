package alg41_50;

/**
 * 【程序45】   题目：（1）判断几个9能被一个素数整除。（2）判断一个整数能被几个9整除。（原题：一个素数能被几个9整除）
 */
public class PrimeNumbersDivision {
    static int[] arr = new int[100];      //100以内的素数
    public static void main(String[] args) {
        int j = 0;
        for (int i = 0; i < 100; i++) {
            if(isPrimeNumbers(i)){
                arr[j]=i;
                j++;
            }
        }
        //(一)   100个9太大了，Long都装不下
//        String jiu = "";
//        for (int i = 0; i < 100; i++) {     //100个9
//            jiu = jiu + "9";
//            Long t = Long.parseLong(jiu);
//            for (int k = 0; k < 100; k++) {
//                if(arr[k]!=0&&t%arr[k]==0){
//                    System.out.println(t+"能被"+arr[k]+"整除");
//                }
//            }
//        }

        //(二)
        String ssjiu = "";
        for (int i = 0; i < 10; i++) {     //10个9
            ssjiu = ssjiu + "9";
            Long t = Long.parseLong(ssjiu);
            for (int k = 1; k < 100000; k++) {
                if(k%t==0){
                    System.out.println(k+"能被"+t+"整除");
                }
            }
        }
    }

    public static boolean isPrimeNumbers(int a){
        if(a==0||a==1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
}
