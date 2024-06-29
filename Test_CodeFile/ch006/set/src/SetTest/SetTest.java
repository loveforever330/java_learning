package SetTest;

import java.util.HashSet;
import java.util.Set;

/**
 * set的特点：元素不能够重复，没有索引，无序，存储顺序不一定
 *
 */
public class SetTest {
    public static void main(String[] args) {
            Set<String> set=new HashSet<>();
            boolean b1=set.add("a");
            boolean b2=set.add("a");//false,无法加入
        System.out.println(b2);
            set.add("f");
            set.add("a");
            set.add("c");
            set.add("e");
            set.add("q");
            //set遍历的是无顺序的，不是按照存入的顺序的

        System.out.println(set);
    }
}
