package SetTest;

import Generic.Person;

import java.util.HashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Person> personSet=new HashSet<>();
        personSet.add(new Person("zhang san",12));
        personSet.add(new Person("zjk",20));
        personSet.add(new Person("myx",21));
        personSet.add(new Person("myx",21));
        //这里发现即使myx，21的值一样，发现元素一样了,没有调用equals方法



        System.out.println(personSet);
    }
}
