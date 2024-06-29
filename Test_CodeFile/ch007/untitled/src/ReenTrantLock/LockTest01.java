package ReenTrantLock;
//使用ReTrantLock唤醒指定的线程

public class LockTest01 {

    public static void main(String[] args) {
        Print2 p2=new Print2();
        //实现交替进行，答案没有问题！
        Thread t1=new Thread(){
            @Override
            public void run() {
                while (true)p2.print1();
            }
        };

        Thread t2=new Thread(){
            @Override
            public void run() {
                while (true) p2.print2();
            }
        };


        t1.start();
        t2.start();
    }

}
