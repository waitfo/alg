package alg21_30;

/**
 * 【程序30】   题目：有一个已经排好序的数组。现输入一个数，要求按原来的规律将它插入数组中。
 * 先排序！！！
 */
public class InsertArr {
    static int [] arr = new int[]{2,34,23,654,23,1,65,12,324,45,8};
    public static void main(String[] args) {
        quickSort(arr,0,arr.length-1);
        int insert = 45;
        int[] ints = new int[arr.length + 1];
        int j = 0;
        for (int i = 0; i < ints.length; i++) {
            if(insert>arr[j]&&j<arr.length){
                ints[i] = arr[j];
                j++;
            }else {
                ints[i] = insert;
                insert = arr[arr.length-1]+1;
            }
        }
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }

    /**
     * 快排
     */
    public static void quickSort(int[] a,int start,int end){
        if(start>=end){
            return ;
        }

        int mi = a[start];
        int l = start;
        int r = end;

        while (l<r){
            while (a[r]>=mi&&r>l){
                r--;
            }
            while (a[l]<=mi&&l<r){
                l++;
            }
            if(l<r){
                int t = a[l];
                a[l] = a[r];
                a[r] = t;
            }
        }
        a[start] = a[r];
        a[r] = mi;
        quickSort(a,start,r-1);
        quickSort(a,r+1,end);
    }
}
