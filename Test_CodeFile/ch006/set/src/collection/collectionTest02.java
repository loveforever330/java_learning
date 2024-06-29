package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class collectionTest02 {
    public static void main(String[] args) {
        Collection c_1=new ArrayList();
        c_1.add("a");   //集合里面去添加元素的内容
        c_1.add("b");
        c_1.add("c");
        c_1.add("d");
        c_1.add("e");
        c_1.add("f");

        Collection c_2=new ArrayList<>();
        c_2.add("d");
        c_2.add("e");
        c_2.add("f");

        if(c_1.retainAll(c_2)){

            for( Iterator iter= c_1.iterator();iter.hasNext();){

                System.out.println(iter.next());

            }
        };
    }
}
