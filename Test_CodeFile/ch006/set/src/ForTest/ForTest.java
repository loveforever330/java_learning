package ForTest;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ForTest {
    public static void main(String[] args) {
        List<String> l_ist = new ArrayList<>();
        l_ist.add("abc");
        l_ist.add("test");
        l_ist.add("great");
        //下面是使用增强for循环的方式,好处在于可以简化遍历
        for(String s:l_ist){
            System.out.println(s);
        }
        //普通for循环，注意要让索引去做自减的运算
        for(int i=0;i< l_ist.size();i++){
            if("b".equals(l_ist.get(i))){
                l_ist.remove(i);
                i--;
            }
        }//使用for循环的删除操作
        System.out.println(l_ist);

        //迭代器，可以删除，但是必须使用自身的remove方法，否则可能会出现异常
        //依然尽量使用迭代器的方式
        for(ListIterator<String> iter=l_ist.listIterator();iter.hasNext();){
            if("b".equals(iter.next())){
                iter.remove();//调用的迭代器的remove方法，不可以调用iter的

            }
        }
        //增强for循环不可被删除
        for(String s:l_ist){
            if ("b".equals(s)){
                l_ist.remove(s);
                //这里会报错，并发的修改异常，即当前减去了之后的值的个数，和原本的值的个数是不一致的
                //由此将会有报错的情况

            }
        }

    }



}
