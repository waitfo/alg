package alg11_20;

/**
 * 【程序19】  题目：打印出如下图案（菱形）
 */
public class PrintDiamond {
    public static void main(String[] args) {
        int blank = 20;
        int diamond = 1;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < blank; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < diamond; j++) {
                System.out.print("#");
            }
            blank--;
            diamond+=2;
            System.out.println();
        }
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < blank; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < diamond; j++) {
                System.out.print("#");
            }
            blank++;
            diamond-=2;
            System.out.println();
        }
    }
}
