##  面向对象的程序设计内容
+ 三大特征  
   
  + 继承
  + 多态
  + 封装

+  成员变量: 在类的内部，方法的外部定义的变量叫做成员变量
+  局部变量： 在方法的内部定义的变量叫做局部变量，之前的定义的都是局部的变量  

>
类的修饰符 class 类名 extends 父对象名称 implements   接口名称{  
      类体：成员变量和方法组成  
}
>

----
+ 相关代码的定义

```java

//对于类的定义
public class Student {
    //成员变量不需要初始化
    //学号
    int id;
    //姓名
    String name;
    //性别
    boolean sex;
    //年龄
    int age;
    //这里不用加static修饰，定义学习的方法
    public  void   study(){
        System.out.println("好好学习，天天向上");
    }
    public  void love(String name){
        System.out.println("A"+name+"恋爱");
    }
    public void takeExercise(String sport){
        System.out.println("在做"+sport+"运动");
    }

}
```

+ 上方是类和类的方法的定义,类里面的成员变量不需要初始化,写的类方法要有参数和修饰符

---------
```java

//Studen的调用的部分代码


public class StudentTest {
    public static void main(String[] args) {
        //创建对象 类名 对象名= new 类名();
        //对象名只要是合法的标识符

        Student a=new Student();
        //可以使用对象名。变量名的方式访问成员变量

        a.id=1001;
        a.name= "张三";
        a.sex=true;
        a.age=20;
        System.out.println(a.id+" "+a.name);
        System.out.println(a.sex?'男':'女');
        System.out.println(a.age);

        //通过对象名.方法名(参数名)
        a.study();
        a.love("zhao");
        a.takeExercise("basketball");

    }

}
```
+ StudentTest里面做调用,new一个对象Student()类,new 对象的时候,class Student类,定义一个类之后调用的初始化，可以直接Student();

## 成员变量与局部变量
+ 成员变量:写在类体的里面，方法的外面,声明时可以不需要初始化值,可以被本类或其他类的方法进行调用
+ 局部变量: 写在方法体的里面，声明时必须初始化,仅仅在局部变量里面调用
>
```java
public class Varible{
    int b;//成员变量
    pulic static void main(String[] args){
        int i=10;//局部变量

    }


}
```
>

---
>基本数据类型的初始化 ```byte```，```int``` ，```short```，```long```的初始化的值为0
```float```，```double```的默认值为0.0
```char```的默认值\u0000,
形如```String```的引用类型的为null


