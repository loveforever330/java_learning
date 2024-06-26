package Testfinal;

public class FinalTest01 {
    public final  int k=10;//这里必须要对其进行初始化的工作

    public static  final double PI=3.14;//这里是常量，并且这个这里的标识符需要大写



    public static void main(String[] args) {
        final int i=10;
        //i=20;//Error:无法被修改

    }
}
//final  class A{
//
//}
//class B extends A{
//        //Error:无法被继承
//}
//class C{
//    public final void m1(){
//
//    };
//}
//class D extends  C{
//    public void m1(){//Error：无法被重写这个函数的内容
//
//    }
//}
//

