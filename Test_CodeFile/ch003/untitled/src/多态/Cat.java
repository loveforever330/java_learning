package 多态;

public class Cat extends Animal{
    public int num =20;

    @Override
    public void eat() {
        System.out.println("猫在吃");
    }
    public void move(){
        System.out.println("猫走路轻");
    }
}
