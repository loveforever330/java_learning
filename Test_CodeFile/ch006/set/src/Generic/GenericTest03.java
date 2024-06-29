package Generic;

import com.sun.xml.internal.bind.v2.runtime.reflect.ListIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericTest03 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        //? extends E
        //向下限定，E及其子类，可以用于存储当前的子类
        //？ super E
        //向上限定，E及其父类，可以用于存储当前的父类
        List<Person> p=new ArrayList<>();
        p.add(new Person("zjk",20));
        p.add(new Person("myx",21));
        p.add(new Person("love",1314));


        List<Student> s=new ArrayList<>();
        s.add(new Student("xxx",0));
        p.addAll(s);//这里是可以用于继承它的子类

        Iterator<Person> iter=p.iterator();
        while (iter.hasNext()) {
            Person p_r=(Person)iter.next();
            p_r.show();

           //这里就可以发现已经把子类型给加入到其中了

        }
    }
}
