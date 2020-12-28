package alg31_40;

/**
 * 【程序39】  题目：编写一个函数，输入n为偶数时，调用函数求1/2+1/4+...+1/n,当输入n为奇数时，调用函数1/1+1/3+...+1/n
 */
public class Sum {
    public static void main(String[] args) {
        int n=6;
        int [] arr = new int[2];
        if(n%2==0){
            arr[0] = 1;
            arr[1] = 2;
            for (int i=4;i<=n;i+=2){
                arr = sumOdd(arr[0],arr[1],1,i);
            }
        }else{
            arr[0] = 1;
            arr[1] = 1;
            for (int i=3;i<=n;i+=2){
                arr = sumOdd(arr[0],arr[1],1,i);
            }
        }
        System.out.println(arr[0]+"/"+arr[1]);
    }

    //分数相加
    public static int[] sumOdd(int top1,int boom1,int top2,int boom2){
        int [] arr = new int[2];
        int mul = cbs(boom1,boom2);
        arr[0] = top1*(mul/boom1)+top2*(mul/boom2);
        arr[1] = mul;
        return arr;
    }
    //最小公倍数
    public static int cbs(int a,int b){
        int t1 = a;
        int t2 = b;
        if (a<b){
            int t = a;
            a = b;
            b = t;
        }
        while (a%b!=0){
            int t = a%b;
            a = b;
            b = t;
        }
        return t1*t2/b;
    }
}
