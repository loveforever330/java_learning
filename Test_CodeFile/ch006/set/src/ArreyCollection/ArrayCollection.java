package ArreyCollection;

import sun.plugin.javascript.navig.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayCollection {

    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("E");
        //如果定义的数组长度,小于等于list的size时，系统将会默认的将数组长度修改为和list的size保持一致
        //如果定义的数组长度大于listsize时，系统上将不会进行修改操作

        String[] s=list.toArray(new String[0]);
        //这里的做法是将其转换,转换为String[0]的方式,动态创建规模一致的
        //如果采用无参的toArray方法，return的结果是Object,将会抛出异常
        System.out.println(s.length);

        Integer[] int_arrey= {120, 12, 2, 12, 12};

        List<Integer> int_list= Arrays.asList(int_arrey);

        System.out.println(int_list);

        String [] strings={"A","b","C"};
        List<String> string_List=Arrays.asList(strings);

        //string_List.add(2,"E");//这样子的add就会报错，因为这个并不是传统的ArreyList对象
        System.out.println(string_List);

    }
}
