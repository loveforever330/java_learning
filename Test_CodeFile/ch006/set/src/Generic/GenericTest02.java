package Generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class GenericTest02 {
    public static void main(String[] args) {
        //List<Person> list=new ArrayList<Person>();

        List<Person> list7=new ArrayList<Person>();//jdk7加入的新特性，不需要去写

        //list7.add(1024);//Error:如果存放的是非Person类型的对象，将会编译的时候报错，提早可知

        list7.add(new Person("zjk",20));
        list7.add(new Person("myx",21));
        list7.add(new Person("love",1314));

        Iterator<Person> iter=list7.iterator();
        while (iter.hasNext()){
            Person p=(Person) iter.next();
            p.show();
        }


    }
}
