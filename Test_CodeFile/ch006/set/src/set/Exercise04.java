package set;


import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * 问题：将一个字符串中的字符，按照字典顺序进行排序，保留重复的字符，输入java，将会输出aajv
 * 分析：使用TreeSet进行排序，重写一个CompareTo方法，如果是0的话返回1即可
 */
public class Exercise04 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String line=s.nextLine();
        char[] array=line.toCharArray();
        TreeSet<Character> ts=new TreeSet<>(new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                int num=o1.compareTo(o2);
                //如果结果为0的话，返回1即可，防止重复数据不会存储到set中
                return num==0?1:num;
            }
        });//需要重写一个CompareTo方法，

        //将数组中的元素放到TreeSet中
        for(Character c:array){
            ts.add(c);
        }

        System.out.println(ts);
    }
}
