package alg11_20;

import java.util.List;

/**
 *【程序11】   题目：有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
 */
public class Combination {
    public static void main(String[] args) {
        int [] arr = new int[]{1,2,3,4};
        int count = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    if(i!=j&&i!=k&&j!=k){
                        count++;
                        System.out.println(arr[i]+""+arr[j]+""+arr[k]+"");
                    }
                }
            }
        }
        System.out.println(count);
    }
}
