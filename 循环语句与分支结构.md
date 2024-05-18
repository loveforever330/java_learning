## 循环语句与for循环的嵌套
> 这里的内容由于自己已经有了了解，可以跳过。  
> 整体的for循环语句内容如下
```java
for(初始化的表达式；条件表达式;java语句内容)
```
+  执行初始化表达式，并且在整个的循环里面进行执行
+  将初始化的表达式的值在整个条件表达式中进行判断的工作
+  如果结果是True，则程序继续执行，如果为False，则循环执行结束，程序执行结束
+  为True,执行java语句
+  执行循环之后的表达式，程序回到第二步继续执行
## for循环的嵌套

+ 打印99乘法表的相关代码
```java

public class forTest {
    public static void main(String[] args) {
        for(int i=1;i<10;i++){
            for(int j=1;j<=i;j++){//这里嵌套式的循环
                System.out.print(i+"x"+j+"="+(i*j)+" ");
            }
            System.out.print("\n");
        }
    }
}

```

+ while 与do while 的区别   
+ 这里面的内容while与do while之间有着一定的区别，do while能够保证其一定可以执行一次，但while未必可以,for循环则和while类似,也不可以在不满足的时候执行一次
> 同时while之中定义的变量，仍然可以被访问到，但for循环如果写在```()```内部的话，循环的内容结束之后，for循环定义的变量会被及时的释放掉。
---
> 实际开发用for循环较多

### break与continue

+ ```break```
    在switch的语句里面，用来结束分支,默认结束离他最近的循环，这里是对于嵌套循环来说的

```java
  //展示break语句的作用，break退出嵌套是对于最近的for循环来说的，区别于return，return代表着退出这种方法method
  public class ForTest
{     
    public class static void main(string[] args){    
        outfor:for (int i=0;i<10;i++){
            innerfor:for(int j=0;j<i;j++){
                if(j==5){
                    break;
                }
                System.out.print("j="+j+", ");
            }
            System.out.print(i+"\n");
        }
    }
  }
```
结果为:
>
0  
j=0, 1  
j=0, j=1, 2  
j=0, j=1, j=2, 3  
j=0, j=1, j=2, j=3, 4  
j=0, j=1, j=2, j=3, j=4, 5   
j=0, j=1, j=2, j=3, j=4, 6    
j=0, j=1, j=2, j=3, j=4, 7   
j=0, j=1, j=2, j=3, j=4, 8    
j=0, j=1, j=2, j=3, j=4, 9  

+ 将break语句更改为return的话，结果为
>
0  
j=0, 1  
j=0, j=1, 2  
j=0, j=1, j=2, 3  
j=0, j=1, j=2, j=3, 4  
j=0, j=1, j=2, j=3, j=4, 5   
j=0, j=1, j=2, j=3, j=4,   
>
<ins>在这里return的作用上，是直接跳出一个main方法，不执行后续内容<ins>

如果把```break```语句更改为```break outfor```的语句的话，意味着跳出外层的循环，可以采用这种方式来确保指定需要跳出的循环内容.


### continiue的用法

+ 直接结束本次的循环，直接进入到下一个循环之中
```java
public class ContinueTest{
class Continue{
 outfor:for (int i=0;i<10;i++){
        infor:for(int j=0;j<i;j++){
                if(j==5){
                    continue ;
                }
                System.out.print("j="+j+", ");
            }
            System.out.print(i+"\n");
        }
    }
}
```
>结果为
0  
j=0, 1  
j=0, j=1, 2  
j=0, j=1, j=2, 3  
j=0, j=1, j=2, j=3, 4  
j=0, j=1, j=2, j=3, j=4, 5  
j=0, j=1, j=2, j=3, j=4, 6      //可以直观的看到跳过了这个部分j==5的内容  
j=0, j=1, j=2, j=3, j=4, j=6, 7  
j=0, j=1, j=2, j=3, j=4, j=6, j=7, 8  
j=0, j=1, j=2, j=3, j=4, j=6, j=7, j=8, 9 

>