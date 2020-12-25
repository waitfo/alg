package alg31_40;

/**
 * 【程序37】   题目：有n个人围成一圈，顺序排号。从第一个人开始报数（从1到3报数），
 * 凡报到3的人退出圈子，问最后留下的是原来第几号的那位。
 */
public class JosephCircle {
    public static void main(String[] args) {
        int n = 4;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }

        int i = 0;
        int s = 0;
        int out = 0;
        while (true){
            if(out>=n-1){
                break;
            }
            if(arr[i%n]!=-1){
                s++;
                if(s==3){
                    arr[i%n]=-1;
                    s=0;
                    out++;
                }
            }
            i++;
        }

        for (int j = 0; j < n; j++) {
            System.out.println(arr[j]);
        }
    }
}
