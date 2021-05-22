package com.thunisoft.leetcode.y202004.dingjsh;

import java.util.HashMap;

public class BottleDrop {

    /**
     * 计算N个瓶子，M层楼，在最坏的情况下，最少扔多少次可以测出临界点
     * 瓶子扔下去只有碎或者不碎两种状态，没碎的瓶子可以完好无损的再利用
     * @Param bottles 瓶子个数
     * @Param floors 楼层数
     * @return 最坏情况下，最少扔的次数
     */

    public static int[][] reSub;
    public static int drop(int bottles,int floors) {
        //初始化备忘录
         reSub = new int[bottles+1][floors+1];
         for(int i=0;i<bottles+1;i++){
             for (int j=0;j<floors+1;j++){
                 reSub[i][j]=-1;
             }
         }
         return dropBottlesAndFloors(bottles,floors);
    }
    public static int dropBottlesAndFloors(int bottles,int floors){
        //边界条件
        if(bottles==1){
            return floors;
        }
        if(floors==0){
            return 0;
        }
        //消除重叠子问题
        if(reSub[bottles][floors]!=-1){
            return reSub[bottles][floors];
        }
        int res = Integer.MAX_VALUE;
        for(int i=1;i<floors+1;i++){
            // 要么瓶子碎了，要么没碎，取最坏的情况下的次数
            int temp = Math.max(dropBottlesAndFloors(bottles,floors-i), //没碎
                    dropBottlesAndFloors(bottles-1,i-1));       //碎了
            // 取最优解
            res = Math.min(res,temp+1);
        }
        reSub[bottles][floors] = res;
        return res;
    }

}
