package Thread_Protect;

/**
 * 守护线程的操作
 */
public class Thread_Daemon {
    public static void main(String[] args) {
        Thread t1=new Thread(){
            @Override
            public void run() {
                for (int i = 0; i <100 ; i++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("守护线程");

                }
            }
        };
        Thread t2=new Thread(){
            @Override
            public void run() {
                for (int i = 0; i <10 ; i++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("非守护线程");

                }
            }
        };

        //将t1设置为守护线程
        t1.setDaemon(true);
        t1.start();
        t2.start();

        //当非守护线程结束的时候，守护线程也就结束了，即使守护线程循环次数远远大于非守护线程

    }
}
