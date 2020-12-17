package alg11_20;

/**
 * 【程序14】 题目：输入某年某月某日，判断这一天是这一年的第几天？
 */
public class HowDays {
    public static void main(String[] args) {
        int year = 2020;
        int month = 12;
        int day = 17;

        int [] months = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};

        if(year%4==0){
            months[1] = 29;
        }
        int sum = 0;
        for(int i=0;i<month-1;i++){
            sum = sum + months[i];
        }
        System.out.println(sum+day);
    }
}
