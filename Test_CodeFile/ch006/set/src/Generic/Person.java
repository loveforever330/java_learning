package Generic;


/**
 * Person类
 *
 */
public class Person implements Comparable<Person>{

    private String name;
    private int age;

    public Person() {

    }

    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // 重写toString方法，否则不会输出我们需要的内容
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }

    //重写equals方法
    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj instanceof Person){
            Person p = (Person)obj;
            if(this.name.equals(p.getName()) && this.age == p.getAge()){
                return true;
            }
        }

        return false;
    }


    @Override
    public int hashCode() {
        //return 10;//效果不太好，等于是执行了十多次
        //return this.age;//利用age的方法计算，即将相同的age来处理
        final int prime=31;//31是个质数，可以得到散列均匀，同时也是2的5次方-1
        //发现刚好是0~31，总共有32,如果视为2个字节
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;

    }

    public void show(){
        System.out.println("name: "+this.name+" age: "+this.age);
    }

    @Override
    public int compareTo(Person o) {
        //先根据年龄排序

        int num=this.age-o.getAge();
        //如果年龄相等的话，再根据姓名排序
        if(num==0){
            num=this.name.compareTo(o.getName());
        }

        return num;

    }
}

