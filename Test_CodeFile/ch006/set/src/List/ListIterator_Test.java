package List;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIterator_Test {
    public static void main(String[] args) {
        List list=new ArrayList<>();//多态类型

        list.add("a");
        list.add("d");
        list.add("e");
        list.add("gg");
        list.add("zjk");
        list.add("myx");
        list.add("love");

        //如果想要是有listiterator的话，需要先正着的来正序输出一次，然后再逆序输出
       ListIterator l_iter=list.listIterator();
//如果没有先前移动到最后一位的话，无法输出对应的值
//        while(l_iter.hasNext()){
//            System.out.println(l_iter.next());
//        }
        System.out.println("---------");
        while (l_iter.hasPrevious()){
            System.out.println(l_iter.previous());
        }



    }
}
