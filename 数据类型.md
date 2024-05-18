# Java 语言基础
## 关键字与标识符
+ 标识符往往用于命名，数字，字母和下划线组成，注意不可以以数字开头，而且要和```关键字```区别,关键字是java中用于定义的部分。  
  
    
+ ```变量```: 便于访问内存来提取对应的相同的字面值，以此来避免多次重复的提取
> //两种定义方式  
> 数据类型 变量名=变量值；  
```java

public class ValTest{
    public static void main(String[]  args){
        int i=10;//表示的含义是 开辟一块内存空间，命名为i，其中存储的值为10
        System.out.println("a");//print 为10
        //int i=18; 会报error,由于已经定义了一块命名为10的内存空间，导致了重复声明，编译器会报错


    }
}
```  
> 编译器报错，则修改变量值的时候不需要去重新的声明内存空间，同一个域中，即为同一个（）中的话，也不可以重复的命名变量

```java 
int a1,a2,a3=4;//这样只有a3会被成功的赋值
System.out.println(a1);
System.out.println(a2);
System.out.println(a3);
//编译的时候编译器报错，未能够初始化a2，导致错误出现

```  
>而且需要及时初始化变量的内容，否则编译器会报错。初始化的方式要找对  
---
## 2.1 几类基本数据类型  
### 整型

+ ```byte```:  1个字节 =8位
+ ```int```:   4个字节 =32位
+ ```long``` : 8个字节 =64位
+ ```short```: 2个字节 =16位
>
```java 
public class Test{
    public static void main(String[] args)
    {
        int a=1;
        long b=888;
        long c=214141011L;
        a=(int)c;//这种方式才可以实现类型转换，error a=c;
        
        byte d= 127;//只要不超过byte的可以取的范围，都可以取到，
        //error:byte d=128;这样的会报错
        short e= 32767;
    }
}
```
>
+ 长整型在赋值的时候最后的赋值末尾需要加上L,否则java编译时报错，默认是当作int型来看待，```a=213L```

>java中程序默认会把整型的字面值当做int 类型
>>不能是直接~~a=b~~，从容量小的可以自动类型转换到容量大的，容量大的需要强制类型转换到容量小的，```a=(int)b;```这种转换才会有效。
---
### 浮点型
+ ```float```:四个字节
+ ```double```：八个字节
>注意float的赋值最后需要加上f,而且强制类型转换依然类似，容量大的向容量小的转化需要强制类型转换才可以。
```java
public class DataType02{
    public static void main(String[] args){

        //java默认使用的是double类型，如果使用float类型，赋值的末尾需要加上f；
        double a= 1.4；
        float b= 3.19f；
        b=(float)a;//依然容量大的向容量小的转化需要强制类型转换

    }
}
```
---
### 布尔型
>
用于逻辑运算和条件判断
+ ```True```
+ ```False```
>
```java
public class DataType04{
    public static void main(String[] args){

        boolean flag = true;
        if(Flag){
            System.out.println(True);
        }
        else{
            System.out.println(False);

        }
    }
}
```
---

### 字符型
+ 这部分以一段代码为例，其中需要注意要区分清楚字符和字符串这是两种不同的数据类型
+ >String类型```"absd"```,char类型```"a"```,即使是```"ab"```也是字符串类型。
>
```java
public class DataTypeTest{
    public static void main(String args[]){
        char c1="a";
        char c2="小";
        //error: char c3="ab",这种为字符串，如果编译的话编译器会报错
        char c3= 97;
        char c4= 98;//按照ascII码表的形式
        System.out.println(c3);
        System.out.println(c4);
        //这里的话将会输出a,b，将输出ASCII码表数字对应的字符的内容
        
    }
}
```
>
+ <ins>转义字符<ins>
> 形如```'''```的字符，本质上是想要将```单引号:'```赋值到声明的内存空间，可是编译器往往会识别到多个符号，这里我们采用转义字符的方式,```"\'"```，加入\转义字符即可  

+ <ins>值得注意的是，文件读取时的路径往往也会采用\转义字符加上\的方式来导入路径<ins>
>举例如下：  
>> D:\GENCO\Project,java编译器无法识别路径，此时会将其修改采用D：\\\GENCO\\\Projec,这样的路径格式来处理
  
### 各种数据类型的小总结
```java
public class DataTypeTest{

    public static void main(String[] args){

        byte a=8;
        byte b=10;
        //byte c=a+b; error：这里会报错类型转换会有损失
        //因为a和b整型默认就是使用int，那么这里其实计算机理解的就是int a加上int b，然后把值赋给c
        byte c=(byte)(a+b);


        byte d1=9;
        short d2=10;
        int i=d1+d2;
        System.out.println(i);
        //主要是因为整型一开始均是声明为int做计算，而且从容量小的到容量大的可以自动类型转换
        
        /*
            针对字符类型
        */
       char c1='a'; //ASCII码表对应的值为97;
       byte c2=100;
       int f=c1+c2;
       //则此时的f被赋的值为197;
       
    }
}
```
#### 总结
+ > 自动强制类型转换发生在容量小向容量大的转换，对于其中的类型转换有如下大小顺序
+ <ins>byte<short(char)<int<long<float<double 
+  除了boolean之外都可以相互之间做转换