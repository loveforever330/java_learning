package override;

public class Main {
    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.eat();
        cat.sleep();
        Dog dog=new Dog();//静态方法没有必要或者说与设计初衷相违背，所以不会存在重写的情况。
        dog.eat();
        dog.sleep();
    }
}
