package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListTest02 {

    public static void main(String[] args) {
        List list=new ArrayList<>();
        list.add("1");
        list.add("yue");
        list.add("zjk");
        list.add("myx");
        list.add("love");

        //下面的插入，插入后的数据的个数和之前的个数将会不同
        //Error：报错
        /*
        for(Iterator iter= list.iterator();iter.hasNext();){
            String its=iter.next().toString();
            if("love".equals(its)){
                list.add("1314");//添加元素后导致list中的元素个数会发生变化，导致了modcount的值不等于expectedModcount

            }
        }
*/
        ListIterator listIterator= list.listIterator();

        for(ListIterator l_iter=list.listIterator();l_iter.hasNext();) {

            if(l_iter.next().equals("love")){
                l_iter.add(" 1314");

            }

        }
        System.out.println(list);
    }
}
