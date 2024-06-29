package LinkList;

import java.util.LinkedList;

public class LinkLIst_test {
    public static void main(String[] args) {
        //底层基于链表的方式来实现的，所以可以很方便的进行增删改查的操作
        LinkedList Link_list=new LinkedList<>();
        Link_list.add("ada");
        Link_list.add("dw");
        System.out.println(Link_list);
        Link_list.addFirst("123");
        System.out.println(Link_list);
        Link_list.addLast("myx");

        Link_list.set(2," zjk");
        System.out.println(Link_list);
        System.out.println(Link_list.get(2));
    }
}
