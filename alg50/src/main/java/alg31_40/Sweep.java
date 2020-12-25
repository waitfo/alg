package alg31_40;

/**
 * 【程序35】   题目：输入数组，最大的与第一个元素交换，最小的与最后一个元素交换，输出数组。
 */
public class Sweep {
    public static void main(String[] args) {
        int [] arrs = {1,3,56,324,77,232,23,76,32};
        quickSort(arrs,0,arrs.length-1);
        for (int i = 0; i < arrs.length; i++) {
            System.out.println(arrs[i]);
        }

        int max = arrs[0];
        int maxI = 0;
        int min = arrs[0];
        int minI = 0;

        for (int i = 0; i < arrs.length; i++) {
            if(max<arrs[i]){
                max=arrs[i];
                maxI = i;
            }
            if(min>arrs[i]){
                min=arrs[i];
                minI = i;
            }
        }

        //最大的与第一个元素交换
        arrs[maxI] = arrs[0];
        arrs[0] = max;

        //最小的与最后一个元素交换
        if(minI == 0){
            minI = maxI;
        }
        arrs[minI] = arrs[arrs.length-1];
        arrs[arrs.length-1] = min;

        for (int i = 0; i < arrs.length; i++) {
            System.out.println(arrs[i]);
        }
    }

    public static void quickSort(int [] arr,int left,int right){
        int l = left;
        int r = right;
        int m = arr[left];

        if(l>=r){
            return;
        }

        while (l<r){
            while (arr[r]>=m&&r>l){
                r--;
            }
            while (arr[l]<=m&&l<r){
                l++;
            }
            if(l<r){
                int t = arr[r];
                arr[r] = arr[l];
                arr[l] = t;
            }

        }
        arr[left] = arr[r];
        arr[r] = m;
        quickSort(arr,left,r-1);
        quickSort(arr,r+1,right);
    }
}
