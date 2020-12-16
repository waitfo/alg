package alg1_10;

/**
 * 【程序7】   题目：输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
 */

public class Statistical {
    public static void main(String[] args) {
        String s = "123456789abcdefghijklmn   *(*^^()";
        int w = 0;
        int b = 0;
        int d = 0;
        int o = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==32){
                b++;
            }else if(48<=s.charAt(i)&&s.charAt(i)<=57){
                d++;
            }else if((65<=s.charAt(i)&&s.charAt(i)<=90)||(97<=s.charAt(i)&&s.charAt(i)<=122)){
                w++;
            }else {
                o++;
            }
        }
        System.out.println("英文字母有："+w);
        System.out.println("空格有："+b);
        System.out.println("数字有："+d);
        System.out.println("其他有："+o);
    }
}
