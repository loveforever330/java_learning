package Thread_匿名;

import java.util.concurrent.*;

public class Thread_Test04 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //创建Thread对象
        new Thread(){//创建对象
            public void run(){
                    for (int i=0;i<10;i++)
                    {
                        System.out.println("MoMo");
                    }
            }
        }.start();

        //runable
        new Thread(new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 102; i++) {
                    System.out.println("ZJk");
                }
            }
        }).start();

        //Callable方法

        ExecutorService es= Executors.newFixedThreadPool(3);

        Future<Integer> f1=es.submit(new Callable<Integer>() {//往线程池里面添加对应的任务
            @Override
            public Integer call() throws Exception {//线程池里面重写call方法

                return 10245;//返回一个数值
            }
        });//这里可以用Future对象来接收，或者采用get直接获取即可
        System.out.println(f1.get());
        System.exit(0);
    }

}
