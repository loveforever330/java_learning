package ReenTrantLock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

class Print2 {

    //添加互斥锁对象
    private ReentrantLock r=new ReentrantLock();
    //使用监视器
    //有几个进程创建几个
    private Condition c1= r.newCondition();
    private Condition c2= r.newCondition();
    private int flag = 1;

    public void print1() {
            r.lock();
            if(flag != 1) {
                //让当前线程进入等待状态
                try {
                    c1.await();//c1等待状态
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("print 1的方法");
            flag = 2;
            //唤醒c2等待的线程
            c2.signal();
            r.unlock();
    }

    public void print2() {
            //在开始同步的时候上锁即可
            r.lock();
            if(flag != 2) {
                try {
                    c2.await();//睡眠线程，等待
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("print 2的方法");
            flag = 1;
            c1.signal();//唤醒线程
            r.unlock();
        }

}