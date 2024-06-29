package set;

import java.util.*;

/**
 * 问题：将List的元素去重
 * 分析：将LinkListHashSet中存取顺序一致和元素不能够重复的特点完成
 */
public class Exercise02 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("e");
        list.add("f");
        list.add("e");

        System.out.println(list);

        LinkedHashSet<String> link_hash=new LinkedHashSet<>();
        link_hash.addAll(list);
        list.clear();

        list.addAll(link_hash);
        for(String i:list){
            System.out.println(i);
        }

    }

}
