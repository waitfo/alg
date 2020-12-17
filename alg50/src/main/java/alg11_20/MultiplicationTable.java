package alg11_20;

/**
 * 【程序16】 题目：输出9*9口诀乘法表。
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        for(int i=1;i<10;i++){
            for (int j = 1; j < 10; j++) {
                if(j<=i){
                    System.out.print(j+"*"+i+"="+i*j+",");
                }
            }
            System.out.println();
        }
    }
}
