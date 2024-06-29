package map;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1001,"MoMo");
        map.put(1002,"Genco");
        map.put(1003,"zjk");
        map.put(1004,"myx");

        String s1=map.put(1001,"zjk");//返回的值是前一个的对应的value值，如果原本就存在的话
        String s3=map.put(1008,"Mo");//返回值是null；

        String s2=map.put(1001,"Momo");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);//比如这里原本没有key-value的存储，所以值为null

        System.out.println(map.containsKey(1003));//包含传入的值
        System.out.println(map.containsValue("myx"));//包含传入的名称
        System.out.println(map.size());


    }



}
