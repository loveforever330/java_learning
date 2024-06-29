package Singleton;


/**
 * 保证软件在运行的时候，运行时，某个类在内存中只有一个对象
 *单例模式
 * 饿汉式的写法
 *
 */
public class SingletonTest01 {
    public static void main(String[] args) {

        //不管外部有没有使用它，依然会创建
        Singleton s1=Singleton.getInstance();
        Singleton s2=Singleton.getInstance();
        System.out.println(s1==s2);
    }
}
class Singleton{
    //1.方法私有化
    private Singleton() {

    }

    //2.创建当前的对象的引用数据类型
    private volatile static Singleton s=null;

    //3.判断当前对象是否为Null

    //对外要提供公共的同步方法，访问方法，将对象暴露给外部

    public synchronized  static Singleton getInstance() {
        if(s==null){
            s=new Singleton();//有可能t1和t2两个进程都进入到这个里面，可能发生死锁的问题


        }
        return  s;
    }
}




//
//class Singleton{
//    //1.构造方法私有化,防止这个类在类的外部创建新的对象
//
//    private  Singleton(){
//
//    }
//    //2.创建当前类的对象
//
//    private static Singleton s=new Singleton();
//
//    //3.创建公共方法，将类的对象暴露给外部
//    public static Singleton getInstance(){
//        return  s;
//
//    }
//}