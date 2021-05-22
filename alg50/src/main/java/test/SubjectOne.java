package test;

import java.util.HashSet;
import java.util.Set;

public class SubjectOne {

    static Set<String> set = new HashSet<String>();

    public static void main(String[] args) {

        /**
         * 1.首先找出起点(x1,y1)和终点(x2,y2)
         * 2.如果规定向右为0，向下为1，则所有路径为x2-x1个0和y2-y1个1的集合的全排列
         */

        int[][] grid = {
                {2,2,5,8,9,1,2,3,9,0,1},
                {8,11,0,6,0,3,6,8,4,5,3},
                {5,7,4,11,8,4,9,0,9,5,9},
                {9,20,10,12,45,78,6,9,0,9,7},
                {23,8,22,12,3,4,7,6,7,0,9},
                {2,6,12,3,4,6,7,4,7,2,0},
                {45,5,3,5,2,3,2,21,11,1,9},
                {67,0,5,6,34,65,78,34,65,7,9},
                {23,34,78,9,2,3,3,3,2,99,0},
                {23,9,6,3,8,87,101,102,7,7,8},
        };

        //模拟输入的起始数字，终止数字
        int start = 65;
        int end = 99;

        //找到开始的位置和结束的位置
        int x1=0,x2=0,y1=0,y2=0;
        boolean flag = false;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j]==start && flag==false){
                    x1 = j;
                    y1 = i;
                    flag = true;
                }
                if(grid[i][j]==end){
                    x2 = j;
                    y2 = i;
                }
            }
        }

        //1和0的个数
        int zero =  x2-x1;
        int one = y2-y1;
        int[] ints = new int[zero+one];
        for (int i = 0; i < zero; i++) {
            ints[i]=0;
        }
        for (int i = 0; i < one; i++) {
            ints[i+zero]=1;
        }

        // 全排列
        permutation(ints,0);

        Object[] objects = set.toArray();
//        for (int i = 0; i < set.size(); i++) {
//            System.out.println(objects[i].toString());
//        }

//        起始点坐标: 5,7
//        结束点坐标: 9,8
//        总路径数: 5
//        所有路径:

        System.out.println("起始点坐标: "+x1+","+y1);
        System.out.println("结束点坐标: "+x2+","+y2);
        System.out.println("总路径数: "+set.size());
        System.out.println("所有路径:");

        for (int i = 0; i < objects.length; i++) {
            String print = ""+grid[y1][x1]+"->";
            String str = (String) objects[i];

            // 当前位置
            int tx = x1;//列
            int ty = y1;//行
            for (int j = 0; j < str.length(); j++) {
                if('1'==str.charAt(j)){
                    ty++;
                    print=print+grid[ty][tx]+"->";
                }
                if('0'==str.charAt(j)){
                    tx++;
                    print=print+grid[ty][tx]+"->";
                }
            }

            System.out.println(print.substring(0,print.length()-2));
        }


    }


    public static void permutation(int[]ss,int i){
        if(ss==null||i<0 ||i>ss.length){
            return;
        }

        if(i==ss.length-1){
            String temp = "";
            for (int j = 0; j < ss.length; j++) {
                temp = temp + ss[j];
            }
            set.add(temp);
        }else{
            for(int j=i;j<ss.length;j++){//3
                int temp=ss[j];
                ss[j]=ss[i];
                ss[i]=temp;
                permutation(ss,i+1);//4
                temp=ss[j];
                ss[j]=ss[i];
                ss[i]=temp;
            }
        }
    }
}
