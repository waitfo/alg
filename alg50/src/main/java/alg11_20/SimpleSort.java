package alg11_20;

/**
 * 【程序15】 题目：输入三个整数x,y,z，请把这三个数由小到大输出。
 */
public class SimpleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{3,23,23,65,88,12,3,4,6,12,3,23,754,123,23};
        for(int i=0;i< arr.length-1;i++){
            for (int j = 0;j< arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

}
