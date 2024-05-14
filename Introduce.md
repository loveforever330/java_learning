## 对于一个hello world的java程序解析  
```java
public class HelloWorld{
    public static void main(String[] args){
        
        System.out.println("Hello World!");
    }

}  
//同时可以定义class
class A
{


}

```  
+ ```public``` : 作为全局的含义。
+ ```class``` ：此时表示定义一个类。
+ ```static``` : 此时表示静态
+ ```void``` : 该函数没有返回值
+ ```main``` : 方法名，表示为程序的入口，该程序的参数为```String[] args```
+ ```public class```与```class```二者之间的区别：  
  一个java文件中只能有一个```public class```，而且要求和java文件名保持一致，```class```类的可以不需要和java文件名称一致，编译时自己会直接生成字节码。

  <ins> 上方的代码将会编译出 A.class与HelloWorld.class，每一个class生成对应的class字节码文件</ins>


## 
