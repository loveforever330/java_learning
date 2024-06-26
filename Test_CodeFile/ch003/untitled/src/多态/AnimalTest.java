package 多态;

public class AnimalTest {
    public static void main(String[] args) {
        Cat cat_1=new Cat();
        cat_1.eat();

        Animal animal_1=new Cat();//父类引用指向子类对象，我指着这只猫说这是一只动物，自动类型转换，向上转换
        animal_1.eat();//动态绑定和静态绑定，这里类似于重写
        //编译阶段  当作animal的方法
        //运行时，发现实际是cat的方法，所以动态绑定到猫上
        System.out.println(animal_1.num);//成员变量不存在重写
        //animal_1.move();//Error；报错，无法进行调用

        //下面需要进行强制类型转换
        Cat c2=(Cat) animal_1;
        c2.move();//这样子就可以进行对应的调用工作了

        //下面的转型不可以这样转型
        Animal animal_2=new Dog();
        if(animal_2 instanceof Cat)//没有instance of的话，Error：这里会报错，因为Dog类型不是
        {Cat c3=(Cat) animal_2;}//堆上的对象是一个Dog对象和Cat对象二者之间不一样。
        else {
            System.out.println("animal_2不是一个引用类型");
        }



    }
}
