package Thread_object;

public class ThreadObject {

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                //获取当前的线程的对象
                //System.out.println(Thread.currentThread().getName());
            }
        }).start();

        //主线程名字
        System.out.println(Thread.currentThread().getName());//主线程是main
    }
}
