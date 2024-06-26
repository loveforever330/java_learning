package AbstractClass;

public abstract class AbstractClass {
    public AbstractClass(){
        System.out.println("Class A");
    }
    public  abstract  void m1();     //抽象方法一定需要放在抽象类中去,如果不用抽象类的话，会导致错误。
                                //抽象方法没有对应的方法体。
    public static void main(String[] args) {
            //A a=new A();//抽象类不能被实例化
        AbstractClass a=new B();
        a.m1();
    }
}

class B extends AbstractClass{

    public void m1(){
        System.out.println("class B 中的m1()方法");
    }

    public B(){
        super();
        System.out.println("class B");
    }
}


