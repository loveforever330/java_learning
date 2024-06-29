package set;

import Generic.Person;

import java.util.TreeSet;

public class TreeSetTest03 {
    public static void main(String[] args) {
        //调用有参的构造方法，将自定义比较器的对象传入其中即可

        TreeSet<Person>  ts=new TreeSet<>(new CompareByLength());
        ts.add(new Person("Genco",20));
        ts.add(new Person("MoMo",10));
        ts.add(new Person("zjk",20));
        ts.add(new Person("myx",21));

        System.out.println(ts);
    }
}
