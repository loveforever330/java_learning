package Exercise;


import sun.font.TrueTypeFont;

/**
 * 练习：使用多线程程序模拟电影院的售票的过程，一共有100张电影票，将会有3个公司对外进行售卖
 * 分析：将100张电影票作为成员变量，定义开启三个线程开始执行，每当线程执行一次，票的总数减一
 */
public class Ticket implements Runnable{

    //100张电影票
    private  int count=100;//如果有人购票需要减1


    public int getCount() {
        return count;
    }

    @Override
    public void run() {
        while(true) {
            synchronized (this) {
                if (count <= 0) {
                    break;
                } else {
                    //将电影票总数做自减运算
                    count--;
                    System.out.println(Thread.currentThread().getName() + "卖出一张，剩余" + count + "张");
                }
            }
        }
    }
}
