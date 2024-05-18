##  运算符在java中

```+,-,*,/,%```与c++一致,不过需要注意数据类型,特别是对于```/```的时候，特别需要注意数据类型是int类型或是其他类型，其中由于/会是默认整型的/法，输出的也会自动的是一个整型的结果，如果想要输出小数，除数必须是浮点型。

+ ++的作用与--的作用：  
    + 均为自增与自减的运算符号，同时对于其中的变量名的自增自减有一定的运算规则
    + a++意味着函数先使用a对应的变量与内存，之后再对a的数值做改变，++a意味着先对a的数值做改变，函数再进行调用;  
>
```java
public class DataType{
    public void static main(String[] args)
    {
        int a=10;
        int b=8;
        System.out.println(a++);//输出的会是10，先执行打印出来的会是10,
        System.out.println(a);//此时输出的则会是11，执行出来的值是11，因为上面进行了自增的运算
    }
}


```

>
+ 还有一个更加特殊的例子：
>
```java
public class DataType{

    public void main(String[] args){

        int i=10;
        int j=i++;//这里非常有趣，因为程序的运算是从左往右的，所以这里先赋给j的其实是i=10，之后再进行++
        System.out.println(i);//输出的是11
        System.out.println(j);//输出的是10
        //如果是j=++i;先做了对i的++操作，之后才会是对j的赋值的操作
        j=++i;
        System.out.println(i);//输出的是12
        System.out.println(j);//输出的是12

    }
}
```
>


### 面试题小练习
>
```java
public class DataType{

    public void main(String[] args){

        int a=10;
        int b=10;
        int c=10;
        a=b++;
        c=--a;
        b=++a;
        a=c--;
        System.out.println("a="+a," b="+b," c="+c," d="+d);
        //可以知道输出为a=9,b=10,c=8
        /*
            b=11,a=10;
            c=9,a=9;
            b=10,a=10;
            a=9,c=8
        */
    }
}
```
>
>
```java
//特例
int i=0;
i=i++;
System.out.println(i);//这里的i不会发生自增
```
>
### 赋值运算符号
+ 较为简单，+=，/=，*=，%=，即为将左边的变量与右边的变量做一个运算之后，将其赋值给左边的变量
>
```java
a+=2;//表示的为a=a+2;
a/=2;//表示的为a=a/2;
a%=2;//表示的为a=a%2;
a+=b;//含义为a=a+b
byte b =10;
b+=10;//可以这样来写，说明扩展的不改变原有的数据类型，这样写会损失精度
``` 
>
以上的内容均不改变原有的数据类型，否则会损失精度

```==```,```!=```,```>=```,```<=```,```<```,```>```,这些符号不再赘述


### Bool类型的符号
+ ```&&```:短路与 True&&True->True,True&&False->False,False&&True->False,同时遇到False之后不会继续执行True的部分
+ ```||```:短路或 True||False->True,True||True->True,False||False->False,同上
+ ```&```:与 True&&True->True,True&&False->False,False&&True->False
+ ```|```:或 True||False->True,True||True->True,False||False->False
+ ```!```:非 ！True->False
+ ```^```:异或 两边如果不一致皆为True，True^False->True
>多使用短路与和短路或，这样有问题最大效率的解决与排查

### 字符串连接运算符
使用的符号为```+```

+ 如果字符串的一边是数字，则会对其做数值上的加减的运算
+ 如果字符串的两边中的任意的一边是字符类型，那么做出的运算即为字符串的拼接类型。
### Bool类型的运算符
 ```java
 Boolean xx?xy:xz;//表示的含义是如果表达式xx是True，则返回xy，如果是False，则会返回xz 
 ```
+ 对于其中的boolean 表达式?表达式一：表达式二；如果表达式为True的话，返回表达式一，为False返回表达式二
>
```java
public class DataType{
    public static void main(String[] args){
        int x=10;
        int y=20;
        int z;
        int z=(x>y)?x:y;//如果x>y的话，返回x，否则返回y。
        System.out.println(z);
    }
}


```
>小演示
```java
public class DataTypeTest00 {
    public static void main(String[] args) {
        int a=12,b=18,c=9;
        a=(a>b)?((c>a)?c:a):((c>b)?c:b);
        System.out.println(a);
    }
}
```
---
### 位运算符：直接操作二进制的文件
+ ```&```:按位与：有0则0
+ ```|```:按位或：有1则1
+ ```^ ```:按位异或 ：相同则0，不同则1 
+ ```~```:取反
+ ```>>```:向右移：最高位为0，则左边补齐0，最高位为1，左边补齐1,向右边移动n位则意味着/2的n次方
+ ```>>>```:无符号右移
+ ```<<``` :向左移：12<<1，左移一位代表着输出的为24，12<<2,左移两位代表着输出为24,代表着左移n位就是原来的数*2的n次方.


> 一个有趣的题目：要求不使用第三个变量来事项两个变量的交换  
>
```java
public class DataType{
    public static void main(String[] args){
                //一个数据对另一个数据位异或2次，则这个数据的本身不会造成改变
                
        int a=10,b=8;
        a=a^b;
        b=a^b;//a^b^b,b=a;//位异或两次
        a=a^b;//a^b^a,a=b;//位异或两次

    }

}

```
>
### if else 与 switch这些由于大部分都已经学过，不再赘述
仅仅列出框架和内容
```java
//if与else
if(表达式){

}
else if{

}
else{

}

//switch的语句
switch(a){
    case 1:
    //表达式，表示a为1的时候的输出为
    break;
    case 2:
    //表达式
    break;
    case 3:
    case 4:
    case 5:
    //表达式，这样子的表示方法也是可以的，其中的3，4，5对应的就是这个表达式。
    break;
    default:
    //表达式：表示a没有匹配到的时候的输出为
    break;
}


```


<ins> 如果switch的里面没有break的话会造成case穿透，即为即使满足了要求的case条件但会接着向下面的case语句去执行<ins>

+ 可以没有default，同时switch的后面可以放byte，short，char，int类型的都可以，自动转成int的都可以，jdk1.7之后也可以放string类型的对象判断表达式。
