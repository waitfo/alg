package alg31_40;

/**
 * 【程序38】   题目:写一个函数，求一个字符串的长度，在main函数中输入字符串，并输出其长度。
 */
public class StringLength {
    public static void main(String[] args) {
        String s = "avasdifewidfs;d";
        int sum = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            char sc = chars[i];
            sum++;
        }
        System.out.println(sum);
    }
}
