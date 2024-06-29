package collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest01 {
    private String name;
    private int age;

    public  CollectionTest01(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Collection c=new ArrayList();
        c.add("a");
        c.add("b");
        c.add("d");
        c.add("asd");
        System.out.println(c.size());
        c.remove("b");//移除b
        Object [] a=c.toArray();
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        //清空全部的元素
        c.clear();


        //下面是对其非常用类的,即为自己的自定义类的对象与方法

        Collection collection=new ArrayList();

        collection.add(new CollectionTest01("abc",12));
        collection.add(new CollectionTest01("abde",12));
        System.out.println(collection.size());




    }
}
