package Generic;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;



public class GenericTest01 {
    public static void main(String[] args) {
        List list=new ArrayList<>();
        list.add("zjk");
        list.add(1024);
        list.add(new Person("ab",12));
        //用于处理一个链表中存在着多种不同的数据类型的情况

        ListIterator iter=list.listIterator();

        //缺点在于需要做很多的类型上面的判断工作，需要进行多次的类型判断
        //如何限制集合或者List里面存放同一种类型的数据，使用泛型将可以实现一个List里面只能够放同一种的数据


        while(iter.hasNext()){
            Object o=iter.next();
            if(o instanceof  String){
                String s=(String) o;

            }
            if(o instanceof  Integer){
                Integer I=(Integer) o;
            }
            if(o instanceof  Person)
            {
                Person p=(Person) o;
            }
        }
    }

}
