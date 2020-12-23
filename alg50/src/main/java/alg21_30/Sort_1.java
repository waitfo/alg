package alg21_30;

/**
 *【程序28】   题目：对10个数进行排序。
 */
public class Sort_1 {
    private static int [] arr = new int[]{2,3,5,33,6,9,1,4,6,90,232};

    public static void main(String[] args) {
        //bubble(arr);
        quick(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    /**
     * 冒泡排序
     * @param arrt
     */
    public static void bubble(int [] arrt){
        for (int i = 0; i < arrt.length-1; i++) {
            for (int j = 0; j <arrt.length-i-1; j++) {
                if(arrt[j]>arrt[j+1]){
                    int t = arrt[j];
                    arrt[j] = arrt[j+1];
                    arrt[j+1] = t;
                }
            }
        }
    }

    /**
     * 快排
     */
    public static void quick(int [] arrt,int start,int end){
        if(start>=end){     //只有一个元素直接返回
            return;
        }
        int i = start;
        int j = end;
        int t = arrt[start];    //最左边的是基准

        //从两边向中间，直到i>=j
        while (i<j){
            //j向左移动，直到遇到比基准小的
            while (t<=arrt[j]&&j>i){
                j--;
            }
            //i向右移动，直到遇到比基准大的
            while(t>=arrt[i]&&i<j){
                i++;
            }
            //i和j指向的元素互换
            if(i<j){
                int temp = arrt[i];
                arrt[i] = arrt[j];
                arrt[j] = temp;
            }
        }
        // 将基准数放到中间的位置（基准数归位）(i或者j)无所谓
        arrt[start] = arrt[i];
        arrt[i] = t;
        quick(arrt,start,i-1);
        quick(arrt,i+1,end);
    }
}
