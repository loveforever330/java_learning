package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest02 {
    public static void main(String[] args) {

        //遍历方式一
        Map<Integer,String> map=new HashMap<>();
        map.put(1001,"zjk");
        map.put(1002,"myx");
        map.put(1003,"momo");
        map.put(1004,"Genco");

        //将map中的key返回，获取map中的所有的key
        Set<Integer> Keyset=map.keySet();//查看set里面的对应的方法
        Iterator<Integer> iter=Keyset.iterator();
        while(iter.hasNext()){
            Integer key=iter.next();
            System.out.println(map.get(key));

        }


    }

}
