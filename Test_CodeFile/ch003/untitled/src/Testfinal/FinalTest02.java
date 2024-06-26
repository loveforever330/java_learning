package Testfinal;

public class FinalTest02 {
    public static void main(String[] args) {
        final Customer c1=new Customer("张三",20);
    //    c1=new Customer("李四",15);//Error:引用的对象不可以改变，但是对象的值可以改变
        c1.name="李四";
        c1.age=20;
        System.out.println(c1.name+c1.age);//这里的值是可以改变的
    }
}
class Customer{
    String name;
    int age;

    public Customer(String name,int age){
        this.name=name;
        this.age=age;
    }
}
