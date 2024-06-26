package Interface_test;

interface  A{
    public  static  final double PI=3.14;//可以不写static final,接口内的都是静态的文档

   public abstract void m1();//默认的方法都是抽象的，可以不用写

    //public abstract 是可以省去的
    void m2();

}

interface B extends A{
    void m3();
}

interface C extends A,B{//接口可以多继承

    void m4();
}
public class myclass extends Father implements A,B,C{//有点类似c语言的声明，这里都是一个类多继承接口，然后面向接口开发，写对应的实现的类
    @Override       //除了多继承接口之外，还可以去继承一个类。
    public void m4() {

    }

    @Override
    public void m1() {

    }

    @Override
    public void m2() {

    }

    @Override
    public void m3() {

    }
}