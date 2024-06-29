package moreThread;

public class communication {

    /**
     * 两个线程之间的通信
     * 让两个线程交替的在控制台输出文字
     */

    public static void main(String[] args) {


        Print p = new Print();

        Thread t1 = new Thread() {
            public void run() {
                while (true) {
                    p.print1();
                }

            }
        };

        Thread t2 = new Thread() {
            public void run() {
                while (true) {
                    p.print2();
                }
            }
        };

        t1.start();
        t2.start();
    }


}

class Print {
    private int flag = 1;

    public void print1() {
        synchronized (this) {
            if (flag != 1) {
                //让当前线程进入等待状态
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("print 1的方法");
            flag = 2;
            //随机的唤醒单个等待的线程
            //除非唤醒
            this.notify();
        }
    }

    public void print2() {
        synchronized (this) {//以下的全部代码则必须不在同一块一起运行

            if (flag != 2) {
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("print 2的方法");
            flag = 1;
            this.notify();
        }
    }
}