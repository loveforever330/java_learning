package Thread_Callable;


import java.util.concurrent.*;

/**
 * 使用Callable创建线程步骤：
 * 1.自定义一个类实现java.util.concurrent包下的Callable接口
 * 2.重写call方法
 * 3.将要在线程中执行的代码编写在call方法中
 * 4.创建FutureTask对象
 * 5.将自定义类的对象传入FutureTask构造方法里面
 * 6.创建Thread线程对象
 * 7.将FutureTask对象传入Thread构造方法中
 * 创建Callable的实现类，其中的泛型Integer是call方法的返回值类型：
 */
class MyCallable implements Callable<Integer>{
    //2.重写call方法
    private int count;

    public MyCallable(int count) {
        this.count = count;
    }

    //对比run:方法，无返回值，无抛出异常
    // 阶乘
    @Override
    public Integer call() throws Exception {
        //这里写count的代码即可
        int sum = 1;
        if(count!=0){
            for (int i = 1; i <=count ; i++) {
                sum*=i;
            }
        }
        else {
            return  sum;
        }
        return sum;
    }
}
public class Thread_Test03 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //4.创建线程池
        ExecutorService executorService= Executors.newFixedThreadPool(2);
        //也可以使用CachedThreadPool线程池,这里将会根据任务的数量来进行分配，但如果线程过大，会有问题
        ExecutorService executorService_Cache= Executors.newCachedThreadPool();

        //5.将自定义的线程放入线程池子中
        Future<Integer> f1=executorService.submit(new MyCallable(3));
        Future<Integer> f2=executorService.submit(new MyCallable(5));

        //6.获取线程结束后返回的结果内容
        System.out.println(f1.get());
        System.out.println(f2.get());

        //判断线程池中的任务是否返回或执行完毕
        if(f1.isDone()){
            System.out.println(f1.get());
        }else {
            System.out.println("f1尚未执行完毕");
        }

        if(f2.isDone()){
            System.out.println(f2.get());
        }
        else {
            System.out.println("f2内容尚未执行完毕");
        }



        //main方法结束
        System.out.println("Main方法结束");

        //7.关闭线程池
        executorService.shutdown();



    }


}
