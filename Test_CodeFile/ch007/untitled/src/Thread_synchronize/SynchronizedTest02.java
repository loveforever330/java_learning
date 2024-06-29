package Thread_synchronize;

public class SynchronizedTest02 {
    public static  long begin1;
    public static  long end1;
    public static  long begin2;
    public static  long end2;

    public static void main(String[] args) {
        LongTask longTask=new LongTask();

        Thread t1=new Thread(){
            @Override
            public void run() {
                begin1=System.currentTimeMillis();
                //执行耗时较长的任务方法
                longTask.change_num(true);
                end1=System.currentTimeMillis();


            }
        };


        Thread t2=new Thread(){
            @Override
            public void run() {
                begin2=System.currentTimeMillis();
                //执行耗时较长的任务方法
                longTask.change_num(false);
                end2=System.currentTimeMillis();
            }
        };

        t1.start();
        t2.start();


        try {
            Thread.sleep(10000);//主线程睡眠一段时间，保证完成
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        //下面是计算两个线程共花费的时间
        long begin=0;
        long end=0;

        if(begin1>begin2){
            begin=begin2;
        }
        else {
            begin=begin1;
        }

        if(end1>end2){
            end=end1;
        }
        else {
            end=end2;
        }

        System.out.println("两个线程耗时为： "+(end-begin)/1000+"秒");

    }


}
