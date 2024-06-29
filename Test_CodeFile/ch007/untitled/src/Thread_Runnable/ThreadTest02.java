package Thread_Runnable;


/**
 * 1.自定义一个类来实现java.lang下的runnable接口
 * 2.重写run方法
 * 3.将要在线程中执行的代码编写在run方法中
 * 4.创建上面的自定义类的对象
 * 5.创建Thread对象并将上面自定义的对象作为参数传递给Thread的构造方法
 * 6.调用start方法来启动线程
 */
class MyRunnable implements Runnable{
    @Override
    public void run() {
        //3.将要执行的代码写入
        for (int i = 0; i < 10; i++) {
            System.out.println("MoMo");
        }
    }
}
public class ThreadTest02 {
    public static void main(String[] args) {//这里是使用runnable来实现多线程的操作
        MyRunnable m_r=new MyRunnable();
        Thread thread=new Thread(m_r);
        thread.start();
        for (int i = 0; i <10 ; i++) {
            System.out.println("Zjk");
        }
    }

}
