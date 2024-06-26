package test_super;

public class Dog extends Animal
{
    String name;
    public Dog(){
        super("黄色","藏獒","ab");                //未加这个显式调用的时候，其值为null
        System.out.println("dog的构造方法内容");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void m1(){
        System.out.println(this.name);//自身的名字
        super.m1();//调用父类的函数值
    }
}
