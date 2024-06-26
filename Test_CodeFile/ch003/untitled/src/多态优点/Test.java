package 多态优点;

public class Test {
    public static void main(String[] args) {
        Person james=new Person();
        Benz benz=new Benz();
        james.drive(benz);
        BMW bmw=new BMW();
        james.drive(bmw);//？每一个都需要多写一个，结果会很麻烦，所以将person类里面的修改为多态

        /**
         * 多态的优点：提高代码的扩展性，同时对传入的参数范围更广。
         */
    }
}
