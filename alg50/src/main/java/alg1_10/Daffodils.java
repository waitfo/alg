package alg1_10;

/**
 * 【程序3】   题目：打印出所有的 水仙花数 ，所谓 水仙花数 是指一个三位数，其各位数字立方和等于该数本身。
 * 例如：153是一个 水仙花数 ，因为153=1的三次方＋5的三次方＋3的三次方。
 */
public class Daffodils {
    public static void main(String[] args) {
        for(int i=100;i<1000;i++){
            int num=0;
            int ti=i;
            for(int j=0;j<3;j++){
                int t = ti%10;
                num=t*t*t+num;
                ti=ti/10;
            }
            if(num==i)
                System.out.println(i);
        }
    }
}
