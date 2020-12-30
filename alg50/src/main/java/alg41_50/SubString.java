package alg41_50;

/**
 * 【程序49】   题目：计算字符串中子串出现的次数。
 */
public class SubString {
    public static void main(String[] args) {
        String s = "ababcdeafab";
        String sub = "fab";

        int count = 0;
        for (int i = 0; i < s.length()-sub.length()+1; i++) {
            for (int j = 0; j < sub.length(); j++) {
                if(s.charAt(i+j)!=sub.charAt(j))
                    break;
                if(j==sub.length()-1){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
