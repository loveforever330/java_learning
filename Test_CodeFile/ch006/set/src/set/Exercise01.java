package set;

import java.util.HashSet;
import java.util.Random;

/**
 * 生成10个1~20的整数，同时这些数字不能够重复
 *
 */
public class Exercise01 {

    public static void main(String[] args) {
        HashSet<Integer> h =new HashSet<>();
        Random r=new Random();
        while (h.size()!=10){
            //  随机生成1~20之间的整数
            int i=r.nextInt(20)+1;
            h.add(i);//这里添加的就都会是不同的元素

        }
        for(Integer s:h) {
            System.out.println(s);
        }
    }
}
