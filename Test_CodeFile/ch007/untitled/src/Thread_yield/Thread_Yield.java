package Thread_yield;


/**
 * 线程礼让的部分
 */
public class Thread_Yield {
    public static void main(String[] args) {
        Thread t1=new Thread() {
            public void run() { //方法的重写

                for (int i = 0; i < 100; i++) {
                    System.out.println("leader");
                }
            }
        };

        Thread t2=new Thread(){
            @Override
            public void run() {
                for (int i=0;i<100;i++){
                    if(i%2==0){
                        //线程上进行礼让
                        Thread.yield();//线程的礼让操作，但礼让的时间未设置
                    }
                    System.out.println("mentor");
                }
            }
        };

        t1.start();
        t2.start();
    }
}
