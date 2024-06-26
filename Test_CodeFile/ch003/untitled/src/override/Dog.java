package override;

public class Dog extends Animal {
    @Override
    public void eat() {//这里不可以使用权限不一致的去进行重写的操作
        System.out.println("吃狗粮");
    }

}
