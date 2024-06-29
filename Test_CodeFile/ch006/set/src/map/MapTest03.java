package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest03 {

    public static void main(String[] args) {
        //map的自定义方法
        //封装成Entry
        Map<Integer,String> map=new HashMap<>();
        map.put(1001,"zjk");
        map.put(1002,"myx");
        map.put(1003,"momo");
        map.put(1004,"Genco");

        Set<Map.Entry<Integer,String>> EntrySet=map.entrySet();
        Iterator<Map.Entry<Integer,String>> iter= EntrySet.iterator();
        while (iter.hasNext()){
            Map.Entry<Integer,String> entry=iter.next();//使用map.entry即可实现
            
            Integer key=entry.getKey();
            String value= entry.getValue();
            System.out.println("键： "+key+"值： "+value);
        }
    }
}
