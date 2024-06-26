package test_super;

public class Main {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.setName("旺财");//这里的将是把名称赋给对应的，一输出该对象的名称，但是可以在构造s的时候赋值给其父类，调用显式构造函数
        dog.m1();   //这里调用的祖先类在构造时，显式调用的是构造名字为ab,这里print出来的是animal这个父类对其赋的名字
        System.out.println(dog.name);//这里就可以发现很有趣，set设置的是构造完毕的，狗的名称是旺财
        System.out.println(dog.color);//这里是父类的
        System.out.println(dog.catagory);//这里是父类的


    }
}
