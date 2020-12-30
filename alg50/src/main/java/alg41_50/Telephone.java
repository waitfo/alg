package alg41_50;

/**
 * 【程序48】   题目：某个公司采用公用电话传递数据，数据是四位的整数，
 * 在传递过程中是加密的，加密规则如下：每位数字都加上5，然后用和除以10的余数代替该数字，
 * 再将第一位和第四位交换，第二位和第三位交换。
 */
public class Telephone {
    public static void main(String[] args) {
        int a = 2369;
        int [] arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            arr[arr.length-i-1] = a%10;
            a=a/10;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i]+5)%10;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        int t = arr[0];
        arr[0] = arr[3];
        arr[3] = t;
        t = arr[1];
        arr[1] = arr[2];
        arr[2] = t;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
