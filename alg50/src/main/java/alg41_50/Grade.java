package alg41_50;

import java.io.*;

/**
 * 【程序50】    题目：有五个学生，每个学生有3门课的成绩，从键盘输入以上数据（包括学生号，姓名，三门课成绩），
 * 计算出平均成绩，把原有的数据和计算出的平均分数存放在磁盘文import java.io.File;
 */
public class Grade {
    public static void main(String[] args) throws IOException {
        String student1 = "student1";
        String student2 = "student2";
        String student3 = "student3";
        String student4 = "student4";
        String student5 = "student5";

        int sno1 = 101;
        int sno2 = 102;
        int sno3 = 103;
        int sno4 = 104;
        int sno5 = 105;

        int [][]arr = new int[][]{
                {60,60,60},
                {70,70,70},
                {80,80,80},
                {90,90,90},
                {100,100,100}
        };
        File file = new File("./grade.txt");
        FileWriter fileWriter = new FileWriter(file);

        fileWriter.write(student1+","+sno1+","+arr[0][0]+" "+arr[0][1]+" "+arr[0][2]);
        fileWriter.write("\r\n");
        fileWriter.close();


    }
}
