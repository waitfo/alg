package alg41_50;


/**
 * 【程序43】   题目：求0—7所能组成的奇数个数。 todo 排列组合
 */
public class Arrange{
    public static void main(String[] args) {
        //baoli();
    }

    
    //暴力解法
    public static void baoli(){
        int sum = 0;
        for (int i = 0; i <=76543210; i++) {
            String s = Integer.toString(i);
            boolean flag = true;
            for (int j = 0; j < s.length(); j++) {      //包含89不符合要求
                if(s.charAt(j)>'7') {
                    flag=false;
                }
            }
            if(flag==true&&i%2==0){
                sum++;
            }else if(flag==false){
                System.out.println(i);
            }
        }

        System.out.println(sum);
    }

    public static void xunhun(){
        //每个位置都可能出现，所以使用循环，给每个位置都添加上一个数
        int [] arr = new int[]{0,1,2,3,4,5,6,7};
        int [] out = new int[]{-1,-1,-1,-1,-1,-1,-1,-1};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                out[j]=arr[i];
            }
        }
    }
}
