package override;

public class Cat extends  Animal{
    @Override
    public void eat() {
        System.out.println("吃猫粮");
    }

    @Override
    public void sleep() {
        System.out.println("不睡觉");
    }
}
