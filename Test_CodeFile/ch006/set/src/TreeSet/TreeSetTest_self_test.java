package TreeSet;

import Generic.Person;

import java.util.TreeSet;

public class TreeSetTest_self_test {
    public static void main(String[] args) {
        TreeSet<Person> ts=new TreeSet<>();

        //String无法对中文进行排序的操作

        ts.add(new Person("Genco",20));
        ts.add(new Person("MoMo",21));
        ts.add(new Person("zjk",20));
        ts.add(new Person("myx",21));
        //Error：java不知道应该按照什么来对其进行排序的操作

        //返回0的时候,底层使用的是二叉树的数据结构，认为两条数据是相等的，所以不会存储
        //返回正数的时候，将Genco放到根部,只要返回正数的话，视为比前一个数字大，所以会把它放到大于它的地方，放到右侧，
        //如果是负数，则会相反，将xx的放到数据的左侧，小的话都会放到上一条数据的左侧


        //打印的时候将会是中序遍历的方式


        //采用现在的compareable的函数，将会发现年龄相等的无法存入

        System.out.println(ts);

    }
}
