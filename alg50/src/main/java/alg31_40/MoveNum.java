package alg31_40;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * 【程序36】   题目：有n个整数，使其前面各数顺序向后移m个位置，最后m个数变成最前面的m个数
 */
public class MoveNum {
//    public static void main(String[] args) {
//        LinkedList<Integer> integers = new LinkedList<>();
//        LinkedList<Integer> integersF = new LinkedList<>();
//        LinkedList<Integer> integersA = new LinkedList<>();
//        for (int i = 0; i < 10; i++) {
//            integers.add(i);
//        }
//
//        int m = 5;
//        //先取前m个数
//        for (int i = 0; i < m; i++) {
//            integersF.add(integers.get(i));
//        }
//        //再取后m个数
//        for (int i = 0; i < m; i++) {
//            integersA.add(integers.get(integers.size()-m+i));
//        }
//        System.out.println();
//        for (int i = 0; i < m; i++) {
//            integers.set(i,integersA.get(i));
//            integers.set(integers.get(integers.size()-m+i),integersF.get(i));
//        }
//
//        Iterator<Integer> iterator = integers.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//    }
}
