### 提高代码的复用性
+ Method，其实类似于c里面的函数,
>
Method 的具体内容
 >方法: 修饰符 返回值类型 方法名称(参数类型 参数1,参数类型 参数名2....){         
        方法体语句;  
        return 返回值;  
    }
>
```java
class Method1{

    public static void main(Stirng[] args){


        sumInt(10,15);
        sumInt(12,18);
        int sum2=sumInt1(19,20);
    }

    public static void sumInt(int a,int b){//单词首字母小写，后面的单词的首字母大写,这里即为一个method方法
        int sum=a+b;//方法体的语句
        System.out.println(sum);
                                    /*无返回值的方法，使用void*/
    }
    //有返回值的方法，使用int类型为例
    public static int sumInt1(int a,int b){

        int sum=a+b;
        return sum;
    }

}
```

+ 定义方法，可以减少冗余，提高代码上的可执行性与可复用性,利于程序的修改
##  Method的执行与执行顺序
```java
class Method{

    public class static void main(String[] args){
    //跨类调用的话，需要指明类名之后加上.,再加上method名,如下
    Method1.m2();//这样即可调用
    m2();//error:会报错，找不到该方法
/*
    但如果是自己本类里面的方法就不会有这些问题,下面的两种方式均可
*/
    Method.m1();
    m1();//两种调用的方式均可
    

    
    }
    public static void m1(){

        System.out.println("m1");

    }

}
class Method1{ //这是另外的一个类
    public static void m2(){

        System.out.println("Method1里面的方法");
    }
}


```
+ 方法的执行顺序  
  +  从main方法里面，由上往下，自上而下的执行
   
```java
class MethodTest{
    public static void m(){
        System.out.println("m");
    }
    public static void m1(){
        System.out.println("M");

    }
    //避免像下面类似的方法调用,这样会出现为StackoverFlow的错误
    public static void m2(){
        m3();
    }    
    public static void m3(){
        m2();
    }




    public static void main(String[] args){
        /*调用方式是按照从上往下的方式来调用的,先调用m1,再调用m;
        */
        m1();
        m();
    }
}




```
>值得注意的是，return是用于结束方法的，写在return后面的，即为return方法后面的方法是不会被执行的，语句到return的时候，会直接结束
```java
//这种method，即使传参了m1(1),类似于这种的话，会有报错method没有返回值的错误

public static boolean m1(int i){
    if(xx){
        return ture;
    }
    return false;//必须保证程序里面一定有一个 return的东西
}
```
### method的方法重载的相关知识

+ 对其的方法进行重载的操作，经常会有不同类型，但是方法体里面的内容或者说做法是具有一致性的,这时候我们会用到方法的重载
```java
//方法的重载
//overload
class  MethoOverload{
/*
    方法重载的条件 
    1.在同一个类里面
    2.方法名相同
    3.参数列表不同(参数的类型，个数，顺序)

*/
    public static void main(String[] args){

    }
//参数的个数不一致
  public static void m1(){};
  public static void m1(int i){};

//参数的类型不同
  public  static void m2(int i){};
  public  static void m2(long l){};
/*  参数的顺序不同，但实际开发中往往不会这么使用
    方法名重名，这样不行，会报错
    重载和返回值类型，修饰符之间没有关系 比如：public static void 或public static int或public int这些不构成重载
*/
}
```

+ 重载示例如下
>
```java
package com.monkey1024;

public class MethodOverload {
    public static void main(String[] args) {    //实现重载功能的代码
        System.out.println(sum(10,12));
        System.out.println(sum(12.4f,14.8f));
        System.out.println(sum(14231L,2131231L));
    }
    public static  int sum(int a,int b){
        return a+b;

    }
    public static  float sum(float a,float b){
        return a+b;

    }
    public static  long sum(long a,long b){
        return a+b;

    }
}


```
### 对于递归的理解
+ 自己调用自己，注意要有终止条件，否则出现StackOverFlow的问题

>
```java
public class Loop {
public static void main(String[] args) {
    int n=5;
    int result1=sum1(n);        
        System.out.println(result1);
    }
 public static  int sum1(int a){
        if(a==1){                   //终止条件
            return 1;  

        }
        else{                       //迭代条件
            return a+sum(a-1);
        }
    }
}
```
>

