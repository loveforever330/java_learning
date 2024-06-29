package List;
import java .util.ArrayList;
import java.util.List;
public class ListTest01 {

    public static void main(String[] args) {
        //多态的思想
        //addTest();
        //移除掉对象
        //removeTest();
        //转换掉一个对象
        //setTest();
        //获取对应的对象；
        //getTest();
    }

    private static void getTest() {
        List list=new ArrayList();
        list.add("12");
        list.add("wq");
        list.add("ww");
        list.add("fer");

        System.out.println(list.get(2));
    }

    private static void setTest() {
        List list=new ArrayList<>();
        list.add("abc");
        list.add("zjk");
        list.add("1");
        list.add("2");
        list.add("4");

        list.set(1,"jck");

        System.out.println(list);
    }

    private static void removeTest() {
        List list=new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        list.remove(0);
        System.out.println(list);
        list.remove("c");
        System.out.println(list);
    }

    private static void addTest() {
        List list=new ArrayList();//多态，实现了list的一个类
        //
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        //通过下标来添加元素的话,索引值要求要>=0,同时<集合.size();
        //这样子才不会报错，添加成功

        list.add(1,"zjk");
        System.out.println(list);
    }
}
