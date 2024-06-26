package father_ancestor;

public class student extends student_Father {//extends表示的是继承自父类
    public static void main(String[] args) {
        student s=new student();
        //s.m1();//error：这里不被允许调用，因为它的类型上是private
        s.m2();
        s.m4();//同样可以去调用祖先类中对应的方法内容，同样无法继承使用private类型的函数

    }
}
