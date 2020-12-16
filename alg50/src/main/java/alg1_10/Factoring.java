package alg1_10;

/**
 * 【程序4】   题目：将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。
 */
public class Factoring {
    public static void main(String[] args) {
        for(int i=2;i<1000;i++){
            int t = i;
            System.out.print("现在是:"+i+"=");
            for(int j=2;j<=i;){
                if(t%j==0){
                    t=t/j;
                    System.out.print(j+"*");
                }else {
                    j++;
                }
            }
            System.out.println();
        }
    }
}
