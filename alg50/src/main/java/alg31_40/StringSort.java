package alg31_40;

import java.util.ArrayList;
import java.util.List;

/**
 * 【程序40】  题目：字符串排序。
 */
public class StringSort {
    public static void main(String[] args) {
        List<String> lists = new ArrayList<String>();
        lists.add("32r32");
        lists.add("dsfjai3");
        lists.add("3dsfiew");
        lists.add("rwet32");
        lists.add("sdfsdf");
        lists.add("3wefs");
        lists.add("sf32rfsd");
        lists.add("a");
        lists.add("ab");
        lists.add("ac");
        lists.add("ad");
        lists.add("abc");


        for (int i = 0; i < lists.size(); i++) {
            for (int j = 0; j < lists.size()-i-1; j++) {
                if(!compare(lists.get(j),lists.get(j+1))){
                    String s =lists.get(j);
                    lists.set(j,lists.get(j+1));
                    lists.set(j+1,s);
                }
            }
        }

        for (int i = 0; i < lists.size(); i++) {
            System.out.println(lists.get(i));
        }
    }
    //a>b则返回false
    public static boolean compare(String a,String b){
        for (int i=0;i<a.length()&&i<b.length();i++){
            if(a.charAt(i)<b.charAt(i)){
                return true;
            }else if(a.charAt(i)>b.charAt(i)){
                return false;
            }
        }
        if(a.length()>b.length()){
            return false;
        }else {
            return true;
        }
    }
}
